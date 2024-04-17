package org.codingdojo;

import java.util.List;

public interface YatzyCalculator {
    List<YatzyCategory> validCategories();
    int score(List<Integer> dice, YatzyCategory category);
}
