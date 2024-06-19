package org.example.huawei.text;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.TreeSet;

public class TextTwo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = Integer.parseInt(scanner.nextLine());
        String s = scanner.nextLine();
        int num = Integer.parseInt(scanner.nextLine());
        String[] strings = s.split(" ");
        TreeSet<Integer> integerTreeSet = new TreeSet<>();
        for (String string : strings) {
            Integer integer = Integer.valueOf(string);
            integerTreeSet.add(integer);
        }
        if (integerTreeSet.size() < 2*num){
            System.out.println(-1);
            return;
        }
        Integer[] array = new Integer[integerTreeSet.size()];
        integerTreeSet.toArray(array);
        int sum = 0;
        for (int i = 0; i < num; i++) {
            sum += array[i] + array[array.length - 1 - i];
        }
        System.out.println(sum);

    }
}
