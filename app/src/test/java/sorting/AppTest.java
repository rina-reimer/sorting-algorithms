package sorting;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import sorting.algorithms.App;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class AppTest {
    private ArrayList<Integer> pre;
    private ArrayList<Integer> post;

    @BeforeEach
    public void setUp() {
        pre = new ArrayList<>();
        post = new ArrayList<>();
        pre.addAll(Arrays.asList(5, 2, 9, 1, 7, 3, 8, 6, 4, 10));
        post.addAll(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));         
    }

    @Test
    void mergeSortTest() {
        List<Integer> sorted = App.mergeSort(pre);
        assertEquals(post, sorted, "Merge sort did not produce the expected result.");
    }

    @Test
    void insertionSortTest() {
        List<Integer> sorted = App.insertionSort(pre);
        assertEquals(post, sorted, "Insertion sort did not produce the expected result.");
    }
}

