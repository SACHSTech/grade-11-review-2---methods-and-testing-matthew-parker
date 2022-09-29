package gr11review.part2;

import static org.junit.jupiter.api.Assertions.*;

import java.io.IOException;
import java.util.Arrays;

import org.junit.jupiter.api.Test;
import org.junit.Assert;

import gr11review.part2.Utility;

public class UtilityTest{
    @Test
    void xyBalanceTest1(){
        assertEquals(true, Utility.xyBalance("aaxbby"));
    }

    @Test
    void longestWordTest1() throws IOException{
        assertEquals("conservation", Utility.longestWord("C:\\Users\\mykay\\github-classroom\\SACHSTech\\grade-11-review-2---methods-and-testing-matthew-parker\\src\\gr11review\\test2\\Review2_3Test_1.txt"));
    }


    
    @Test
    void withoutTenTest1(){
     
    }
    
  
}
