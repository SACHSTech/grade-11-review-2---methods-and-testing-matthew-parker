package gr11review.part2;

import static org.junit.jupiter.api.Assertions.*;
import java.io.IOException;
import java.util.Arrays;
import org.junit.jupiter.api.Test;
import org.junit.Assert;
import gr11review.part2.Utility;

public class UtilityTest{

    // Method Test Case
    @Test
    void sumNumbersTest1(){
        assertEquals(123, Utility.sumNumbers("abc123xyz"));
    }

    @Test
    void sumNumbersTest2(){
        assertEquals(44, Utility.sumNumbers("aa11b33"));
    }

    @Test
    void sumNumbersTest3(){
        assertEquals(18, Utility.sumNumbers("7 11"));
    }

    // File IO Test Case
    @Test
    void vowelCountTest1() throws IOException{
        assertEquals("interactive", Utility.vowelCount("//Users//parkeryang//github-classroom//SACHSTech//grade-11-review-2---methods-and-testing-matthew-parker//src//gr11review//test2//Review2_3Test_1.txt"));
    }

    @Test
    void vowelCountTest2() throws IOException{
        assertEquals("injection", Utility.vowelCount("//Users//parkeryang//github-classroom//SACHSTech//grade-11-review-2---methods-and-testing-matthew-parker//src//gr11review//test2//Review2_3Test_2.txt"));
    }

    @Test
    void vowelCountTest3() throws IOException{
        assertEquals("visualization", Utility.vowelCount("//Users//parkeryang//github-classroom//SACHSTech//grade-11-review-2---methods-and-testing-matthew-parker//src//gr11review//test2//Review2_3Test_3.txt"));
    }
    
    @Test
    void vowelCountTest4() throws IOException{
        assertEquals("sensitive", Utility.vowelCount("//Users//parkeryang//github-classroom//SACHSTech//grade-11-review-2---methods-and-testing-matthew-parker//src//gr11review//test2//Review2_3Test_4.txt"));
    }

    // Array 1D Test Case
    @Test
    void zeroFront1(){
        int[] zeroFront1 = new int[] {1, 0, 0, 1};
        int[] zeroFront1Answer = new int[] {0, 0, 1, 1};
        assertArrayEquals(zeroFront1Answer, Utility.zeroFront(zeroFront1));
    }

    @Test
    void zeroFront2(){
        int[] zeroFront2 = new int[] {0, 1, 1, 0, 1};
        int[] zeroFront2Answer = new int[] {0, 0, 1, 1, 1};
        assertArrayEquals(zeroFront2Answer, Utility.zeroFront(zeroFront2));
    }

    @Test
    void zeroFront3(){
        int[] zeroFront3 = new int[] {1, 0};
        int[] zeroFront3Answer = new int[] {0, 1};
        assertArrayEquals(zeroFront3Answer, Utility.zeroFront(zeroFront3));
    }
    // Array 1D (2 Loops) Test Case
    @Test
    void seriesUp1(){
        int[] intArray1Answer = {1, 1, 2, 1, 2, 3};
        assertArrayEquals(intArray1Answer, Utility.seriesUp(3));
    }

    @Test
    void seriesUp2(){
        int[] intArray2Answer = {1, 1, 2, 1, 2, 3, 1, 2, 3, 4};
        assertArrayEquals(intArray2Answer, Utility.seriesUp(4));
    }

    @Test
    void seriesUp3(){
        int[] intArray3Answer = {1, 1, 2};
        assertArrayEquals(intArray3Answer, Utility.seriesUp(2));
    }

    // Array 2D Test Case
    @Test
    void reverse1(){
        int[][] intArray1 = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9},
    };
        int[][] intArray1Answer = {
            {9, 8, 7},
            {6, 5, 4},
            {3, 2, 1},
    };
        assertArrayEquals(intArray1Answer, Utility.reverse(intArray1));
    }

    @Test
    void reverse2(){
        int[][] intArray2 = {
            {3, 3, 3},
            {1, 1, 1},
            {2, 2, 2},
    };
        int[][] intArray2Answer = {
            {2, 2, 2},
            {1, 1, 1},
            {3, 3, 3},
    };
        assertArrayEquals(intArray2Answer, Utility.reverse(intArray2));
    }

    @Test
    void reverse3(){
        int[][] intArray3 = {
            {3, 6, 9},
            {1, 2, 3},
            {2, 4, 6},
    };
        int[][] intArray3Answer = {
            {6, 4, 2},
            {3, 2, 1},
            {9, 6, 3},
    };
        assertArrayEquals(intArray3Answer, Utility.reverse(intArray3));
    }

    //Arrays for withoutTenTest
    int[] nums = {10, 2, 10};
    int[] numAnswer = {2, 0, 0};
    
    //Array for linearInTest
    int[] outer = {1, 2, 4, 6};
    int[] inner = {2, 4};

    //2D array for 
    int[][] arr = {{1,1,1,}, {2,2,2}, {3,3,3}};
    int[][] invertArr = {{1,2,3},{1,2,3},{1,2,3}};

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

    //Test for linearIn
    @Test
    void linearInTest1(){
        assertEquals(true, Utility.linearIn(outer, inner));
    }
    
    //Test for invertTest
    @Test
    void invertTest1(){
        assertArrayEquals(invertArr, Utility.invert(arr));
    }
}
