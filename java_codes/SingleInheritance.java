import java.util.Scanner;
class A{
    int a,b;
    void getdata(Scanner sc){
        System.out.print("Enter First Number : ");
        a = sc.nextInt();
        System.out.print("Enter Second Number : ");
        b = sc.nextInt();
    }
    void add(){
        System.out.println("Addition is : "+(a+b));
    }
}
class B extends A{
    int c;
    void putdata(Scanner sc){
       
        System.out.print("Enter a Number : ");
        c = sc.nextInt();
    }
    void display(){
        System.out.print("C value is : "+c);
    }
}
public class SingleInheritance {
    public static void main(String[] argu){
        Scanner sc = new Scanner(System.in);
        B aa = new B();
        aa.getdata(sc);
        aa.add();
        aa.putdata(sc);
        aa.display();
        sc.close();
    }
}
