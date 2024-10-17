import java.util.*;

class GottaSnatchEmAll {


    static Set<String> newCollection(List<String> cards) {
        return new HashSet<>(Set.copyOf(cards));
    }

    static boolean addCard(String card, Set<String> collection) {
        return collection.add(card);
    }

    static boolean canTrade(Set<String> myCollection, Set<String> theirCollection) {
        if (myCollection.isEmpty() || theirCollection.isEmpty()) {
            return false;
        }
        if (myCollection.size() > theirCollection.size()) {
            return theirCollection.stream()
                    .anyMatch(e -> !myCollection.contains(e));
        }
        return myCollection.stream()
                .anyMatch(e -> !theirCollection.contains(e));
    }

    static Set<String> commonCards(List<Set<String>> collections) {
        List<String> listOfPokemons = new LinkedList<>();
        collections.forEach(listOfPokemons::addAll);
    }

    static Set<String> allCards(List<Set<String>> collections) {

    }
}
