package com.zipcodewilmington.assessment2.part2;

import java.util.HashMap;

public class Router {
    HashMap<String, String> list = new HashMap();


    public void add(String path, String controller) {

        list.put(path,controller);
    }

    public Integer size() {

        return list.size();
    }

    public String getController(String path) {

        return list.get(path).toString();
    }

    public void update(String path, String studentController) {
        for (HashMap

    }

    public void remove(String path) {

        list.remove(path);
    }
}
