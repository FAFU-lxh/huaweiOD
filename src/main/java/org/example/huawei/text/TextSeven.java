package org.example.huawei.text;

import java.util.Scanner;

public class TextSeven {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String mount = scanner.nextLine();
        int power = Integer.parseInt(scanner.nextLine());
        String[] strings = mount.split(",");
        int[] ints = new int[strings.length];
        for (int i = 0; i < strings.length; i++) {
            ints[i] = Integer.parseInt(strings[i]);
        }
        int
    }
}
