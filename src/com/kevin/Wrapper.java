package com.kevin;

public class Wrapper {
    private int x;

    public Wrapper(int number) {
        x = number;
    }

    class Parent {
        int p = 1;

        class Child {
            int c = 2;
        }

    }
    
    public static void main(String[] args) {
        Wrapper myWrapper = new Wrapper(2);

        Wrapper.Parent parentObj = myWrapper.new Parent();
        
        Parent.Child childObj = parentObj.new Child();
    }

}
