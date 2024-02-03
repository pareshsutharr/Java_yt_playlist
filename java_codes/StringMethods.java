public class StringMethods {
        public static void main(String[] args) {
            // Creating a String
            String str = "Hello, World!";
    
            // 1. length() - Returns the length of the string
            int length = str.length();
            System.out.println("Length of the string: " + length);
    
            // 2. charAt() - Returns the character at the specified index
            char charAtIndex = str.charAt(7);
            System.out.println("Character at index 7: " + charAtIndex);
    
            // 3. substring() - Returns a substring of the original string
            String substring = str.substring(0, 5);
            System.out.println("Substring from index 0 to 4: " + substring);
    
            // 4. concat() - Concatenates two strings
            String newString = str.concat(" This is a Java program.");
            System.out.println("Concatenated string: " + newString);
    
            // 5. indexOf() - Returns the index of the first occurrence of a specified substring
            int indexOfWorld = str.indexOf("World");
            System.out.println("Index of 'World': " + indexOfWorld);
    
            // 6. replace() - Replaces occurrences of a specified substring with another substring
            String replacedString = str.replace("Hello", "Hi");
            System.out.println("String after replacement: " + replacedString);
    
            // 7. toUpperCase() - Converts the string to uppercase
            String upperCaseString = str.toUpperCase();
            System.out.println("Uppercase string: " + upperCaseString);
    
            // 8. toLowerCase() - Converts the string to lowercase
            String lowerCaseString = str.toLowerCase();
            System.out.println("Lowercase string: " + lowerCaseString);
    
            // 9. trim() - Removes leading and trailing whitespaces
            String stringWithSpaces = "   Hello,   World!   ";
            String trimmedString = stringWithSpaces.trim();
            System.out.println("String after trimming: '" + trimmedString + "'");
    
            // 10. startsWith() - Checks if the string starts with a specified prefix
            boolean startsWithHello = str.startsWith("Hello");
            System.out.println("String starts with 'Hello': " + startsWithHello);
    
            // 11. endsWith() - Checks if the string ends with a specified suffix
            boolean endsWithWorld = str.endsWith("World!");
            System.out.println("String ends with 'World!': " + endsWithWorld);
        }
    
}
