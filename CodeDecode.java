public class CodeDecode {
   public static String Code(String originalText, int shift) {
        char stringLetter;
        int remainder;
        StringBuilder updateText = new StringBuilder(originalText);  // used for character manipulation in string
        for(int i=0;i<originalText.length();i++) { // Loop all the characters of the string
              stringLetter = originalText.charAt(i); // Get the char from the index i of the string
              stringLetter += shift; // Add the characters needed
              remainder = (int)(stringLetter - 'z'); // Keep the number of characters that get outside the alphabet
              if(remainder > 0 )
                 stringLetter = (char)('a'+remainder-1); // Resetting the letter if it is over 'z', and substracting 1 because 'a' is the first letter
              updateText.setCharAt(i,stringLetter); // Changing the value in the text            
        }
        originalText = updateText.toString(); // Updating our string with the new values
        return originalText; // Returning the updated text
   }
   public static String DeCode(String originalText, int shift) {
        char stringLetter;
        int remainder;
        StringBuilder updateText = new StringBuilder(originalText);  // used for character manipulation in string
        for(int i=0;i<originalText.length();i++) { // Loop all the characters of the string
              stringLetter = originalText.charAt(i); // Get the char from the index i of the string
              stringLetter -= shift; // Substract the characters needed
              remainder = (int)('a' - stringLetter); // Keep the number of characters that get outside the alphabet
              if(remainder > 0 )
                 stringLetter = (char)('z'-remainder+1); // Resetting the letter if it is under 'a', and adding 1 because 'z' is the last letter
              updateText.setCharAt(i,stringLetter); // Changing the value in the text       
        }
        originalText = updateText.toString(); // Updating our string with the new values
        return originalText; // Returning the updated text
   }
}
