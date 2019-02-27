package com.zipcodewilmington.assessment2.part2;

import java.util.HashMap;

public class Router {
    HashMap<String, String> str = new HashMap();

    public void add(String path, String controller) {
        str.put(path,controller);
    }

    public Integer size() {

        return str.size();
    }

    public String getController(String path) {

        return str.toString();
    }

    public void update(String path, String studentController) {

    }

    public void remove(String path) {
        str.remove(path);
    }
}
