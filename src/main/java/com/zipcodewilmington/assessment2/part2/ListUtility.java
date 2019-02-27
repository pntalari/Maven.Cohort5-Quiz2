package com.zipcodewilmington.assessment2.part2;

import com.j256.ormlite.stmt.query.In;

import java.util.ArrayList;
import java.util.List;

public class ListUtility {
    List<Integer> list = new ArrayList<>();

    public Boolean add(int i) {
        Boolean boolRet;
        if (list.add(i))
        boolRet = true;
        else
            boolRet = false;
        return boolRet;
    }

    public Integer size() {
        return list.size();
    }

    public List<Integer> getUnique() {
        ArrayList<Integer> retList = new ArrayList<>();
        for (Integer ints:list) {
            if(!retList.contains(ints))
            {
                retList.add(ints);
            }
        }

        return retList;
    }

    public String join() {
        String str = "";
        if (list.size() > 1) {
            for (int i = 0; i < list.size()-1; i++) {
                str += list.get(i) + ", ";
            }
            str = str + list.get(list.size()-1);
        }
        else
            str = list.get(0).toString();
        return str;
    }

    public Integer mostCommon() {
        return null;
    }

    public Boolean contains(Integer valueToAdd) {
    Boolean bool;
    if(list.contains(valueToAdd))
    {bool = true;}
    else{
        bool = false;
    }
        return bool;
    }
}
