import java.util.Scanner;

public class StringPalindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = new String();
        int flag = 0;
        System.out.print("Enter word to check palindrome or not : ");
        name = sc.nextLine();
        int j = name.length() - 1;
        int i = 0;
        while (i < j && flag == 0) {
            if (name.charAt(i) != name.charAt(j)) {
                flag++;
            }
            i++;
            j--;
        }
        if (flag == 0) {
            System.out.print("Entered word is palindrome... ");
        } else {
            System.out.print("Entered word is not palindrome... ");
        }
        sc.close();
    }

}
