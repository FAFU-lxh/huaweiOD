package org.example.huawei.text;

import java.util.Arrays;
import java.util.Scanner;

public class TextSix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String a = scanner.nextLine();
        String b = scanner.nextLine();
        String[] as = a.split(" ");
        String[] bs = b.split(" ");
        int[] aInts = new int[as.length];
        int[] bInts = new int[bs.length];
        for (int i = 0; i < as.length; i++) {
            aInts[i] = Integer.parseInt(as[i]);
        }
        for (int i = 0; i < bs.length; i++) {
            bInts[i] = Integer.parseInt(bs[i]);
        }
        int result = countOptimalPermutations(aInts, bInts);
        System.out.println(result);
    }

    public static int countOptimalPermutations(int[] a, int[] b) {
        int[] sortedA = a.clone();
        int[] sortedB = b.clone();
        Arrays.sort(sortedA);
        Arrays.sort(sortedB);

        int maxWins = calculateWins(sortedA, sortedB);

        boolean[] used = new boolean[a.length];
        return countPermutations(a, b, used, new int[a.length], 0, maxWins);
    }

    private static int calculateWins(int[] a, int[] b) {
        int wins = 0;
        int j = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] > b[j]) {
                wins++;
                j++;
            }
        }
        return wins;
    }

    private static int countPermutations(int[] a, int[] b, boolean[] used, int[] current, int index, int maxWins) {
        if (index == a.length) {
            return calculateWins(current, b) == maxWins ? 1 : 0;
        }

        int count = 0;
        for (int i = 0; i < a.length; i++) {
            if (!used[i]) {
                used[i] = true;
                current[index] = a[i];
                count += countPermutations(a, b, used, current, index + 1, maxWins);
                used[i] = false;
            }
        }
        return count;
    }
}
