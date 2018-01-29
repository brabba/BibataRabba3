import java.io.File;
import java.util.Scanner;

public class ProgramExercise4 {
   //Helper function that will translate words to pig latin words
    public static void ProgramExercise4(String word){
      	//turn word from string form to char array form
        char[] letterBank = word.toLowerCase().toCharArray();
      	//vowels
        String vowel  = "aeiouy";
      	//used for pig latin rules to attach to original words
        String rulePrefix = "ay";
        String rulePrefix2 = "yay";
		//If word starts with vowel simply attach "yay"
        if(vowel.contains(Character.toString(letterBank[0]))){
            System.out.println(word + "\t\t" + (word + rulePrefix2).toUpperCase());

        }
        //if starts with prefix, intial consonents before first vowel are placed at end. Then attach "ay"
        else
        {
            int counter = 0;
            String newSeq = "";
            String original = word.substring(counter);

            while(!vowel.contains(Character.toString(letterBank[counter])) && counter < word.length()-1)
            {
                counter++;
                newSeq = newSeq + letterBank[counter];
            }
            System.out.println(word + "\t\t" + (original + newSeq + rulePrefix).toUpperCase());
        }



    }
    public static void main(String[] args) throws Exception {
      //for text file replace empty string
        String fileLocation = " ";
      	//Read in file using scanner
        File file = new File(fileLocation);
        Scanner scan = new Scanner(file);
		//while text file has words call helper function
        while(scan.hasNext()){
            ProgramExercise4(scan.next());
        }

    }

}
