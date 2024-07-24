// Time: 08:28:00 to 09:00:00

// => Multitasking allows the CPU to perform multiple tasks(or to run multiple apps) simultaneously, whereas multithreading allows the CPU to execute multiple threads of the same process simultaneously.
// => Multithreading can be achieved in two ways: 1> Using Runnable Interface 2> Using Thread Class



// // => Multithreading using Runnable Interface (in runnable interface, there is run method(it is by default public and static because of interface), so we have to override run method.)
// class process1 implements Runnable{
//     public void run(){
//        for (int i=1; i<=5; i++){
//            System.out.println("process1: " + i);
//        }
//     }
// }
// class process2 implements Runnable{
//     public void run(){
//        for (int i=1; i<=5; i++){
//            System.out.println("process2: " + i);
//        }
//     }
// }
// public class l6_multithreading {
//     public static void main(String[] args) {    
//         process1 p1 = new process1();
//         process2 p2 = new process2();
//         Thread t1 = new Thread(p1);
//         Thread t2 = new Thread(p2);
//         t1.start();
//         t2.start();
//         for(int i=1; i<=5; i++){
//             System.out.println("Main: " + i);
//         }
//     }
// }







// => Multithreading using Thread Class
class process1 extends Thread{
    public void run(){
       for (int i=1; i<=5; i++){
           System.out.println("process1: " + i);
       }
    }
}
class process2 extends Thread{
    public void run(){
       for (int i=1; i<=5; i++){
           System.out.println("process2: " + i);
       }
    }
}
public class l6_multithreading {
    public static void main(String[] args) {    
        process1 p1 = new process1();
        process2 p2 = new process2();
        p1.start();
        p2.start();
        for(int i=1; i<=5; i++){
            System.out.println("Main: " + i);
        }
    }
}
