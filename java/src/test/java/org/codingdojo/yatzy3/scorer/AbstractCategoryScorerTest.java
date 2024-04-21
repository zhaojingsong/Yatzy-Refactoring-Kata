package org.codingdojo.yatzy3.scorer;

import org.junit.jupiter.api.Test;

import java.util.Collections;
import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;

class AbstractCategoryScorerTest {

    final AbstractCategoryScorer someCategoryScorer = new AbstractCategoryScorer() {
        @Override
        public int calculateScore(List<Integer> dice) {
            return 0;
        }
    };

    @Test
    public void frequencies_shouldCountFrequencyWithEmptyList() {
        List<Integer> givenDice = Collections.emptyList();
        Map<Integer, Integer> expected = Map.of(
            1, 0,
            2, 0,
            3, 0,
            4, 0,
            5, 0,
            6, 0);

        Map<Integer, Integer> actual = someCategoryScorer.frequencies(givenDice);

        assertEquals(actual, expected);
    }

    @Test
    public void frequencies_shouldCountFrequencyWithListOfDice() {
        List<Integer> givenDice = List.of(1,2,3,4,5,6);
        Map<Integer, Integer> expected = Map.of(
            1, 1,
            2, 1,
            3, 1,
            4, 1,
            5, 1,
            6, 1);

        Map<Integer, Integer> actual = someCategoryScorer.frequencies(givenDice);

        assertEquals(actual, expected);
    }


    @Test
    public void frequencies_shouldCountFrequencyWithListOfDuplicatedDice() {
        List<Integer> givenDice = List.of(1,1);
        Map<Integer, Integer> expected = Map.of(
            1, 2,
            2, 0,
            3, 0,
            4, 0,
            5, 0,
            6, 0);

        Map<Integer, Integer> actual = someCategoryScorer.frequencies(givenDice);

        assertEquals(expected, actual);
    }
}