package org.codingdojo.yatzy3.scorer;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class RepeatedCountScorer extends AbstractCategoryScorer {
    private final int count;

    public RepeatedCountScorer(int count) {
        this.count = count;
    }

    @Override
    public int calculateScore(List<Integer> dice) {
        Map<Integer, Integer> frequencies = frequencies(dice);
        for (int i : Arrays.asList(6, 5, 4, 3, 2, 1)) {
            if (frequencies.get(i) >= count) {
                return i * count;
            }
        }
        return 0;
    }
}
