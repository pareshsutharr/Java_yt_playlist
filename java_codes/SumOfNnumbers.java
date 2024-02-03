import java.util.Scanner;

public class SumOfNnumbers {
    public static void main(String argu[]) {
        int n, temp = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("enter N number : ");
        n = sc.nextInt();
        for (int i = 0; i <= n; i++) {
            temp = temp + i;
        }
        n = temp;
        System.out.println("Sum of N number is : " + n);
        sc.close();
    }
}
