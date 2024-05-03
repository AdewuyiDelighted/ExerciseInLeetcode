package leetcodeSpecial;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class FindPlayerWithZeroOrNoLosses {

    public static List<List<Integer>> findPlayerWithZeroOrNoLosses(int[][] matches) {
        List<List<Integer>> matchesList =  convertNestedArrayToNestedListInt(matches);
        List<Integer> winners;
        List<Integer> oneTimeLoser;
        winners = matchesList.stream().map(oneList -> oneList.get(0)).toList();
        oneTimeLoser = matchesList.stream().map(oneList -> oneList.get(1)).toList();

        winners = checkWinners(matchesList,winners);
        oneTimeLoser = checkOneTimeLoser(oneTimeLoser);
        matchesList.clear();
        matchesList.add(winners);
        matchesList.add(oneTimeLoser);

        return matchesList;
    }

    private static List<Integer> checkWinners(List<List<Integer>> matches, List<Integer> winners) {
        return winners.stream()
                .distinct()
                .filter(element -> matches.stream().noneMatch(input ->input.get(1).equals(element)))
                .sorted()
                .toList();

    }

    private static List<Integer> checkOneTimeLoser(List<Integer> losers) {
        return losers.stream().filter(player -> Collections.frequency(losers, player) == 1).sorted().toList();

    }


    private static List<List<Integer>>  convertNestedArrayToNestedListInt(int[][] inputs) {
        List<List<Integer>> nestedList = new ArrayList<>();
        for (int[] input : inputs) {
            nestedList.add(List.of(input[0], input[1]));
        }
        return nestedList;
    }
}
