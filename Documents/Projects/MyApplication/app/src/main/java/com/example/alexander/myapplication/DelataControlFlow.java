package com.example.alexander.myapplication;

/**
 * Created by alexander on 28/05/2018.
 */

public class DelataControlFlow {


    /**
     * Created by learnovate on 2/27/14.
     */

    static char[] alphabet = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};

    //English-language pangram tester

    //"Pack my box with five dozen liquor jugs."
    //"Mr. Jock, TV quiz PhD, bags few lynx."
    //"The quick red fox jumps over the lazy brown dog""
public static void main(String args[]) {
    start();
}
    public static void start() {

        char[] sentenceToTest = toCharacterArray("The quick red fox jumps");
        char[] missingLetters = new char[26];
        int aNumMisssing = 0;
        boolean notFound = false;

        //start here!

        int numOfMissingLetters = 0;

        for(int i=0;i<alphabet.length;i++){
            char letterToFind = alphabet[i];
            if(hasLetter(letterToFind, sentenceToTest) == false){ //has letter
                missingLetters[numOfMissingLetters] = letterToFind;
                numOfMissingLetters++;
            }

        }

        writeSuccess(numOfMissingLetters, missingLetters,sentenceToTest);


        // Find out if the 'sentenceToTest' is in fact a pangram.
        // then make a "writeSuccess" method call with the following pieces of data:
        // 1. number of missing letters (if any)
        // 2. which letters (if any)
        // 3. the original sentence
        //writeSuccess(int aNumMisssing, char[] aMissingLetters, char[] aSentence )

    }

    public static boolean hasLetter(char aLetter, char[] aSentence) {

        boolean found = false;
        int position = 0;
        while(!found) {
            if(aLetter == aSentence[position]) {
                //we found it
                found = true;
            } else if(position == aSentence.length-1){
                //we are at the end of the array
                break;
            } else {
                //increment the position in the array
                position++;
            }

        }

        return found;
    }


    //
    // This code is just to help us write easier to read code
    // it turns "sentence" into a char array of {'s','e','n','t','e','n','c','e'}
    //

    public static char[] toCharacterArray(String s) {
        if (s == null) {
            return null;
        }
        s = s.replaceAll("\\s","");
        char[] aSentence = new char[s.length()];
        for (int i = 0; i < s.length(); i++) {
                aSentence[i] = Character.toLowerCase(s.charAt(i));
        }
        return aSentence;
    }

    public static void writeToLog(int output) {
        System.out.println("OPERATOR " + String.valueOf(output));
    }

    public static void writeToLog(String output) {
        System.out.println("OPERATOR" + String.valueOf(output));
    }

    public static void writeSuccess(int aNumMisssing, char[] aMissingLetters, char[] aSentence) {

        System.out.println(("OPERATOR " + " testing sentence:" + String.valueOf(aSentence)));
        String message = String.valueOf(aNumMisssing) + " missing: " + String.valueOf(aMissingLetters).replaceAll("\\s","");
        System.out.println("OPERATOR " + message);
    }



}
