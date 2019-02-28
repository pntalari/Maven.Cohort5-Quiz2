package com.zipcodewilmington.assessment2.part2;

public class ArrayUtility {

    public Integer[] merge(Integer[] array1, Integer[] array2) {
        Integer arr2len = array2.length;
        Integer arr1len = array1.length;
        Integer[] finArr = new Integer[arr1len + arr2len];
        System.arraycopy(array1, 0, finArr, 0, arr1len);
        System.arraycopy(array2, 0, finArr, arr1len, arr2len);
        return finArr;
    }

    public Integer[] rotate(Integer[] array, Integer index) {
        Integer temp, j;

        for(j = 0;j<index;j++) {
            temp = array[0];
            for (int i = 0; i < array.length - 1 ; i++) {
                array[i] = array[i + 1];
            }
             array[array.length - 1] = temp;
        }
        return array;
    }

    public Integer countOccurrence(Integer[] array1, Integer[] array2, Integer valueToEvaluate) {
        Integer retResult = 0;
        for (Integer num : array1) {
            if (num == valueToEvaluate) {
                retResult++;
            }
        }
        for (Integer num : array2) {
            if (num == valueToEvaluate) {
                retResult++;
            }
        }
        return retResult;
    }

    public Integer mostCommon(Integer[] array) {
        int count = 1, tempcnt;
        int pop = array[0];
        int temp = 0;
        for (int i = 0; i < array.length - 1; i++) {
            temp = array[i];
            tempcnt = 0;
            for (int j = 0; j < array.length; j++) {
                if (temp == array[j]) {
                    tempcnt++;
                }
                if (tempcnt > count) {
                    pop = temp;
                    count = tempcnt;
                }
            }
        }

        return pop;
    }
}

