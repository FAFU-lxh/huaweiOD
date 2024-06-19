package org.example.huawei.text;

import java.util.Scanner;

public class TextFour {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        char[] charArray = str.toCharArray();
        int count = getMaxString(charArray);
        System.out.println(count);
    }

    private static int getMaxString(char[] charArray) {
        int len = charArray.length;
        int result = 0;

        for (int i = 0; i < len; i++) {
            int sum = 0;
            if ((charArray[i] >= 'A' && charArray[i] <= 'Z') || (charArray[i] >= 'a' && charArray[i] <= 'z')){
                int left = 1;
                int right = 1;
                while (i-left >= 0 && charArray[i-left] >= '0' && charArray[i-left] <= '9'){
                    left++;
                    sum++;
                }
                while (i+right < len && charArray[i+right] >= '0' && charArray[i+right] <= '9'){
                    right++;
                    sum++;
                }
                result = Math.max(result, sum);

            }
        }
        return result > 0 ? result : -1;
    }
}
