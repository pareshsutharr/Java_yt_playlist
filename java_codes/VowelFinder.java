import java.util.Scanner;


class InnerVowelFinder {
    String name = new String();
    String vowel = "aeiou";
    int vol=0;
    int con=0;
    void getdata(Scanner sc){
    System.out.println("enter word to check vowel : ");
    name = sc.nextLine(); 
    }
    void vowel(){
        for (int i = 0; i < name.length(); i++) {
            for (int j = 0; j < vowel.length(); j++) {
                if(name.charAt(i) == vowel.charAt(j)){
                    vol++;
                    con--;
                }
            }
            con++;
        }
        System.out.println("Vowel is : "+ vol + "\nconsonant : "+con);
    }
}
public class VowelFinder {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    InnerVowelFinder word = new InnerVowelFinder();
    word.getdata(sc);
    word.vowel();
}
}
