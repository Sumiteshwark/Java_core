// Time = 04:08:00 to 04:35:00
// In main there is (String []args), in this we can pass the argument while running the program.
//Example of command line argument
public class l1_cli {
    public static void main(String[] args) {
        int i, s=0;
        for(i=0; i<args.length; i++) {
            s += Integer.parseInt(args[i]); //we must have to pass the value while running the program.
        }
        System.out.println("Average is " + s/args.length);
    }
}
//For this first commpile the program(javac l1_wrapper_class.java) and then run the program(java l1_wrapper_class 10 20 30 20)

