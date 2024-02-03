class A extends Thread{
    public void run(){
        for (int i = 0; i < 5; i++) {
            System.out.println("i "+i);
        }
    }
}
class B extends Thread{
    public void run(){
        for (int j = 0; j < 5; j++) {
            System.out.println("j "+j);
        }
    }
}
class C extends Thread{
    public void run(){
        for (int k = 0; k < 5; k++) {
            System.out.println("k "+k);
        }
    }
}
public class TestingTest {
    public static void main(String[] argu){
        A aa = new A();
        B bb = new B();
        C cc = new C();
        aa.start();
        bb.start();
        cc.start();
    }
}
