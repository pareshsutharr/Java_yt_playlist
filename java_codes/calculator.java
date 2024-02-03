import java.util.Scanner;

public class calculator {
    int a, b, c;
    Scanner sc = new Scanner(System.in);

    public static void main(String[] argu) {
        calculator ad = new calculator();
        int choise;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.print(
                    " 1. addition\n 2. substraction \n 3. multiplication\n 4. Division \n Enter Your Choise To Continue >> ");
            choise = sc.nextInt();
            switch (choise) {
                case 1:
                    ad.addition();
                    break;

                case 2:
                    ad.subtraction();
                    break;

                case 3:
                    ad.multiplication();
                    break;

                case 4:
                    ad.division();
                    break;

                default:
                    System.out.println("Invalid Choise Selected..");
                    break;
            }
        } while (choise != 0);
        sc.close();
    }

    public void addition() {
        System.out.println("Enter Two Number To Add : ");
        a = sc.nextInt();
        b = sc.nextInt();
        c = a + b;
        System.out.println("Addition of " + a + " + " + b + " is " + c);
    }

    public void subtraction() {
        System.out.println("Enter Two Number To subtraction : ");
        a = sc.nextInt();
        b = sc.nextInt();
        c = a - b;
        System.out.println("subtraction of " + a + " - " + b + " is " + c);
    }

    public void multiplication() {
        System.out.println("Enter Two Number To multiplication : ");
        a = sc.nextInt();
        b = sc.nextInt();
        c = a * b;
        System.out.println("multiplication of " + a + " * " + b + " is " + c);
    }

    public void division() {
        System.out.println("Enter Two Number To division : ");
        a = sc.nextInt();
        b = sc.nextInt();
        c = a / b;
        System.out.println("division of " + a + " / " + b + " is " + c);
    }
}
