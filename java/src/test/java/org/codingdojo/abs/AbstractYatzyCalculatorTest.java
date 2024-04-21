package org.codingdojo.abs;

import org.codingdojo.YatzyCalculator;
import org.codingdojo.YatzyCategory;
import org.codingdojo.yatzy2.Yatzy2;
import org.codingdojo.yatzy3.Yatzy3;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.stream.Stream;

import static org.codingdojo.YatzyCategory.*;
import static org.codingdojo.YatzyCategory.FULL_HOUSE;
import static org.junit.jupiter.api.Assertions.assertEquals;

public abstract class AbstractYatzyCalculatorTest {
    protected abstract YatzyCalculator getYatzyCalculator();

    @Test
    public void chance_scores_sum_of_all_dice() {
        YatzyCalculator calculator = getYatzyCalculator();
        assertEquals(15, calculator.score(List.of(2, 3, 4, 5, 1), YatzyCategory.CHANCE));
        assertEquals(16, calculator.score(List.of(3, 3, 4, 5, 1), YatzyCategory.CHANCE));
    }

    @Test
    public void yatzy_scores_50() {
        YatzyCalculator calculator = getYatzyCalculator();
        assertEquals(50, calculator.score(List.of(4, 4, 4, 4, 4), YatzyCategory.YATZY));
        assertEquals(50, calculator.score(List.of(6, 6, 6, 6, 6), YatzyCategory.YATZY));
        assertEquals(0, calculator.score(List.of(6, 6, 6, 6, 3), YatzyCategory.YATZY));
    }


    @Test
    public void test_1s() {
        YatzyCalculator calculator = getYatzyCalculator();
        assertEquals(1, calculator.score(List.of(1, 2, 3, 4, 5), YatzyCategory.ONES));
        assertEquals(2, calculator.score(List.of(1, 2, 1, 4, 5), YatzyCategory.ONES));
        assertEquals(0, calculator.score(List.of(6, 2, 2, 4, 5), YatzyCategory.ONES));
        assertEquals(4, calculator.score(List.of(1, 2, 1, 1, 1), YatzyCategory.ONES));
    }


    @Test

    public void twos() {
        YatzyCalculator calculator = getYatzyCalculator();
        assertEquals(4, calculator.score(List.of(1, 2, 3, 2, 6), YatzyCategory.TWOS));
        assertEquals(10, calculator.score(List.of(2, 2, 2, 2, 2), YatzyCategory.TWOS));
    }


    @Test

    public void threes() {
        YatzyCalculator calculator = getYatzyCalculator();
        assertEquals(6, calculator.score(List.of(1, 2, 3, 2, 3), THREES));
        assertEquals(12, calculator.score(List.of(2, 3, 3, 3, 3), THREES));
    }


    @Test

    public void fours() {
        YatzyCalculator calculator = getYatzyCalculator();
        assertEquals(12, calculator.score(List.of(4, 4, 4, 5, 5), FOURS));
        assertEquals(8, calculator.score(List.of(4, 4, 5, 5, 5), FOURS));
        assertEquals(4, calculator.score(List.of(4, 5, 5, 5, 5), FOURS));
    }


    @Test
    public void fives() {
        YatzyCalculator calculator = getYatzyCalculator();
        assertEquals(10, calculator.score(List.of(4, 4, 4, 5, 5), FIVES));
        assertEquals(15, calculator.score(List.of(4, 4, 5, 5, 5), FIVES));
        assertEquals(20, calculator.score(List.of(4, 5, 5, 5, 5), FIVES));
    }


    @Test
    public void sixes() {
        YatzyCalculator calculator = getYatzyCalculator();
        assertEquals(0, calculator.score(List.of(4, 4, 4, 5, 5), SIXES));
        assertEquals(6, calculator.score(List.of(4, 4, 6, 5, 5), SIXES));
        assertEquals(18, calculator.score(List.of(6, 5, 6, 6, 5), SIXES));
    }


    @Test
    public void pair() {
        YatzyCalculator calculator = getYatzyCalculator();
        assertEquals(6, calculator.score(List.of(3, 4, 3, 5, 6), PAIR));
        assertEquals(10, calculator.score(List.of(5, 3, 3, 3, 5), PAIR));
        assertEquals(12, calculator.score(List.of(5, 3, 6, 6, 5), PAIR));
    }


    @Test
    public void two_pair() {
        YatzyCalculator calculator = getYatzyCalculator();
        assertEquals(16, calculator.score(List.of(3, 3, 5, 4, 5), TWO_PAIRS));
        assertEquals(16, calculator.score(List.of(3, 3, 5, 5, 5), TWO_PAIRS));
    }


    @Test
    public void three_of_a_kind() {
        YatzyCalculator calculator = getYatzyCalculator();
        assertEquals(9, calculator.score(List.of(3, 3, 3, 4, 5), THREE_OF_A_KIND));
        assertEquals(15, calculator.score(List.of(5, 3, 5, 4, 5), THREE_OF_A_KIND));
        assertEquals(9, calculator.score(List.of(3, 3, 3, 3, 5), THREE_OF_A_KIND));
    }


    @Test
    public void four_of_a_knd() {
        YatzyCalculator calculator = getYatzyCalculator();
        assertEquals(12, calculator.score(List.of(3, 3, 3, 3, 5), FOUR_OF_A_KIND));
        assertEquals(20, calculator.score(List.of(5, 5, 5, 4, 5), FOUR_OF_A_KIND));
        assertEquals(12, calculator.score(List.of(3, 3, 3, 3, 3), FOUR_OF_A_KIND));
    }


    @Test
    public void smallStraight() {
        YatzyCalculator calculator = getYatzyCalculator();
        assertEquals(15, calculator.score(List.of(1, 2, 3, 4, 5), SMALL_STRAIGHT));
        assertEquals(15, calculator.score(List.of(2, 3, 4, 5, 1), SMALL_STRAIGHT));
        assertEquals(0, calculator.score(List.of(1, 2, 2, 4, 5), SMALL_STRAIGHT));
    }


    @Test
    public void largeStraight() {
        YatzyCalculator calculator = getYatzyCalculator();
        assertEquals(20, calculator.score(List.of(6, 2, 3, 4, 5), LARGE_STRAIGHT));
        assertEquals(20, calculator.score(List.of(2, 3, 4, 5, 6), LARGE_STRAIGHT));
        assertEquals(0, calculator.score(List.of(1, 2, 2, 4, 5), LARGE_STRAIGHT));
    }


    @Test
    public void fullHouse() {
        YatzyCalculator calculator = getYatzyCalculator();
        assertEquals(18, calculator.score(List.of(6, 2, 2, 2, 6), FULL_HOUSE));
        assertEquals(0, calculator.score(List.of(2, 3, 4, 5, 6), FULL_HOUSE));
    }
}
