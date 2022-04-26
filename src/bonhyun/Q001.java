package bonhyun;

import java.util.Arrays;
import java.util.Scanner;

public class Q001 {
    public static void main(String[] args) {
        /*
         * memory :	12896KB     time: 116ms
         * memory :	19864KB     time: 276ms
         * --> java 8 문법보다 기본 for loop가 더 빠름
         */
        Scanner sc = new Scanner(System.in);
        sc.nextInt();

        String numbers = sc.next();
        char[] numbersArr = numbers.toCharArray();

        int sum = 0;
        for(char number : numbersArr){
            sum += number - '0';
            // ASCII 같은 문자와 숫자 차이는 48 >>> ASCII Code '0' == 48
        }
        System.out.println(sum);

        // in java 8
        int[] numberArr = numbers.chars()
                .map(number -> number - '0')
                .toArray();

        sum = Arrays.stream(numberArr).sum();
        System.out.println(sum);
        // 참고 https://stackoverflow.com/questions/10886068/char-array-to-int-array
    }
}
