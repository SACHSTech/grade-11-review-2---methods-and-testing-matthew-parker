package gr11review.part2;

import java.util.*;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.ArrayList;

public class Utility {

    /**
     * @param str reads the string from test file
     * @return returns the string
     */

    public static boolean xyBalance(String str){
        
        boolean why = false;

        //checks if there is the letter "y" in the string
        for(int i = str.length()-1; i >= 0; i--){
            
            //determines that the letter "y" is in the string
            if(str.charAt(i) == 'y'){
                why = true;
            }
            
            //returns false statement if the parameters are not met
            if(str.charAt(i) == 'x' && why == false){
                return false;
            }
        }
        return true;

        
    }

    /**
     * @param filenametxt reads file
     * @return returns the longest word
     * @throws IOException gives error for input or output fails
     */
    public static String longestWord(String filenametxt) throws IOException{

        //reads file
        BufferedReader text = new BufferedReader(new FileReader(filenametxt));

        //sets the longest word to null and reads the first line
        String longWord = " ";
        String line = text.readLine();

        //reads file line by line until it hits a blank one
        while(line != null){

            //sets the longest word if current word is longer than the one set
            if(line.length() > longWord.length()){

                longWord = line;
            }
            //reads next line of text
            line = text.readLine();
        }

        //closes text file
        text.close();
        
        //returns the longest word
        return longWord;
    }
/**
 * @param nums pull array
 * @return returns the copied array
 */
    public static int[] withoutTen(int[] nums){

        //creates new array to copy to and set the counter for it to 0
        int[] numsTenless = new int[nums.length];
        int numTenlessCounter = 0;

        //count the numbers in the array
        for(int count = 0; count < nums.length; count++){

            //copies numbers that are not equal to 10 to the new array
            if(nums[count] != 10){

                numsTenless[numTenlessCounter] = nums[count];
                numTenlessCounter++;
            }

            //add zeros to the end of the array to fill in the missing numbers
            if(numTenlessCounter < nums.length){
                numsTenless[numTenlessCounter] = 0;
            }
        }
        return numsTenless;
    }
    
    /**
     * @param outer the outer array
     * @param inner the inner array
     * @return returns if it is true or false
     */
    public static boolean linearIn(int[] outer, int[] inner){

        //set variables
        int counter = 0;
        boolean dupe = false;

        //loop to run matching numbers code
        for (int outerCount = 0; outerCount < outer.length-1; outerCount++){
            for (int innerCount = 0; innerCount < inner.length-1; innerCount++){

                //checks for matching numbers
                if(outer[outerCount] == inner[innerCount]){
                    dupe = true;
                    
                    //check for dupe numbers
                    if(dupe = true){
                        counter++;
                        dupe = false;
                    }
                }
            }
        }

        //checks to see if all numbers match
        if(counter == inner.length-1){
            return true;
        }
        return false;
    }

    /**
     * @param arr reads 2d array
     * @return returns the copied array with the row and column switched
     */
    public static int[][] invert(int[][] arr){

        //make new 2d array to copy to
        int [][] invertArr = new int[arr.length][arr.length];

        //loops through the array to count row and columns
        for(int rowCount = 0; rowCount< arr.length; rowCount++){
            for(int colCount = 0; colCount<arr.length;colCount++){

                //copy original array row as columns and columns as rows
                invertArr[rowCount][colCount] = arr[colCount][rowCount];
            }
        }
        //returns new array
        return invertArr;
    }
}


