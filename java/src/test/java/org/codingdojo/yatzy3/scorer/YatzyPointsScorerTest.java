package org.codingdojo.yatzy3.scorer;

import org.codingdojo.YatzyCategory;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class YatzyPointsScorerTest {
    final  YatzyPointsScorer yatzyPointsScorer = new YatzyPointsScorer();

    @Test
    public void calculateScore_shouldReturn50OnFiveSameDices(){
        assertEquals(50, yatzyPointsScorer.calculateScore(List.of(4, 4, 4, 4, 4)));
        assertEquals(0, yatzyPointsScorer.calculateScore(List.of(4, 4, 4, 4, 1)));
    }

}