package com.zipcodewilmington.assessment2.part2;

import com.j256.ormlite.stmt.query.In;

import java.util.ArrayList;
import java.util.List;

public class ListUtility {
    List<Integer> list = new ArrayList<>();

    public Boolean add(Integer i) {
       return list.add(i);
    }


    public Integer size() {
        return list.size();
    }

    public List<Integer> getUnique() {
        ArrayList<Integer> retList = new ArrayList<>();
        for (Integer ints : list) {
            if (!retList.contains(ints)) {
                retList.add(ints);
            }
        }

        return retList;
    }

    public String join() {
        String str = "";
        if (list.size() > 1) {
            for (int i = 0; i < list.size() - 1; i++) {
                str += list.get(i) + ", ";
            }
            str = str + list.get(list.size() - 1);
        } else
            str = list.get(0).toString();
        return str;
    }

    public Integer mostCommon() {
        int count = 1, tempcnt;
        int pop = list.get(0);
        int temp = 0;
        for (int i = 0; i < list.size() - 1; i++) {
            temp = list.get(i);
            tempcnt = 0;
            for (int j = 0; j < list.size(); j++) {
                if (temp == list.get(j)) {
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

    public Boolean contains(Integer valueToAdd) {
      return list.contains(valueToAdd);
//        Boolean bool;
//        if (list.contains(valueToAdd)) {
//            bool = true;
//        } else {
//            bool = false;
//        }
//        return bool;
    }
}
