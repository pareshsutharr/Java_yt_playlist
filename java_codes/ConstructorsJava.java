import java.util.*;
class add{
    int a,b;
    add(int x,int y){  ///this is parameterized constructor in java
     a=x;
     b=y;
    }
    void putdata(){
        System.out.println("Addition is : " +(a+b));
    }
}
public class ConstructorsJava {
    public static void main(String argu[]){
        int a,b;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter A Value : ");
        a = sc.nextInt();
        System.out.print("Enter B Value : ");
        b = sc.nextInt();
        add aa = new add(a, b);
        aa.putdata();
        sc.close();
    }
}
