package org.example.huawei.text;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class TextThree {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        String str = scanner.nextLine();
        String[] s = str.split(" ");
        Integer[] integers = new Integer[s.length];
        for (int i = 0; i < s.length; i++) {
            integers[i] = Integer.parseInt(s[i]);
        }
        Integer[] result = getResultList(integers);
        System.out.println(Arrays.toString(result));
    }

    private static Integer[] getResultList(Integer[] integers) {
        Stack<Integer> integerStack = new Stack<>();
        Integer[] result = new Integer[integers.length];
        Arrays.fill(result,0);
        for (int i = 0; i < integers.length; i++) {
            while (!integerStack.isEmpty() && integers[i] > integers[integerStack.peek()]){
                result[integerStack.pop()] = i;
            }
            integerStack.push(i);
        }
        return result;
    }
}
