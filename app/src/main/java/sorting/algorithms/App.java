package sorting.algorithms;
/*
 * This Java source file was generated by the Gradle 'init' task.
 */

import java.util.List;
import java.util.ArrayList;

public class App {

    public static List<Integer> mergeSort(List<Integer> data) {
        // base case: data is length 2
        if (data.size() == 1) {
            return data;
        } else if (data.size() == 2) {
            if (data.get(0) > data.get(1)) {
                int i = data.get(1);
                data.set(1, data.get(0));
                data.set(0, i);
            } 
            return data;
        } else {
            List<Integer> first = new ArrayList<>();
            List<Integer> second = new ArrayList<>();

            for (int i = 0; i < data.size(); i++) {
                if (i < data.size() / 2) {
                    first.add(data.get(i));
                } else {
                    second.add(data.get(i));
                }
            }
            first = mergeSort(first);
            second = mergeSort(second);
            return mergeJoin(first, second);
        }
    }
    
    private static List<Integer> mergeJoin(List<Integer> arr1, List<Integer> arr2) {
        // set pointer indices
        int i = 0;
        int j = 0;
        // make new array, ensuring that there is no resizing necessary
        List<Integer> result = new ArrayList<>(arr1.size() + arr2.size());
        while (i < arr1.size() && j < arr2.size()) {
            if (arr1.get(i) <= arr2.get(j)) {
                result.add(arr1.get(i));
                i++;
            } else {
                result.add(arr2.get(j));
                j++;
            }
        }
        // add rest of arrays
        while (i < arr1.size()) {
            result.add(arr1.get(i));
                i++;
        }
        while (j < arr2.size()) {
            result.add(arr2.get(j));
            j++;
        }
        return result;
    }

    public static List<Integer> insertionSort(List<Integer> data) {
        List<Integer> aux = new ArrayList<>();
        while(!data.isEmpty()) {
            int index = min_index(data);
            aux.add(data.remove(index));
        }
        return aux;
    }

    private static int min_index(List<Integer> data) {
        int min = Integer.MAX_VALUE;
        int index = -1;
        for (int i = 0; i < data.size(); i++) {
            if (data.get(i) < min) {
                min = data.get(i);
                index = i;
            }
        }
        return index;
    }

    public static List<Integer> selectionSort(List<Integer> data) {
        return data;
    }

    public static List<Integer> bubbleSort(List<Integer> data) {
        return data;
    }

    public static List<Integer> heapSort(List<Integer> data) {
        return data;
    }

    public static List<Integer> radixSort(List<Integer> data) {
        return data;
    }

    public static List<Integer> quickSort(List<Integer> data) {
        return data;
    }

    public static List<Integer> bucketSort(List<Integer> data) {
        return data;
    }
}