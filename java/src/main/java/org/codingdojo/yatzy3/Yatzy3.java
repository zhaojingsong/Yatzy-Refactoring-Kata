package org.codingdojo.yatzy3;

import org.codingdojo.YatzyCalculator;
import org.codingdojo.YatzyCategory;
import org.codingdojo.yatzy3.factory.CategoryScorerFactory;

import java.util.List;

public class Yatzy3 implements YatzyCalculator {

    @Override
    public int score(List<Integer> dice, YatzyCategory category) {
        return CategoryScorerFactory.createInstance(category).calculateScore(dice);
    }
}
