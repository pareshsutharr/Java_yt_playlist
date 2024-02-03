import java.util.Scanner;

public class PatternPrograms {
    public static void main(String[] argu){
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.print("Enter pattern length : ");
        n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j<=i; j++) {
                System.out.print(" * ");
            }
            System.out.println();
        }
        sc.close();
    }
}