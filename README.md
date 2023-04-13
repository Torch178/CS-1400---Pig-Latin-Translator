# CS-1400---Pig-Latin-Translator

The program takes user input and translates single words into pig latin.
Pig Latin abides by the following rules:

1.) If a word starts with a consonant and a vowel, put the first letter of the word at the end of the word and add "ay."
Example: Happy = appyh + ay = appyhay

2.) If a word starts with two consonants move the two consonants to the end of the word and add "ay."
Example: Child = Ildch + ay = Ildchay

3.) If a word starts with a vowel add the word "way" at the end of the word.
Example: Awesome = Awesome +way = Awesomeway

The program accomplishes this by iterating through each character of the string in a for loop checking to see if the character is a vowel, or consonant. The program then separates the parts of the word which need to be rearranged (see rule 1 & 2) into substrings, concatenating "ay" or "way" onto the end of the string accordingly. The program then outputs the translation to the user, before requesting aditional input. The user continues to enter words for translation until they enter "q" / "Q" to quit.

Program Execution Screenshot:

![image](https://user-images.githubusercontent.com/70240084/231835600-92982934-38d6-4ac9-8899-acc54a92321d.png)
