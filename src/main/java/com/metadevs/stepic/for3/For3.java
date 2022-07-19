package com.metadevs.stepic.for3;

import java.util.Scanner;

//задача №3 со stepic раздел 7.3
public class For3 {
    public static void main(String[] args) {
        Scanner scanNum = new Scanner(System.in);

        int mum;
        boolean input = true;
        do {
            mum = scanNum.nextInt();
            if (mum > 0 || mum == -9999) {

                input = false;
            }
        }

        while (mum != -9999);
        System.out.println(input ? "YES" : "NO");
    }

}


