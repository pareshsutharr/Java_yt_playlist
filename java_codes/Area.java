import java.util.Scanner;
public class Area {
    public static void main(String argu[]){
    float len,bret,area;
    Scanner sc =new Scanner(System.in);
    System.out.print("Enter length : ");
    len = sc.nextFloat();
    System.out.print("Enter breath : ");
    bret = sc.nextFloat();
    area = len*bret;
    System.out.println("Total Area is :"+area);
    sc.close();
    }
}
