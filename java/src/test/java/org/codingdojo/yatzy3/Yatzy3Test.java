package org.codingdojo.yatzy3;

import org.codingdojo.YatzyCalculator;
import org.codingdojo.abs.AbstractYatzyCalculatorTest;

public class Yatzy3Test extends AbstractYatzyCalculatorTest {
    @Override
    protected YatzyCalculator getYatzyCalculator() {
        return new Yatzy3();
    }
}
