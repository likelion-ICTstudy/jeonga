// 백준 2460문제 "지능형기차2"

import java.util.Scanner;

public class Q_2460 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int out;
        int in;
        int station = 10;
        int sum = 0;
        int maxSum = 0;

        for (int i = 0; i < station; i++) {
            out = sc.nextInt();
            in = sc.nextInt();

            sum += in - out;

            if ( sum > maxSum) {
                maxSum = sum;
            }
        }
        System.out.println(maxSum);
    }
}