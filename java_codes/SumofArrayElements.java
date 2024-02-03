import java.util.Scanner;
public class SumofArrayElements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        int a[] = new int[10];
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }
        for (int i = 0; i < a.length; i++) {
            sum = sum + a[i];
        }
        System.out.println("Sum Of Array Element Is : "+sum);
        sc.close();
    }
}
