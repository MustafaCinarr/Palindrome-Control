import java.util.Scanner;
import java.util.Stack;

public class Main {

    public static boolean isPalindrome(String word, Stack<Character> stack)
    {
        for (int i = (word.length() / 2 )+ 1; i < word.length() ; i++)
        {
            if (word.charAt(i) != stack.pop())
            {
                return false;
            }

        }
        return true;
    }

    public static void main(String[] args) {

        //Checking if a sentence/word is a palindrome or not
        // For example : level

        //The word to be checked is entered

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the sentence or the word...");
        String word = scanner.nextLine();

        //We place the letters of the word one by one on the stack

        Stack<Character> stack = new Stack<Character>();

        for (int i=0; i < word.length() / 2; i++ )
        {
           stack.push(word.charAt(i));
        }

        if (isPalindrome(word,stack))
        {
            System.out.println("This sentence is a Palindrome...");
        }
        else
        {
            System.out.println("This sentence isn't a Palindrome...");
        }

    }
}