package com.kevin;

interface One {
    String firstName(String num);
    String lastName(String num);
}

interface Sec {
    int number(int num);
    String name(int num);
}

public class Third extends Second implements One, Sec {

    public String firstName(String name) {
        return name;
    }

    public String lastName(String last) {
        return last;
    }

    public int number(int num) {
        return num;
    }

    public String name(int num) {
        return Integer.toString(num);
    }

}
