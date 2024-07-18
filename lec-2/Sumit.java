// //Time = 04:35:00 to 05:10:00
// //Packages in Java

// => First go inside lec-2 folder
// => Then run (javac -d . Amit.java)
// => Then run (javac -d . Sumit.java)
// => Then run (java Package2.Sumit)

package Package2;
import Package1.*;
public class Sumit {
    public static void main(String[] args) {        
        Amit a1 = new Amit();
        a1.setData(10, 20);
        a1.display();
    }
}