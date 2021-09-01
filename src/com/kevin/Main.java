package com.kevin;

import java.util.Arrays;

 public class Main {
    public int a = 1;
    protected int b = 2;
    private int c = 3;

    public void aa(int num) {
        System.out.println(num);
    }
    protected void bb(int num) {
        System.out.println(num);
    }
    private void cc(int num) {
        System.out.println(num);
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(args));
//        Primitive Type
//        byte mb = 2;
//        short ms = 1_231;
//        int mi = 1_231_251_412;
//        long ml = 3_244_378_567_434L;
//        float mf = 1.4F;
//        double md = 1.4D;
//        boolean mBool = false;
//        char mc = 'A';

//        Reference Type
//        String mString = "some string";

//        int[] intArr = new int[5];
//        intArr[0] = 1;
//        intArr[1] = 2;
//        intArr[2] = 3;
//        intArr[3] = 4;
//        intArr[4] = 5;

//        int[][] nestedInt = new int[2][3];
//        nestedInt[0][0] = 1;
//        nestedInt[0][1] = 2;
//        nestedInt[0][2] = 3;
//        nestedInt[1][0] = 4;
//        nestedInt[1][1] = 5;
//        nestedInt[1][2] = 6;

//        final String name = "Kaveh";

//        Main myObj = new Main(2);
    }
}
