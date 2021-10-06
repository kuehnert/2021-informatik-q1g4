package test;

import util.ArrayGenerator;

import java.util.Arrays;

public class TestArrayGenerator {
    public static void main(String[] args) {
        int[] a = ArrayGenerator.randomNumbers(10, 10_000);
        System.out.println(Arrays.toString(a));

        a = ArrayGenerator.randomNumbers(10, 10);
        System.out.println(Arrays.toString(a));
    }
}
