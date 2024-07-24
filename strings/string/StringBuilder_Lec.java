// => String is immutable.
// => StringBuffer is mutable and syncorized.
// => StringBuilder is mutable and non-syncorized.


package strings.string;
public class StringBuilder_Lec {
    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder("Hello");

        // == and equals() methods
        StringBuilder sb1 = new StringBuilder("Hello");
        System.out.println(sb == sb1);
        System.out.println(sb.equals(sb1)); //In String this will compare the content but in StringBuilder this will compare the reference.
        
        // // capacity(), length(), append(), insert(), deleteCharAt(), delete(), replace(), charAt(), setCharAt(), indexOf(), lastIndexOf()
        // System.out.println(sb.capacity()); //21 //16+length
        // System.out.println(sb.length()); //5
        // sb.append("World"); //sb = sb+"World" //Add at end
        // System.out.println(sb); //HelloWorld
        // sb.insert(0, "Hi"); //sb = "Hi"+sb //Insert at index 0
        // System.out.println(sb); //HiHelloWorld
        // sb.deleteCharAt(0); 
        // System.out.println(sb); //iHelloWorld 
        // sb.delete(1, 3); //delete chat at index 1 and 2
        // System.out.println(sb); //illoWorld
        // sb.replace(0, 2, "H"); //Remove chat at index 0 and 1 and add "H"
        // System.out.println(sb); //HloWorld
        // System.out.println(sb.charAt(0)); //H
        // sb.setCharAt(0, 'h'); //setCharAt can replace character at only one index.
        // System.out.println(sb); //hloWorld
        // System.out.println(sb.indexOf("l")); //1
        // System.out.println(sb.lastIndexOf("l")); //6


        // // subSequence() and substring()
        // //subSequence() method returns value in charSequence and substring() method returns value in String.
        // StringBuilder checkMethod2 = new StringBuilder("This is for demo Purpose");
        // System.out.println(checkMethod2.subSequence(2, 14)); //is is for de //Return value in charSequence from index 2 to 13
        // System.out.println(checkMethod2.substring(2)); //is is for demo Purpose //Return value in String from index 2 to end
        // System.out.println(checkMethod2.substring(2, 14)); //is is for de //Return value in String from index 2 to 13

    }
}