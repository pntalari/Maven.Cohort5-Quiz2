package com.zipcodewilmington.assessment2.part1;

public class BasicUtilities {
    Boolean retResult;
    public Boolean isGreaterThan5(Integer value) {
        if (value >= 5){
            retResult = true;
        }
        else {
            retResult = false;
        }
            return retResult;
    }

    public Boolean isLessThan7(Integer value) {
        if (value <= 7){
            retResult = true;
        }
        else {
            retResult = false;
        }
        return retResult;
    }

    public Boolean isBetween5And7(Integer valueToEvaluate) {
        if (valueToEvaluate >= 5 && valueToEvaluate <= 7){
            retResult = true;
        }
        else {
            retResult = false;
        }
        return retResult;
    }

    public Boolean startsWith(String string, Character character) {
        Character chr = Character.toLowerCase(character);
        if (Character.toLowerCase(string.charAt(0)) == chr)
        { retResult = true;}
        else {retResult = false;}
        return retResult;
    }
}
