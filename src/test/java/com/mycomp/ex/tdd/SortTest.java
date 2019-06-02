package com.mycomp.ex.tdd;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class SortTest {

    @Test
    public void sortings() throws Exception {
        assertThat(sort(intList()), is(intList()));
        assertThat(sort(intList(1)), is(intList(1)));
    }

    private List<Integer> sort(List<Integer> list) {
        return new ArrayList<>();
    }

    private List<Integer> intList(Integer... ints) {
        return Arrays.asList(ints);
    }
}
