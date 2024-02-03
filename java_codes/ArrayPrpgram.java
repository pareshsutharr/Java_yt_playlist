import java.util.Scanner;
public class ArrayPrpgram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a[] = new  int[10];
    System.out.println("Enter array values :");
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }
        for (int i = 0; i < a.length; i++) {
           System.out.print(" "+ a[i]);
        }
        sc.close();
    }
}
