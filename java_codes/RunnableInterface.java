class A implements Runnable {
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }
        System.out.println("loop complete...");
    }
}

public class RunnableInterface {
    public static void main(String[] argu){
        A aa = new A();
        Thread tt = new Thread(aa);
        tt.start();
    }
}

//below program is extending Thread

// class B extends Thread{
//     public void run() {
//         for (int i = 0; i < 10; i++) {
//             System.out.println(i);
//         }
//         System.out.println("loop complete...");
//     }
// }

// // public class RunnableInterface {
//     public static void main(String[] argu){
//         B aa = new A();
//         // Thread tt = new Thread(aa);
//         aa.start();
//     }
// }
