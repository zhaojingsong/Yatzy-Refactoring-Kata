package org.codingdojo.yatzy3.scorer;

import java.util.List;

public class ChanceScorer extends AbstractCategoryScorer {
    @Override
    public int calculateScore(List<Integer> dice) {
        return sum(dice);
    }
}
