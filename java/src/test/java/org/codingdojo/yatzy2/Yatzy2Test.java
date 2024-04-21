package org.codingdojo.yatzy2;

import org.codingdojo.abs.AbstractYatzyCalculatorTest;
import org.codingdojo.YatzyCalculator;

public class Yatzy2Test extends AbstractYatzyCalculatorTest {
    @Override
    protected YatzyCalculator getYatzyCalculator() {
        return new Yatzy2();
    }
}
