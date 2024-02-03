import java.util.Scanner;

class frequency{
 int a[] = new  int[10];
  int counter = 0;
 int key;
 void getdata(Scanner sc){
     System.out.print("Enter array Elements : ");
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }
         System.out.print("Enter Element to Search : ");
        key = sc.nextInt();
 }
 void search_element(){
 for (int i = 0; i < a.length; i++) {
            if (a[i] == key) {
                counter++;
            }
        }
        if (counter > 0) {
            System.out.println("ELement "+key+" frequency is : "+ counter);
        }
        else{
            System.out.println("Element Not Found");
        }
 }
}

public class FrequencyCounter {
    public static void main(String argu[]){
        Scanner sc =  new Scanner(System.in);
        frequency fc = new frequency();
        fc.getdata(sc);
        fc.search_element();
        sc.close();
    }
}
