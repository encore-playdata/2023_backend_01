package dto;

import java.util.Scanner;

public class Dm {

    // 0 1 1 2 3 5 8 13 21 34 -> 55
    static int[] dp;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        dp = new int[a + 1];
        dp[0] = 0;
        dp[1] = 1;

//        dp[5]
        System.out.println(fibonacci(a));

        // a = 5;
//      dp(4) + dp(3)
//        fibonacci(3)

    }

    static int fibonacci(int N) {
        if (N == 0) return 0;

        if (N == 1) return 1;

        return fibonacci(N - 1) + fibonacci(N - 2);
    }

}
