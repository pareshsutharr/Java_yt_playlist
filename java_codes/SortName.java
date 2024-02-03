public class SortName {
    public static void main(String[] args) {
        String str = "Paresh Sumar Shantilal";
        int i = str.length() - 1;

        // Find the last space in the string
        while (i >= 0 && str.charAt(i) != ' ') {
            i--;
        }

        int j = 0;

        while (j <= i) {
            if (j == 0 || (j > 0 && str.charAt(j - 1) == ' ' && str.charAt(j) != ' ')) {
                // If it's the first character or a non-space follows a space, print the initial
                System.out.print(str.charAt(j) + ".");
            }
            j++;
        }

        // Print the remaining part of the string after the last space
        System.out.println(str.substring(i + 1));
    }
}
