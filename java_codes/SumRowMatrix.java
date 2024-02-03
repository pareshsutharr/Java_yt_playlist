import java.util.Scanner;
class array{
    int a[][] = new int[3][3];
    int temp;
    void putdata(Scanner sc) { 
         System.out.println();
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                System.out.print("Value of Index " + i + " " + j + " : ");
                a[i][j] = sc.nextInt();
            }
        }
    }

    void display2() {
         System.out.println("First Matrix");
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                System.out.print(" " + a[i][j]);
            }
            System.out.println();
        }
    }

    void SumRow() {
        System.out.println("SumRow of matrix");
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                temp = temp + a[i][j];
                System.out.print(" " + a[i][j]);
            }
            System.out.print(" row total : " + temp);
            System.out.println();
        }
    }
}

public class SumRowMatrix {
    public static void main(String argu[]) {
        Scanner sc = new Scanner(System.in);
        array aa = new array();
        aa.putdata(sc);
        aa.display2();
        aa.SumRow();
    }
}
