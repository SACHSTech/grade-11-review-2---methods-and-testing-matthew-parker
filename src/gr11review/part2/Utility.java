package gr11review.part2;

import java.util.*;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.ArrayList;

public class Utility {

    public static boolean xyBalance(String str){
        
        boolean why = false;

        for(int i = str.length()-1; i >= 0; i--){
            if(str.charAt(i) == 'y'){
                why = true;
            }

            if(str.charAt(i) == 'x' && why == false){
                return false;
            }
        }
        return true;

        
    }

    public static String longestWord(String filenametxt) throws IOException{
        BufferedReader text = new BufferedReader(new FileReader(filenametxt));

        String longWord = " ";
        String line = text.readLine();


        while(line != null){

            if(line.length() > longWord.length()){

                longWord = line;
            }
            
            line = text.readLine();
        }

        text.close();
        
        return longWord;
    }


    public static int[] withoutTen(int[] nums){

        for(int count = 0; count < nums.length-1; count++){

            if(nums[count] == 10){
                nums[count] = nums[count+1];
                nums[nums.length-1] = 0;

            }

        }

        return nums;
    }
    
    public static boolean linearIn(int[] outer, int[] inner){

        int counter = 0;

        for (int outerCount = 0; outerCount < outer.length-1; outerCount++){
            for (int innerCount = 0; innerCount < inner.length-1; innerCount++){

                if(outer[outerCount] == inner[innerCount]){
                    counter++;
                }

            }

        }

        if(counter == inner.length-1){
            return true;
        }


        return false;
    }
}