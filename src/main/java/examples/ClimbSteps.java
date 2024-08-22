package examples;

public class ClimbSteps {

    /* Driver program to test above function */
    public static void main(String args[])
    {
        //System.out.println(climbSteps(5));
        System.out.println(f(4));
    }

    public static int climbSteps(int n) {
        int[] fib = new int[n + 1];
        for(int i = 0; i <= n; i++){
            if(i <= 2)
                fib[i] = i;
            else
                fib[i] = fib[i-1] + fib[i-2];
        }
        return fib[n];
    }

    public static int f(int n) {
        if(n <= 2)
            return n;
        return f(n-1) + f(n-2);
        /*
        * f(4) + f(3)
        * f(3) + f(2)
        * f(2) + f(1)
        * 2 + 1 + 2 + f(2) + f(1)
        * 2 + 1 + 2 + 2 + 1
        * */
    }

    public static int climbStairs(int n) {
        if (n <= 2) {
            return n;
        }
        int[] dp = new int[n + 1];
        dp[1] = 1;
        dp[2] = 2;
        for (int i = 3; i <= n; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }
        return dp[n];
    }

    public static void main2(String[] args) {
        int n = 5; // Example input
        System.out.println("Number of ways to climb to the top: " + climbStairs(n));
    }
}

