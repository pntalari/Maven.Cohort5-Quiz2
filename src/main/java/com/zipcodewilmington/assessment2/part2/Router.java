package com.zipcodewilmington.assessment2.part2;

import java.util.HashMap;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;

public class Router {
    Map<String, String> list = new TreeMap();

    public void add(String path, String controller) {

        list.put(path, controller);
    }

    public Integer size() {

        return list.size();
    }

    public String getController(String path) {

        return list.get(path);
    }

    public void update(String path, String studentController) {
        for (Map.Entry<String, String> entry : list.entrySet()) {
            if (entry.getKey().equals(path)) {
                list.put(entry.getKey(), studentController);
            }
        }
    }

    public void remove(String path) {
        list.remove(path);
    }

    @Override
    public String toString() {
        String strRet = "";

        for (Map.Entry<String, String> entry : list.entrySet()) {
            strRet += entry.getKey() + " -> " + entry.getValue() + "\n";
        }
        return strRet;
    }
}
