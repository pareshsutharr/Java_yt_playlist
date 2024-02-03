import java.util.Scanner;

class boss {
    String name;
    int age;
    String cname;

    void boss_input(Scanner sc) {
        System.out.print("Enter Boss Name : ");
        name = sc.nextLine();
        System.out.print("Enter Boss age : ");
        age = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter Company Name: ");
        cname = sc.nextLine();
    }

    void boss_details() {
        System.out.println("Boss Name Is : " + name + " \nage : " + age);
    }

    void companyname() {
        System.out.println("Company name is : " + cname);
    }
}

class employee extends boss {
    String name;
    int age;
    double salary = 10000;

    void employee_input(Scanner sc) {
        System.out.print("Enter Employee Name : ");
        name = sc.nextLine();
        System.out.print("Enter Employee age : ");
        age = sc.nextInt();
        sc.nextLine();
    }

    void employee_details() {
        System.out.println("Employee Name Is : " + name + " \nEmployee : " + age);
    }

    void employee_salary() {
        System.out.println("Employee salary is :" + salary);
    }
}

class customer extends employee {
    String name;
    int age;

    void customer_input(Scanner sc) {
        System.out.print("Enter Customer Name : ");
        name = sc.nextLine();
        System.out.print("Enter Customer age : ");
        age = sc.nextInt();
    }

    void customer_details() {
        System.out.println("customer Name Is : " + name + " \ncustomer : " + age);
    }
}

public class MultilevelInheritance {
    public static void main(String[] argu) {
        Scanner sc = new Scanner(System.in);
        customer aa = new customer();
        aa.boss_input(sc);
        aa.employee_input(sc);
        aa.customer_input(sc);
        aa.companyname();
        aa.boss_details();
        aa.employee_details();
        aa.employee_salary();
        aa.customer_details();
        sc.close();
    }
}
