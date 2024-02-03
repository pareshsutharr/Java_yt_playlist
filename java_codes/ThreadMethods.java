
class A extends Thread {
    public void run() {
        for (int i = 0; i < 10; i++) {
            if (i == 1) {
              java.lang.Thread.yield();
            }
            System.out.println("i " + i);
        }
        System.out.println("End of Thread A");
    }
}

class B extends Thread {
    public void run() {
        for (int j = 0; j < 10; j++) {
            if (j==3) {
              try{
                sleep(5000);
              }catch(Exception e){
                System.out.println(e);
              }
            }
            System.out.println("j " + j);
        }
        System.out.println("End of Thread B");
    }
}


class C extends Thread {
    public void run() {
        for (int k = 0; k < 10; k++) {
            System.out.println("k " + k);
            if (k==3) {
               interrupt();
            }
        }
        System.out.println("End of Thread C");
    }
}
public class ThreadMethods {
    public static void main(String[] args) {
        A aa = new A();
        B bb = new B();
        C cc = new C();
        aa.start();
        bb.start();
        cc.start();
    }
}
