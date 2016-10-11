import java.util.Scanner;

public class MainProgram {
  public static void main(String[] args) {
       CodeDecode codeDecode = new CodeDecode(); // Create a copy of the CodeDecode class
       Scanner scanInput = new Scanner(System.in); // Using scanner for text and integer input
       String originalText,modifiedText; // Two strings, one that keeps the original one, and one that will be modified
       int shift; // The number of shifts
       System.out.println("Enter the original text:");
       originalText = scanInput.nextLine();
       System.out.println("Enter the number of characters you want to shift:");
       shift = scanInput.nextInt();
       shift = shift%26; // If we make more than 26 addings, we are basically doing nothing.
       System.out.println("You have entered the text: " + originalText);
       modifiedText = codeDecode.Code(originalText, shift); // The coded text is made
       System.out.println("The text after coding is: " + modifiedText);
       originalText = codeDecode.DeCode(modifiedText, shift); // The original text, we will put it in the original variable
       System.out.println("The text after decoding is: " + originalText);
  }
}
