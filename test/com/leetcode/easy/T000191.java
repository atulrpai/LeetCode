package com.leetcode.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class T000191 {
    @Test
    void hammingWeight() {
        P000191 solution = new P000191();
        assertEquals(1, solution.hammingWeight(0b10000000000000000000000000000000));
    }
}