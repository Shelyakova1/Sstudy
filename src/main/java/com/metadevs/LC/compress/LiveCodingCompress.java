package com.metadevs.LC.compress;

import com.sun.org.apache.bcel.internal.generic.ARETURN;

import java.util.Arrays;
import java.util.Scanner;

public class LiveCodingCompress {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите набор символов");
        String userInput = scan.nextLine();
        char[] arr = userInput.toCharArray();
        char[] compressedArr = compress(arr);
        System.out.println(compressedArr);
        char[] decompressedArr = decompress(compressedArr);
        System.out.println(decompressedArr);
        char[] decompressedArr2 = decompress(arr);
        System.out.println(decompressedArr2);
    }

    public static char[] compress(char[] arr) {
        if (arr.length <= 1) {
            return Arrays.copyOf(arr, arr.length);
        } else {
            String resultStr = "";
            for (int i = 1, groupSize = 1; i <= arr.length; i++) {
                if (i != arr.length && arr[i] == arr[i - 1]) {
                    groupSize++;
                } else {
                    resultStr = addGroup(resultStr, arr[i - 1], groupSize);
                    groupSize = 1;
                }
            }
            return resultStr.toCharArray();
        }
    }

    public static String addGroup(String s, char c, int groupSize) {
        if (groupSize == 1) {
            return s + c;
        } else {
            return s + groupSize + c;
        }
    }

    public static char[] decompress(char[] arr) {
        String resultStr = "";
        for (int i = 0; i < arr.length; i++) {
            int count = 0;
            if (Character.isDigit(arr[i])) {
                count = Character.digit(arr[i], 10);
                i++;
            } else {
                count = 1;
            }
            for (int j = 0; j < count; j++) {
                resultStr = resultStr + arr[i];
            }
        }
        return resultStr.toCharArray();
    }
}