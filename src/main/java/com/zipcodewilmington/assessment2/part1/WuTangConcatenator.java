package com.zipcodewilmington.assessment2.part1;

import com.sun.org.apache.xpath.internal.operations.Bool;

public class WuTangConcatenator {
    Integer input = 0;

    public WuTangConcatenator(Integer input) {
        this.input = input;
    }

    public Boolean isWu() {
        Boolean retResult;
        if (this.input % 3 == 0) {
            retResult = true;
        } else {
            retResult = false;
        }
        return retResult;
    }

    public Boolean isTang() {
        Boolean retResult;
        if (this.input % 5 == 0) {
            retResult = true;
        } else {
            retResult = false;
        }
        return retResult;
    }

    public Boolean isWuTang() {
        Boolean retResult;
        if (this.input % 3 == 0 && this.input % 5 == 0) {
            retResult = true;
        } else {
            retResult = false;
        }
        return retResult;
    }
}
