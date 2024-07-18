// => Method overriding is the act of declaring a method in a subclass that is already present in a parent class.
// => It is Run-time polymorphism.
// => It must have need of inheritance.
// => Methods have same name and same signatures.
// => It can't overload private and final methods




// Class Math

class Math {

    // method say which is overridden method here

   public void say() {

      System.out.println("This is class Math");

   }

}

// Class Topic

class Topic extends Math {

    // method say which is overriding method here

   public void say() {

      System.out.println("This is class Topics");

   }

}

public class l3_function_overriding {

   public static void main(String args[]) {

      Math a = new Math(); // Math reference and object

      Math b = new Topic(); // Math reference but Topic object

      a.say(); // runs the method in Math class

      b.say(); // runs the method in Topic class

   }

}
