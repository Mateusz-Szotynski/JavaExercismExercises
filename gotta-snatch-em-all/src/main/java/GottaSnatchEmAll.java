import java.util.*;
import java.util.stream.Collectors;

class GottaSnatchEmAll {


    static Set<String> newCollection(List<String> cards) {
        return new HashSet<>(Set.copyOf(cards));
    }

    static boolean addCard(String card, Set<String> collection) {
        return collection.add(card);
    }

    static boolean canTrade(Set<String> myCollection, Set<String> theirCollection) {
        if (myCollection.isEmpty() || theirCollection.isEmpty()) return false;
        return !theirCollection.containsAll(myCollection) && !myCollection.containsAll(theirCollection);
    }

    static Set<String> commonCards(List<Set<String>> collections) {
        Set<String> commonElements = new HashSet<>(collections.getFirst());
        Set<String> copyOfCommonElements = Set.copyOf(commonElements);
        for (Set<String> set : collections) {
            copyOfCommonElements.forEach(e -> {
                if(!set.contains(e)) {
                    commonElements.remove(e);
                }
            });
        }
        return commonElements;
    }

    static Set<String> allCards(List<Set<String>> collections) {
        Set<String> allCards = new HashSet<>();
        collections.forEach(allCards::addAll);
        return allCards;
    }
}
