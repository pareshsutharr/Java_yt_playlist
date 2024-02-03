class printing{
    synchronized void print(char ch){   ///if you remove synchronized keyword it will anomiyous
        for (int i = 0; i <=10; i++) {
            for (int j = 0; j <=i; j++) {
                System.out.print(ch);
            }
            System.out.println();
            // System.out.println();
        }
    }
}
class A extends Thread{
    printing ph;
    A(printing p){
        this.ph = p;
    }
    public void run(){
        ph.print('*');
    }
}
class B extends Thread{
     printing ph;
    B(printing p){
        this.ph = p;
    }
    public void run(){
        ph.print('#');
    }
}
public class Synchronizasion {
    public static void main(String[] args) {
        printing ph = new printing();
        A thread1 = new A(ph);
        B thread2 = new B(ph);
        thread1.start();
        thread2.start();
    }
}
