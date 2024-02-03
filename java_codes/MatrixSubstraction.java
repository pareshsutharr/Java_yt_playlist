import java.util.Scanner;

class array1 {
    int a[][] = new int[3][3];

    void getdata(Scanner sc) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                System.out.print("Value of Index " + i + " " + j + " : ");
                a[i][j] = sc.nextInt();
            }
        }
    }

    void display() {
           System.out.println("Second Matrix");
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                System.out.print(" " + a[i][j]);
            }
            System.out.println();
        }
    }
}

class array2 extends array1 {
    int b[][] = new int[3][3];
    int c[][] = new int[3][3];

    void putdata(Scanner sc) { 
         System.out.println();
        for (int i = 0; i < b.length; i++) {
            for (int j = 0; j < b.length; j++) {
                System.out.print("Value of Index " + i + " " + j + " : ");
                b[i][j] = sc.nextInt();
            }
        }
    }

    void display2() {
         System.out.println("First Matrix");
        for (int i = 0; i < b.length; i++) {
            for (int j = 0; j < b.length; j++) {
                System.out.print(" " + b[i][j]);
            }
            System.out.println();
        }
    }

    void Substraction() {
        System.out.println("Substraction of two matrix");
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                c[i][j] = a[i][j] - b[i][j];
            }
        }
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                System.out.print(" " + c[i][j]);
            }
            System.out.println();
        }
    }
}

public class MatrixSubstraction {
    public static void main(String argu[]) {
        Scanner sc = new Scanner(System.in);
        array2 aa = new array2();
        aa.getdata(sc);
        aa.putdata(sc);
        aa.display2();
        aa.display();
        aa.Substraction();
    }
}