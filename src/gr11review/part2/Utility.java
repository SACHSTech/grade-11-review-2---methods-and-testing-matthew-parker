package gr11review.part2;

import java.io.*;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

public class Utility {
    /**
     * Return the sum of the numbers appearing in the string, ignoring all other characters. A number is a series of 1 or more digit chars in a row. 
     * @param str Take the given string
     * @return Return the sum of the numbers inside the string 
     * @author Parker Yang
     */
    public static int sumNumbers(String str) {
    // Delcare variables 
    int intSum = 0;
    int intPower = 0;
    int intLength = str.length() - 1;
    int intNumber;

    // For loop to find digits 
    for (int i = intLength; i >= 0; i--){
        if (Character.isDigit(str.charAt(i))){
            // Math to convert the number to seperate 1s, 10s, 100s, etc
            intNumber = Integer.parseInt(String.valueOf(str.charAt(i))) * (int) Math.pow(10, intPower);
            intSum = intSum + intNumber;
            intPower = intPower + 1;
        } else {
            // Reset power
            intPower = 0;
        } 
    }
        // Return answer
        return intSum;
    }

    /**
     * Contains a single word on each line, returns the word that has the highest count of vowels.
     * @param filenametxt File that contains all the content
     * @return The word with the most vowels
     * @throws IOException IOException
     * @author Parker Yang
     */
    public static String vowelCount(String filenametxt) throws IOException{
    // Buffer reader
    BufferedReader text = new BufferedReader(new FileReader(filenametxt));   

    // Declare variables
    int intVowel1 = 0;        
    int intVowel2 = 0;
    String strLine1; 
    String strLine2;
    String strResult = "";

    strLine1 = text.readLine();
    strLine2 = text.readLine();

    // Run code till it reaches the end of the file
    while (strLine1 != null){
        // Check vowels in the word 1
        for(int i = 0; i < strLine1.length(); i++){
            if(strLine1.charAt(i) == 'a' || strLine1.charAt(i) == 'e' || strLine1.charAt(i) == 'i' || strLine1.charAt(i) == 'o' || strLine1.charAt(i) == 'u'){
                intVowel1++;
            }
        }
        // Check vowels in the word 2
        for(int x = 0; x < strLine2.length(); x++){
            if(strLine2.charAt(x) == 'a' || strLine2.charAt(x) == 'e' || strLine2.charAt(x) == 'i' || strLine2.charAt(x) == 'o' || strLine2.charAt(x) == 'u'){
                intVowel2++;
            }
        }

        // Compare the 2 vowel counts
        if(intVowel2 > intVowel1){
            strResult = strLine2; 
        } else {
            strResult = strLine1;
        }
        
        intVowel1 = 0;
        intVowel2 = 0;
        strLine1 = text.readLine();
        strLine2 = text.readLine();
        }
        text.close();
    
        // Return answer
        return strResult;
    }

    /**
     * Rearranged so that all the zeros are grouped at the start of the array
     * @param nums How many numbers the array goes to 
     * @return Return the answer with the zeros in the front 
     * @author Parker Yang
     */
    public static int[] zeroFront(int[] nums){
        // Declare variables 
        int intPosition = 0;

        // For loop for check the whole array 
        for(int i = 0; i < nums.length; i++){
            // If the number is 0, make its position in the array at the start
            if(nums[i] == 0){
                nums[i] = nums[intPosition];
                nums[intPosition] = 0;
                intPosition++;
            }
        }
        // Return answer
        return nums;
    }

    /**
     * Repeats the number in an array till the max number
     * @param n Max number the array goes up to 
     * @return Return the max number the array goes to 
     * @author Parker Yang
     */
    public static int[] seriesUp(int n){
        // Declare variables
        int intNumber = 0; 
        int[] intArray = new int[n * (n + 1) / 2];

        // For loop to add numbers to continue the array 
        for(int i = 1; i <= n; i++){
            for(int x = 1; x <= i; x++){
                intArray[intNumber++] = x;
            }
        }
        // Return answer
        return intArray;
    }

    /**
     * Takes a 2D array and reverses all of the content in the 2D array
     * @param arr Takes the given array to reverse it 
     * @return Return the reversed array 
     * @author Parker Yang
     */
    public static int[][] reverse(int[][] arr){
        int [][] intResult = new int[arr.length][arr[0].length];

        // Declare variables 
        int intMax1 = arr[0].length - 1;
        int intMax2 = arr.length - 1;

        // Loop to reverse the array
        for(int intRow = 0; intRow <= intMax1; intRow++){
            for(int intColumn = 0; intColumn <= intMax2; intColumn++){
                intResult [intMax1 - intRow][intMax2 - intColumn] = arr[intRow][intColumn];
            }
        }

        // Return answer
        return intResult;
    }
}
