import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Random;

class DnDCharacter {

    private final int strength;
    private final int dexterity;
    private final int constitution;
    private final int intelligence;
    private final int wisdom;
    private final int charisma;

    public DnDCharacter() {
        strength = ability(rollDice());
        dexterity = ability(rollDice());
        constitution = ability(rollDice());
        intelligence = ability(rollDice());
        wisdom = ability(rollDice());
        charisma = ability(rollDice());
    }

    int ability(List<Integer> scores) {
        List<Integer> listOfTheGreatests = scores.stream()
                .sorted(Comparator.reverseOrder())
                .limit(3)
                .toList();
        int sum = 0;
        for (Integer x : listOfTheGreatests) {
            sum += x;
        }
        return sum;
    }

    List<Integer> rollDice() {
        List<Integer> rolls = new ArrayList<>(4);
        Random random = new Random();
        for (int i = 0; i < 4; i++) {
            rolls.add((random.nextInt(6) + 1));
        }
        return rolls;
    }

    int modifier(int input) {
        return Math.floorDiv(input - 10, 2);
    }

    int getStrength() {
        return strength;
    }

    int getDexterity() {
        return dexterity;
    }

    int getConstitution() {
        return constitution;
    }

    int getIntelligence() {
        return intelligence;
    }

    int getWisdom() {
        return wisdom;
    }

    int getCharisma() {
        return charisma;
    }

    int getHitpoints() {
        int initialHp = 10;
        return initialHp + modifier(getConstitution());
    }
}
