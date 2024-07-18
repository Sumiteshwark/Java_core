import java.util.*;

public class l0_input {
    public static void main(String Args[]){
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter name: ");
            String userName = sc.nextLine();  //For String
            System.out.print("Name is: ");
            System.out.println(userName);
        }
    }
}


// nextBoolean()	Reads a boolean value from the user
// nextByte()	Reads a byte value from the user
// nextDouble()	Reads a double value from the user
// nextFloat()	Reads a float value from the user
// nextInt()	Reads a int value from the user
// nextLine()	Reads a String value from the user
// nextLong()	Reads a long value from the user
// nextShort()	Reads a short value from the user