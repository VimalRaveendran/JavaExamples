package examples;

import java.util.*;

public class SumOfIntegers {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,7};
        int sum = 7;
        List<List<Integer>> finalList = new ArrayList<>();
        for (int i = 0; i < arr.length; i++)
            sumOfElements(arr, arr[i], sum, sum, i, new ArrayList<>(), finalList);
        System.out.println(finalList);
    }

    public static void dispatcher(Integer[] arr, Integer sum){
        for(int i = 0; i < arr.length; i++){
            Integer[] subArr = Arrays.copyOf(arr, i+1);
            for(int j = i+1; j < arr.length; j++){
                subArr
            }
        }
    }

    public static void sumOfElements(int[] arr, int currNumber, int originalSum, int sum, int currIndex, List<Integer> resultList, List<List<Integer>> finalList) {
        if(currIndex >= arr.length)
            return;
        if (arr[currIndex] == sum) {
            resultList.add(arr[currIndex]);
            finalList.add(resultList);
            sumOfElements(arr, currNumber, originalSum, originalSum - currNumber, currIndex + 1, new ArrayList<>(Arrays.asList(currNumber)), finalList);
        } else if (arr[currIndex] < sum) {
            resultList.add(arr[currIndex]);
            sumOfElements(arr, currNumber, originalSum, sum - arr[currIndex], currIndex + 1, resultList, finalList);
        } else if(currNumber+arr[currIndex] <= originalSum)
            sumOfElements(arr, currNumber, originalSum, originalSum - currNumber, currIndex, new ArrayList<>(Arrays.asList(currNumber)), finalList);
    }

    // [1] - 1
    // [8,10] - 10
    // [2,8] - 10
    // [1,2,3] - 3 - [1,2][3]
    // [-1,1,2,3,4] - 3 - [-1,1,3][-1,4][1,2][3]
    /* if arr[i] == sum, return arr[i]
       arr.length == 2, sum = sum of 2, or arr[0] or arr[1]
     */
}
