package com.zipcodewilmington.assessment2.part1;

public class IntegerArrayUtilities {
    Boolean retResult;
    public Boolean hasEvenLength(Integer[] array) {
        if (array.length % 2 == 0) {
            retResult = true;
        }
        else{
            retResult = false;
        }

        return retResult;
    }

    public Integer[] range(int start, int stop) {
        Integer[] arr = new Integer[stop - start+1];
        Integer len = stop - start;
        for (int i = 0;i<=len;i++)
        {
            arr[i] = start;
            start++;
        }
        return arr;
    }
    public Integer getSumOfFirstTwo(Integer[] array) {

        return array[0] + array[1];
    }

    public Integer getProductOfFirstTwo(Integer[] array) {
        return array[0] * array[1];
    }
}
