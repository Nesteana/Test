package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ArrayUtilTest {

    @Test
    public void findIndexTest() {
        ArrayUtil arrayUtil = new ArrayUtil();
        int[] array = new int[]{4, 7, 5, 8, 3};
        int element = 3;
        int expectedResult = 4;

        Integer result = arrayUtil.findIndex(array, element);

        Assertions.assertEquals(expectedResult, result);
    }
}
