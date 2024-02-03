import java.util.*;
// import java.lang.*;

public class StringBuffer {
public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     java.lang.StringBuffer str = new java.lang.StringBuffer("paresh");
     System.out.println("Enter a string : ");
     str.append(sc.nextLine());
    //  str.setCharAt(5,' ');
     str.insert(6, ' ');
     System.out.print(str);
     System.out.println(str.length());
     str.setLength(20);
     System.out.println(str.length());
     sc.close();
}    
}
