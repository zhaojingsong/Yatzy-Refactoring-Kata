package org.codingdojo.yatzy2;

import org.codingdojo.YatzyCalculator;
import org.codingdojo.abs.AbstractYatzyCalculatorTest;

public class Yatzy2Test extends AbstractYatzyCalculatorTest {
    @Override
    protected YatzyCalculator getYatzyCalculator() {
        return new Yatzy2();
    }
}
