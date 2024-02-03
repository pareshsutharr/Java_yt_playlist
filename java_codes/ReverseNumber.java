import java.util.Scanner;

public class ReverseNumber{
    public static void main(String[] argu){
        Scanner sc = new Scanner(System.in);
        int n;
        int temp=0,rev=0;
        System.out.print("Enter Number To Reverse : ");
        n = sc.nextInt();
        while (n>0) {
        temp = n % 10;
        rev= temp+(rev*10);
        n = n/10; 
        }
        System.out.println("Reversed Number : "+rev);
        sc.close();
    }
}