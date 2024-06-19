package org.example.huawei.text;

import java.util.Scanner;
import java.util.TreeSet;

public class TextFive {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        String str = scanner.nextLine();
        String[] strings = str.split(",");
        Integer[] integers = new Integer[strings.length];
        for (int i = 0; i < strings.length; i++) {
            integers[i] = Integer.parseInt(strings[i]);
        }
        int result = getSeat(n, integers);
        System.out.println(result);
    }

    private static int getSeat(int n, Integer[] integers) {
        TreeSet<Integer> set = new TreeSet<>();

        for (int i = 0; i < integers.length; i++) {
            if ()

        }
    }
}
