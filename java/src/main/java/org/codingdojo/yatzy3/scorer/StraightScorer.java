package org.codingdojo.yatzy3.scorer;

import java.util.List;

public class StraightScorer extends AbstractCategoryScorer {
    private final int straightIncludes;

    public StraightScorer(int straightIncludes) {
        this.straightIncludes = straightIncludes;
    }

    private boolean isStraight(List<Integer> dice) {
        return frequencies(dice).values().stream().filter(f -> f == 1).toList().size() == 5;
    }

    @Override
    public int calculateScore(List<Integer> dice) {
        if (isStraight(dice) && frequencies(dice).get(straightIncludes) != 0) {
            return sum(dice);
        }
        return 0;
    }
}
