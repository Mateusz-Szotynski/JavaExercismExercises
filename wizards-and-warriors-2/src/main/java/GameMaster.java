public class GameMaster {

    // TODO: define a 'describe' method that returns a description of a Character
    public String describe(Character character) {
        return "You're a level " + character.getLevel() + " " + character.getCharacterClass() +
                " with " + character.getHitPoints() + " hit points.";
    }

    // TODO: define a 'describe' method that returns a description of a Destination

    public String describe(Destination destination) {
        return "You've arrived at " + destination.getName() + ", which has " + destination.getInhabitants() + " inhabitants.";
    }

    // TODO: define a 'describe' method that returns a description of a TravelMethod

    public String describe(TravelMethod travel) {
        String travelBy = travel.name().equals("WALKING") ? "by" : "on";
        return "You're traveling to your destination " + travelBy + " " + travel.name().toLowerCase() + ".";
    }

    // TODO: define a 'describe' method that returns a description of a Character, Destination and TravelMethod

    public String describe(Character character, Destination destination, TravelMethod travel) {
        return describe(character) + " " + describe(travel) + " " + describe(destination);
    }

    // TODO: define a 'describe' method that returns a description of a Character and Destination

    public String describe(Character character, Destination destination) {
        return describe(character) + " " + describe(TravelMethod.WALKING) + " " + describe(destination);
    }
}
