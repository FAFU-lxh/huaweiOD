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
            int op = integers[i];
            if (op > 0){
                if (set.size() == 0){
                if (set.size() == n) return 0;
                    set.add(0);
                }else if (set.size() == 1){
                    set.add(n-1);
                    if (set.size() == n) return 1;
                } else if (set.size() > 1 && n > set.size()) {
                    int max = 0;
                    int count = 0;
                    int start = 0;
                            int maxLen = 0;
                    int[] ints = new int[set.size()];
                    for (Integer integer : set) {
                        ints[count++] = integer;
                    }
                    for (int i1 = 1; i1 < ints.length; i1++) {
                        if (ints[i1] - ints[i1 - 1] >= max) {
                            max = ints[i1] - ints[i1 - 1];
                            if (maxLen < max/2) {
                                maxLen = max / 2;
                                start = ints[i1 - 1];
                            }
                        }
                    }
                    set.add(start + maxLen);
                    if (integers.length - 1 == i) {
                        return start + maxLen;
                    }
                }else {
                    return  -1;
                }
            }else{
                set.remove(-op);
            }

        }
        return 0;
    }
}
