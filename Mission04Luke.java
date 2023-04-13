//import tools
import java.util.Scanner;

//beginning of main code
public class Mission04Luke
{
   public static void main (String[] args)
   {
      //Setup scanner tool to gather input
      Scanner in = new Scanner (System.in);
      
      //initialize variables to be used in code
      String input = "";
      String inputFrag = "";
      String consoClust = "";
      String pigLatin = "";
      char ch = 'a';
      int  sub01 = 0;
      
      //Main body of Pig Latin Translator
      //Welcome user and gather initial input
      System.out.println("Welcome to the Pig Latin Translator! Put normal words in, get pig latin out.");
      System.out.println("Please enter a word: ");
      input = in.nextLine();
      input.trim();
      
      
      //Initiate Do/While loop
      do
      {
         //for loop runs through characters in entry to begin translation process
         for (int i = 0; i < input.length(); i++)
         {
            ch = input.charAt(i);
            //test to see if first letter is a vowel or a consonant
            if (i == 0)
            {
            
               if (ch == 'a' || ch== 'e' || ch == 'i' || ch == 'o' || ch == 'u')
               {
                  // *perform translation process*
                  input = input + "way";
                  System.out.println("The translation is: " + input);
                  System.out.println("Enter another word to be translated (or enter Q to quit): ");
                  input = in.nextLine();
               }
            }
            else if (ch == 'a' || ch== 'e' || ch == 'i' || ch == 'o' || ch == 'u')
            {
               // *perform translation process*
               sub01 = i;
               i = input.length();
               //Create substrings
               consoClust = input.substring(0,sub01);
               inputFrag = input.substring((sub01),input.length());
               //Combine substrings into final output
               pigLatin = inputFrag + consoClust + "ay";
               //Output statement and request user for next input
               System.out.println("The translation is: " + pigLatin);
               System.out.println("Enter another word to be translated (or enter Q to quit): ");
               input = in.nextLine();

            }//end of if/else/if
         }//end of for loop        
      } while (!input.equalsIgnoreCase("Q"));   
   }//end of main method 
}//end of class