//String is immutable.


package a1_strings;
public class String_Lec{
    public static void main(String[] args) {
        String class1 = new String("Class"); // This creates new object in heap memory and also stores the value in string constant pool/string literal pool.
        String class2 = new String("Class"); // This also creates new object in heap memory but not store value in string constant pool because it already exist.
        String string1 = "String"; //It only stores the value in string constant pool/string literal and string1 points to it.
        String string2 = "String"; //It will not create the new value in string constant pool/string literal but it will point to the above object created because "String" already exist.

        System.out.println(class1 == class2); //false, because it compares the reference of heap memory and both pointing to differnet objects in heap.
        System.out.println(class1.equals(class2)); //true, because it compares the content of the objects in string constant pool/string literal.
        System.out.println(string1 == string2); //true, because in (String string1 = "String") value only stored in string constant pool/string literal.
        System.out.println(string1.equals(string2)); //true

        // class1.concat("class1"); //This will not change the value of class1, because string is immutable
        // System.out.println(class1);
        // string1.concat("string1"); //This will change the value of string1, because string is mutable
        // System.out.println(string1);

        // class1 = class1.concat("newclass1"); // In heap memory this will point to same object only change the value and create new object in strint constant pool.
        // System.out.println(class1);
        // string1 = string1.concat("newstring1"); //This will create new object in string constant pool and point to this object and old is still there.
        // System.out.println(string1);

        // //length(), isEmpty(), trim()
        // String checkMethod = " Sumit ";
        // System.out.println(checkMethod.length()); //7 //Return length of string(ie int).
        // System.out.println(checkMethod.isEmpty()); //false //Return true if string is empty.
        // System.out.println(checkMethod.trim()); //Sumit //This will remove all starting and ending spaces and return string.
        // System.out.println(checkMethod.trim().length()); //5 //Return length of string after removing starting and ending spaces.
 
        // // + operator, concat(), join()
        // String checkMethod1 = "Sumit";
        // System.out.println(10 + 20 + checkMethod1); //30Sumit
        // System.out.println(checkMethod1 + 10 + 20); //Sumit1020
        // System.out.println(checkMethod1 + 30/10); //30Sumit
        // System.out.println(checkMethod1.concat("OnlyContainString")); //Inside concat we can only pass string.
        // System.out.println(String.join(",",checkMethod1, null)); //Sumit,null
        // System.out.println(String.join(",",checkMethod1)); //Sumit
        // System.out.println(String.join(",", checkMethod1 , "Kumar", "Sharma")); //Sumit,Kumar,Sharma

        // // subSequence() and substring()
        // //subSequence() method returns value in charSequence and substring() method returns value in String.
        // String checkMethod2 = "This is for demo Purpose";
        // System.out.println(checkMethod2.subSequence(2, 14)); //is is for de //Return value in charSequence from index 2 to 13
        // System.out.println(checkMethod2.substring(2)); //is is for demo Purpose //Return value in String from index 2 to end
        // System.out.println(checkMethod2.substring(2, 14)); //is is for de //Return value in String from index 2 to 13

        // // replace(), replaceFirst()
        // String checkMethod3 = "This is demo";
        // System.out.println(checkMethod3.replace("is", "was")); //Thwas was demo //Replace all is with was although if is is present in word(this -> thwas)
        // System.out.println(checkMethod3.replaceFirst("is", "was")); //Thwas is demo //Replace first is with was(here this->thwas)

        // // indexOf(), lastIndexOf(), contains(), startsWith(), endsWith(), charAt()
        // String checkMethod4 = "This is demo";
        // System.out.println(checkMethod4.indexOf("is")); //2
        // System.out.println(checkMethod4.lastIndexOf("is")); //5
        // System.out.println(checkMethod4.contains("his")); //true
        // System.out.println(checkMethod4.startsWith("Th")); //true
        // System.out.println(checkMethod4.endsWith("emo")); //true
        // System.out.println(checkMethod4.charAt(2)); //i

        // // Case conversion(toUpperCase(), toLowerCase()), Type conversion(valueOf(), toCharArray())
        // // valueOf() method returns different data type in String and toCharArray() method returns string in character array.
        // System.out.println(checkMethod.toUpperCase()); //Convert to upper case.
        // System.out.println(checkMethod.toLowerCase()); //Convert to lower case.
        // int a=10;
        // String s="Sumit";
        // String a1 = String.valueOf(a); //Return integer value in String
        // char[] s1 = s.toCharArray(); //Convert String to character array
        // System.out.println(a1); //10 
        // System.out.println(s1); //Sumit 
        // System.out.println(s1[1]); //u //can be done because it is array.

    }
}
