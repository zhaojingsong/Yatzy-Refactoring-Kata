package org.codingdojo.yatzy3.scorer;

import java.util.List;
import java.util.Map;

public class FullHouseScorer extends AbstractCategoryScorer {
    @Override
    public int calculateScore(List<Integer> dice) {
        Map<Integer, Integer> frequencies = frequencies(dice);
        if (frequencies.containsValue(2) && frequencies.containsValue(3)) {
            return sum(dice);
        }
        return 0;
    }
}
