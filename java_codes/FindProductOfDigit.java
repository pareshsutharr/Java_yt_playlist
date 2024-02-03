//product of means example n=456  4*5*6=120

import java.util.Scanner;

public class FindProductOfDigit {  
    public static void main(String[] argu){
        Scanner sc = new Scanner(System.in);
        int n;
        int pro=1;
        System.out.println("enter Number :");
        n = sc.nextInt();
        while (n>0) {
            pro=pro*(n%10);
            n=n/10;
        }
        System.out.println(pro);
        sc.close();
    }
}
