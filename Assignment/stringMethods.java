public class StringMethodsExample {
    public static void main(String[] args) {
        String text = "Hello, World!";
        
        // Length of the string
        int length = text.length();
        System.out.println("Length of the string: " + length);

        // Convert to uppercase and lowercase
        String uppercase = text.toUpperCase();
        String lowercase = text.toLowerCase();
        System.out.println("Uppercase: " + uppercase);
        System.out.println("Lowercase: " + lowercase);

        // Substring
        String substring = text.substring(7);
        System.out.println("Substring from index 7: " + substring);

        // Concatenation
        String concatText = text.concat(" How are you?");
        System.out.println("Concatenated text: " + concatText);

        // Index of a character or substring
        int indexOfComma = text.indexOf(",");
        System.out.println("Index of comma: " + indexOfComma);

        // Replace
        String replacedText = text.replace("World", "Universe");
        System.out.println("Replaced text: " + replacedText);

        // Trim
        String paddedText = "   This is padded.   ";
        String trimmedText = paddedText.trim();
        System.out.println("Trimmed text: " + trimmedText);
    }
}
