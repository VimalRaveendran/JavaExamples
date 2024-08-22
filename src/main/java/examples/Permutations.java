package examples;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Permutations {
/*    public static void main(String[] args) {
        List<List<Integer>> outputList = new ArrayList<>();
        permutations(Arrays.asList(1,2,3), outputList);
    }

    public static List<Integer> permutations(List<Integer> inputList, List<List<Integer>> outputList) {
        inputList.stream().forEach();
    }*/


    public static void swapAndAdd(Integer[] inputArr, int from, int to, List<Integer[]> finalList) {
        if (from < 0 || from >= inputArr.length || to < 0 || to >= inputArr.length)
            return;
        Integer[] swapArr = Arrays.copyOf(inputArr, inputArr.length);
        int swapElement = swapArr[from];
        swapArr[from] = swapArr[to];
        swapArr[to] = swapElement;
    }

    public static void printAllRecursive(List<Integer[]> outputList, int n, Integer[] elements) {
        if (n == 1) {
            addAndPrintArray(outputList, elements);
        } else {
            for (int i = 0; i < n - 1; i++) {
                printAllRecursive(outputList, n - 1, elements);
                if (n % 2 == 0) {
                    swap(elements, i, n - 1);
                } else {
                    swap(elements, 0, n - 1);
                }
            }
            printAllRecursive(outputList,n - 1, elements);
        }
    }

    private static <T> void swap(T[] elements, int a, int b) {
        T tmp = elements[a];
        elements[a] = elements[b];
        elements[b] = tmp;
    }

    private static void addAndPrintArray(List<Integer[]> outputList, Integer[] elements) {
        outputList.add(elements);
        System.out.println(Arrays.deepToString(elements));
    }

    public static void main(String[] args) {
        // 3 1 2
        // 2 3 1

        // if i==3, j=0,1
        Integer[] elements = {1, 2, 3, 4};
        List<Integer[]> outputList = new ArrayList<>();
        /*List<Integer[]> outputList = new ArrayList<>();
        for(int i = 0; i < elements.length; i++){
            int j = i+1;
            if(i/(elements.length-1) == 1)
                j = 0;
            while(j < elements.length){
                swapAndAdd(elements, i, j, outputList);
                j++;
            }
        }

        System.out.println(Arrays.deepToString(outputList.toArray()));*/
        printAllRecursive(outputList, elements.length, elements);
    }

}
