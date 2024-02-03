import java.util.*;
public class evenOdd {
    public static void main(String argu[]){
        int num;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number to check even or odd : ");
        num = sc.nextInt();
        if(num%2==0){
            System.out.print(num+" is an Even Number..");
        }else{
            System.out.println(num+" is an Odd Number..");
        }
        sc.close();
    }
}
