package org.codingdojo.yatzy3.scorer;

import java.util.List;

public class NumberScorer extends AbstractCategoryScorer {
    private final int number;

    public NumberScorer(int number) {
        this.number = number;
    }

    @Override
    public int calculateScore(List<Integer> dice) {
        return frequencies(dice).get(number) * number;
    }
}
