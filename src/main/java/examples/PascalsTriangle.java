package examples;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PascalsTriangle {
    public static void main(String[] args) {
        int n = 5;
        List<int[]> finalList = new ArrayList<>();
        for(int i = 1; i <= n; i++)
            pascalTriangle(i, finalList);
    }

    public static void pascalTriangle(int n, List<int[]> pascalTriangleList) {
        if(n == 0)
            return;
        int[] returnArr = new int[n];
        returnArr[0] = returnArr[n-1] = 1;
        if(n > 2) {
            int[] baseArr = pascalTriangleList.get(n-2);
            for (int i = 1; i < returnArr.length - 1; i++) {
                returnArr[i] = baseArr[i-1] + baseArr[i];
            }
        }
        System.out.println(Arrays.toString(returnArr));
        pascalTriangleList.add(returnArr);
    }
}
