package gr11review.part2;

import java.util.*;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Utility {

    public static boolean xyBalance(String str){
        
        boolean why = false;

        for(int i = str.length(); i >= 0; i--){
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

        String longWord = "";
        String line = text.readLine();

        while(line != null){

            line = text.readLine();
            
            if(line.length()>longWord.length()){
                line = longWord;
            }
        }

        text.close();
        
        
        return longWord;
    }
    
}