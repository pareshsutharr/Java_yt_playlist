class A extends Thread{
    public void run(){
        for (int i = 0; i < 5; i++) {
                //   System.out.println("A");
            System.out.println("i = "+i);
        }
        System.out.println("Class A fineshed");
    }
}
class B extends Thread{
    public void run(){
        for (int i = 0; i < 5; i++) {
                //   System.out.println("B");
            System.out.println("j = "+i);
        }
        System.out.println("Class B fineshed");
    }
}
class C extends Thread{
    public void run(){
        for (int i = 0; i < 5; i++) {
            // System.out.println("C");
            System.out.println("k = "+i);
        }
        System.out.println("Class C fineshed");
    }
}
public class GetPrioritySetPriority {
    public static void main(String[] args) {
    A aa = new A();
    B bb = new B();
    C cc = new C();
    bb.setPriority(aa.getPriority()+1);
    cc.setPriority(bb.getPriority()+2);
    System.out.println(aa.getPriority());
    System.out.println(bb.getPriority());
    System.out.println(cc.getPriority());
    aa.start();
    bb.start();
    cc.start();

    }
}
