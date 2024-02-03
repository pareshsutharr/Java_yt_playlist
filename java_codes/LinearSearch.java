import java.util.Scanner;
public class LinearSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a[] = new int[10];
        int searchElement;
        System.out.print("Enter element to search : ");
        searchElement = sc.nextInt();

        //adding elements is a array
        
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }

        // finding elemet in a array 

        for (int i = 0; i < a.length; i++) {
            if (a[i] == searchElement) {
                System.out.println("Element found at position : "+i+ " value is : "+ a[i]);
            }
        }

            sc.close();
    }
}
