package org.codingdojo.yatzy3.scorer;

import java.util.List;

public class YatzyPointsScorer extends AbstractCategoryScorer {
    @Override
    public int calculateScore(List<Integer> dice) {
        if (frequencies(dice).containsValue(5)) {
            return 50;
        }
        return 0;
    }
}
