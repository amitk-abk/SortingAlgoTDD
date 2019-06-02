package com.mycomp.ex.tdd;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class SortTest {

    private void assertSorted(List<Integer> unsorted, List<Integer> sorted) {
        assertThat(sort(unsorted), is(sorted));
    }

    private List<Integer> intList(Integer... ints) {
        return Arrays.asList(ints);
    }

    @Test
    public void sortings() throws Exception {
        assertSorted(intList(), intList());
        assertSorted(intList(1), intList(1));
        assertSorted(intList(2, 1), intList(1, 2));
    }


    private List<Integer> sort(List<Integer> list) {
        if (list.size() > 1) {
            if (list.get(0) > list.get(1)) {
                int temp = list.get(0);
                list.set(0, list.get(1));
                list.set(1, temp);
            }
        }
        return list;
    }

}
