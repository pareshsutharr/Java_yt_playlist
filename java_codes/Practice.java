// import java.util.*;

// public class Practice{
//     public static void main(String argu[]){
//         System.out.println("hello");
//         Scanner sc = new Scanner(System.in);
//         Practice prac = new Practice();
//         child cd = new child();
//         int a,b=10;
//         System.out.print("enter a number :");
//         a = sc.nextInt();
//         System.out.println(a);
//         prac.display();
//         System.out.println(a + "" + b);
//         cd.getdata(sc);
//         sc.close();
//     }
//     void display(){
//         System.out.println("function display");
//     }
// }
// class child{
//     void getdata(Scanner sc){
//         int a;
//         System.out.println("enter a data : ");
//         a = sc.nextInt();
//         System.out.println(a);
//     }
// }


// import java.util.*;

// public class Practice{
//     public static void main(String argu[]){
//         Scanner sc = new Scanner(System.in);
//         Vector<String> vc = new Vector<String>();
//         vc.addElement("paresh");
//         vc.addElement("paresh");
//         vc.addElement("paresh");
//         vc.addElement("paresh");
//         vc.addElement("paresh");
//         System.out.println(vc.size());
//         System.out.println(vc);
//         vc.remove(2);
//         vc.add(2,"divesh");
//         System.out.println(vc);
//         sc.close();
//     }
// }




import java.util.*;

class A{
    void display(){
        System.out.println("under display..");
    }
}
interface B {
    void getdata();
}

class C extends A implements B{
    public void getdata(){
        System.out.println("under interface...");
    }

}

public class Practice{
    public static void main(String argu[]){
        Scanner sc = new Scanner(System.in);
        
        sc.close();
    }
}
