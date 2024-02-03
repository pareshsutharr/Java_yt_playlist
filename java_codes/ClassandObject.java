import java.util.*;

public class ClassandObject {
    int a,b;
    void getdata(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter A Value : ");
        a = sc.nextInt();
        System.out.print("Enter B value : ");
        b = sc.nextInt();
        sc.close();
    }
    void putdata(){
        System.out.println("Addition is :" + (a+b));
    }
    public static void main(String[] argu){
        ClassandObject aa = new ClassandObject();
        aa.getdata();
        aa.putdata();
    }
}
