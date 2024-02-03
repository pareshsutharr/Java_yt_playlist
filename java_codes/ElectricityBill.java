import java.util.Scanner;
public class ElectricityBill {
    public static void main(String argu[]){
        String name;
        int unit;
        double totalcharges;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Your Name : ");
        name = sc.nextLine();
        System.out.print("Enter Unit used value :");
        unit = sc.nextInt();
        System.out.println("Biller Name :"+name);
        if(unit<=100){
            totalcharges = unit*0.60;
            System.out.println("Total Bill is : "+totalcharges);
        }
        else if(unit>100 && unit <=300){
            totalcharges = 60+(0.80*(unit-100));
            System.out.println("Total Bill is : "+totalcharges);
        }
        else if(unit>300){
            totalcharges = 160+(60+(0.90*(unit-300)));
            System.out.println("Total Bill is : "+totalcharges);
        }
        else {
            System.out.println("unit cannot be lessthan 0..");
        }
        sc.close();
    }
}
