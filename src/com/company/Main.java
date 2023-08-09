package com.company;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Random r = new Random();
        int num, sum=0;

        for(int i=0; i<1000; i++) {
            num= r.nextInt(100);
            sum = sum + num;
        }

        System.out.println(sum);
    }
}
