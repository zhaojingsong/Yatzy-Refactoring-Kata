package org.codingdojo.yatzy3;

import org.codingdojo.YatzyCategory;

public class CategoryScorerFactory {
    public static CategoryScorer createInstance(YatzyCategory category) {
        return switch (category) {
            case CHANCE -> new ChanceScorer();
            case YATZY -> new YatzyPointsScorer();
            case ONES -> new NumberScorer(1);
            case TWOS -> new NumberScorer(2);
            case THREES -> new NumberScorer(3);
            case FOURS -> new NumberScorer(4);
            case FIVES -> new NumberScorer(5);
            case SIXES -> new NumberScorer(6);
            case PAIR -> new RepeatedCountScorer(2);
            case THREE_OF_A_KIND -> new RepeatedCountScorer(3);
            case FOUR_OF_A_KIND -> new RepeatedCountScorer(4);
            case SMALL_STRAIGHT -> new StraightScorer(1);
            case LARGE_STRAIGHT -> new StraightScorer(6);
            case TWO_PAIRS -> new TwoPairsScorer();
            case FULL_HOUSE -> new FullHouseScorer();
        };
    }
}
