package org.codingdojo.yatzy3;

import org.codingdojo.YatzyCalculator;
import org.codingdojo.YatzyCategory;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Yatzy3 implements YatzyCalculator {

    @Override
    public int score(List<Integer> dice, YatzyCategory category) {
        return CategoryScorer.createInstance(category).calculateScore(dice);
    }
}
