class Fighter {

    boolean isVulnerable() {
        return true;
    }

    int getDamagePoints(Fighter fighter) {
        return 1;
    }
}

// TODO: define the Warrior class
class Warrior extends Fighter {

    private final boolean isVulnerable = false;

    private final static int DAMAGE_TO_NOT_VULNERABLE = 6;
    private final static int DAMAGE_TO_VULNERABLE = 10;

    @Override
    boolean isVulnerable() {
        return isVulnerable;
    }

    int getDamagePoints(Fighter fighter) {
        return fighter.isVulnerable() ? DAMAGE_TO_VULNERABLE : DAMAGE_TO_NOT_VULNERABLE;
    }

    @Override
    public String toString() {
        return "Fighter is a Warrior";
    }

}

// TODO: define the Wizard class

class Wizard extends Fighter {

    private boolean isSpellInAdvance = false;
    private boolean isVulnerable = true;

    private static final int DAMAGE_WITH_SPELL = 12;
    private static final int DAMAGE_WITHOUT_SPELL = 3;

    void prepareSpell() {
        isSpellInAdvance = true;
        isVulnerable = false;
    }

    @Override
    boolean isVulnerable() {
        return isVulnerable;
    }

    @Override
    int getDamagePoints(Fighter fighter) {
        return isSpellInAdvance ? DAMAGE_WITH_SPELL : DAMAGE_WITHOUT_SPELL;
    }

    @Override
    public String toString() {
        return "Fighter is a Wizard";
    }

}
