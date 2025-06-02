public class HelloDemo{
  public static void main(String[] args) {
    /*System.out.println("Hello, world");
    System.out.println("Welcome walker");*/
    //int age = 21 ; // variable declaration and initialization
    //String name  = "Walker" ;
    //age = 30 ; // variable reassignment
    //final int age  = 21; // final variable declaration (constant)
    //age = 30; // This will cause an error because age is a final variable
    //System.out.println(age);
    //System.out.println(name);
    //System.out.println("Hello,"  +  name); // String concatenation
    /*String firstName  = "Johnson" ;
    String nickName  = "Walker" ;
    String fullName  = firstName + " " + nickName; // String concatenation
    System.out.println(fullName);*/

    // adding two numbers  
    /*int x = 23 ;
    int y  = 30 ;*/
    // another way to declare mutiple variables
    // int x = 4 , y = 5 ;
    /*int sum = x + y ; // addition
    System.out.println(sum); */

    // int myAge  = 20 ;
    // double myBigAge  = myAge ; // widening casting (int to double)
    // System.out.println(myBigAge); // prints 20.0


    // narrowing casting (double to int)

    // double gradePoint = 3.75 ;
    // int myGradePoint = (int) gradePoint; // explicit type casting

    // System.out.println(gradePoint); // prints 3.75
    // System.out.println(myGradePoint); // prints 3

    /* int x = 400 ;
    int y = 300 ;

    int add =  x + y ;
    int sub  = x - y ;
    int mul = x * y ;
    int div = x / y ;
    int mod = x % y ;
    System.out.println("Addition: " + add);
    System.out.println("Subtraction: " + sub);
    System.out.println("Multiplication: " + mul);
    System.out.println("Division: " + div);
    System.out.println("Modulus: " + mod);
    */

    // int q  = 40 ;
   //  q += 10; // equivalent to q = q + 10;

    // System.out.println("Updated value of q: " + q); // prints 50

    //System.out.println(3 == 6); Comparison operator ;

    //System.out.println((3 == 6) && (6 > 3)); // Logical AND operator

    // if statement , if else 
    /*int x  = 40 ;
    if ( x > 30){
      System.out.println("x is greater than 30");
    }else{
      System.out.println("x is not greater than 30");
    }*/

    /* int time  = 22 ;

    if ( time < 10){
      System.out.println("Good morning");
    } else if ( time < 18){
      System.out.println("Good day");
    }else{
      System.out.println("Good evening");
    }*/

    // tenary operator
    // int x = 10;
    // String result = (x > 5) ? "x is greater than 5" : "x is not greater than 5";
    // System.out.println(result); // prints "x is greater than 5"

    // an example to find out if a number is positive , negative or zero
    /* int x = 0 ;

    if ( x > 0){
      System.out.println("x is positive");
    }else if ( x < 0){
      System.out.println("x is negative");
    }else {
      System.out.println("x is zero");
    } */

    /*int x = 44 ;
    if ( x % 2 == 0) {
      System.out.println("x is even");
    } else {
      System.out.println("x is odd");
    }*/

    // while loop

    /*int i  = 0 ;
    while ( i < 5){
      System.out.println(i);
      i++;
    }*/

    /*int i  = 0 ;
    do{
      System.out.println(i);
      i++;
    }while (i < 5);*/

    int countdown = 3;

    while (countdown > 0) {
      System.out.println(countdown);
      countdown--;
    }

    System.out.println("Happy New Year!!");
  }


}

// Java basics recap 
// the main mehtod - public static void main(String[] args)
// the print method - System.out.println()
// the comment - /* comment */ or // comment
// the data types - int, double, char, boolean(true or false), String("Hello") , float  // String starts with capital S
// the variables - int a = 5; double b = 3.14; char c = 'A'; boolean d = true; String e = "Hello";
// the operators - +, -, *, /, %, ++, --, ==, !=, >, <, >=, <=

// for numerical values + serves as addition
// type casting - converting one data type to another

// widening casting - passing a smaller data type to a larger data type
