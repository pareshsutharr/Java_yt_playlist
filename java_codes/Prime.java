import java.util.Scanner;

public class Prime {
   public static void main(String[] argu){
    int n,count=0;
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter Number to Check Prime or Not : ");
    n = sc.nextInt();
    for(int i=1;i<=n;i++){
    if (n%i==0){
        count++;
    }
    }
    if (count == 2) {
        System.out.println("prime number...");
    }else{
        System.out.println("Not prime...");
    }
    sc.close();
   } 
}
