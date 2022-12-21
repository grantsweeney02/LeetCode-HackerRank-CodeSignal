import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        while(scan.hasNextLine()) {
            String input = scan.nextLine();
            String[] inputSplit = input.split(";");
            String first = inputSplit[0];
            String second = inputSplit[1];
            String third = inputSplit[2];
            if(first.equals("S")) {
                if(second.equals("M")) {
                    third = third.substring(0,third.length()-2); // removes ()
                    String[] camelCaseWords = third.split("(?=[A-Z])"); // split at capital
                    int length = camelCaseWords.length;
                    for(int i = 0; i < length; i++) {
                        if(length == 1) {
                            System.out.println(camelCaseWords[i]);
                        }
                        else if(i == 0) {
                            System.out.print(camelCaseWords[i].toLowerCase());
                        }
                        else if(i == length-1) {
                            System.out.println(" " + camelCaseWords[i].toLowerCase());
                        }
                        else {
                            System.out.print(" " + camelCaseWords[i].toLowerCase());
                        }
                        
                    }
                }
                else {
                    String[] camelCaseWords = third.split("(?=[A-Z])"); // split at capital
                    int length = camelCaseWords.length;
                    for(int i = 0; i < length; i++) {
                        if(length == 1) {
                            System.out.println(camelCaseWords[i]);
                        }
                        else if(i == 0) {
                            System.out.print(camelCaseWords[i].toLowerCase());
                        }
                        else if(i == length-1) {
                            System.out.println(" " + camelCaseWords[i].toLowerCase());
                        }
                        else {
                            System.out.print(" " + camelCaseWords[i].toLowerCase());
                        }
                        
                    }
                }
            }
            else {
                if(second.equals("M")) {
                    char[] phraseChars = third.toCharArray();
                    for (int i = 0; i < phraseChars.length - 1; i++) {
                        if(phraseChars[i] == ' ') {
                            phraseChars[i+1] = Character.toUpperCase(phraseChars[i+1]);
                        }
                    }
                    third = String.valueOf(phraseChars);
                    third = third.replace(" ", "");
                    third += "()";
                    System.out.println(third);
                }
                else if(second.equals("V")){
                    char[] phraseChars = third.toCharArray();
                    for (int i = 0; i < phraseChars.length - 1; i++) {
                        if(phraseChars[i] == ' ') {
                            phraseChars[i+1] = Character.toUpperCase(phraseChars[i+1]);
                        }
                    }
                    third = String.valueOf(phraseChars);
                    third = third.replace(" ", "");
                    System.out.println(third);
                }
                else {
                    char[] phraseChars = third.toCharArray();
                    for (int i = 0; i < phraseChars.length - 1; i++) {
                        if(phraseChars[i] == ' ') {
                            phraseChars[i+1] = Character.toUpperCase(phraseChars[i+1]);
                        }
                    }
                    phraseChars[0] = Character.toUpperCase(phraseChars[0]);
                    third = String.valueOf(phraseChars);
                    third = third.replace(" ", "");
                    System.out.println(third);
                }
            }
            
        }
    }
}
