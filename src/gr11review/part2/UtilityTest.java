package gr11review.part2;

import static org.junit.jupiter.api.Assertions.*;

import java.io.IOException;
import java.util.Arrays;

import org.junit.jupiter.api.Test;
import org.junit.Assert;

import gr11review.part2.Utility;

public class UtilityTest{

    //Arrays for withoutTenTest
    int[] nums = {10, 2, 10};
    int[] numAnswer = {2, 0, 0};
    
    //Array for linearInTest
    int[] outer = {1, 2, 4, 6};
    int[] inner = {2, 4};

    int[][] arr = {{1,1,1,}, {2,2,2}, {3,3,3}};

    //Test for xyBalance
    @Test
    void xyBalanceTest1(){
        assertEquals(true, Utility.xyBalance("aaxbby"));
    }

    //Test fot longestWord
    @Test
    void longestWordTest1() throws IOException{
        assertEquals("conservation", Utility.longestWord("C:\\Users\\mykay\\github-classroom\\SACHSTech\\grade-11-review-2---methods-and-testing-matthew-parker\\src\\gr11review\\test2\\Review2_3Test_1.txt"));
    }

    //Test for withoutTen
    @Test
    void withoutTenTest1(){
        assertArrayEquals(numAnswer, Utility.withoutTen(nums));  
    }

    @Test
    void linearInTest1(){
        assertEquals(true, Utility.linearIn(outer, inner));
    }
    
  
}
