package org.codingdojo.yatzy3;

import org.codingdojo.abs.AbstractYatzyCalculatorTest;
import org.codingdojo.YatzyCalculator;

public class Yatzy3Test extends AbstractYatzyCalculatorTest {
    @Override
    protected YatzyCalculator getYatzyCalculator() {
        return new Yatzy3();
    }
}
