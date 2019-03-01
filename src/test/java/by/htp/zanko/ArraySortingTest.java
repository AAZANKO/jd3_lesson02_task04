package by.htp.zanko;

import org.junit.Assert;
import org.junit.Test;

public class ArraySortingTest {

    @Test
    public void checkGetArraySorting(){

        int[] arrayInt = {5, 3, 2, 8, 1, 4, 9, 7};

        ArraySorting arraySorting = new ArraySorting();

        int[] arraySortingResult = arraySorting.getArraySorting(arrayInt);

        Assert.assertNotNull(arraySortingResult);
    }
}