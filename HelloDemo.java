//import java.io.Console;
//import java.util.Arrays;
//import java.util.Arrays;
//import java.util.LinkedList;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Iterator;

//public class HelloDemo{
  //public static void main(String[] args) {
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

    /*int countdown = 3;

    while (countdown > 0) {
      System.out.println(countdown);
      countdown--;
    }

    System.out.println("Happy New Year!!");*/

    // for loops 
    /*for (int i = 0; i < 5; i++) {
      System.out.println(i);
    }*/

    // print even numbers between 0 and 10
    /*for(int i = 0 ; i <= 10; i= i + 2){
      System.out.println(i);
    }*/

    // nested for loops

    // for each loop

    /*int[] myArray =  {1,2,3,4,5};

    for (int i : myArray){
      System.out.println(i);
    }*/

    /*for(int i = 0; i <= 100 ; i += 10){
      System.out.println(i);
    }*/

    /*int number = 2 ;

    for(int i = 1 ; i<= 12 ; i++){
      System.out.println(number + " x " + i  + " = " + (number * i));
    }*/


    // switch statement

    /*int day = 2; ;
    switch(day) {
      case 1:
        System.out.println("Monday");
        break;
      case 2:
        System.out.println("Tuesday");
        break;
      case 3:
        System.out.println("Wednesday");
        break;
      default:
        System.out.println("Invalid day");
        break;
    }*/


    // java arrays
    //String[] cars = {"Toyota" , "Honda"};
    //System.out.println(cars[0]); // prints "Toyota"

    //cars[1] = "Ford" ; 

    // array of integers
    /*int[] numbers = { 1, 2, 3};
    System.out.println(numbers[1]); // prints 2
    numbers[2] = 4 ;
    System.out.println(numbers[2]);

    //finding the length of an array
    System.out.println(cars.length);*/

    // loops with arrays
    /*for ( String car : cars){
      System.out.println(car);
    }

    for( int i = 0; i < cars.length ; i++){
      System.out.println(cars[i]);
    }*/

    /*int[] ages = { 21, 19 , 25 , 30 , 45} ;

    float sum = 0 ;
    float avg = 0 ;

    for(int age : ages){
      sum += age;
    }

    avg = sum / ages.length ;
    System.out.println("Sum of ages: " + sum);
    System.out.println("Average age: " + avg); */

    // methods in java 
    
    /*myMethod();
    myMethod();
    myMethod();*/

    //myMethod("Walker");

    //System.out.println("Hello , world !");
  
  //}

  /*static void myMethod(){
    System.out.println("I just got executed");
  }*/


  /*static void myMethod(String name){
    System.out.println("Hello, " + name);
  }*/

  // method overloading
  // having same method name with different parameters

  /*int myMethod(int x)
  float myMethod(float x)
  double myMethod(double x, double y)*/

 // scope

 // OOP using java



//}

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
 //class HelloDemo{


 // public static void main(String[] args){
    /*int[] numbers = { 10, 20 , 30};

    System.out.println(numbers.length);
    System.out.println(Arrays.toString(numbers));*/

    /*Array numbers = new Array(2);
    numbers.insert(5);
    numbers.insert(10);
    numbers.insert(15);
    numbers.insert(20); // This will trigger resizing of the array
    numbers.removeAt(2);
    numbers.print();
  }
 }*/

 // java collections framework
 // interfaces and classes

 class HelloDemo{
  public static void main(String[] args){


    /*int [] arr = new int[10];

    int [] newArr = new int[arr.length * 2];
    for (int i = 0 ; i < arr.length; i++){
      newArr[i] = arr[i];
    }
    arr = newArr;
    System.out.println(newArr.length);*/

    //LinkedList<String> linkedList = new LinkedList<String>();
    /*linkedList.push("A");
    linkedList.push("B");
    linkedList.push("C");
    linkedList.push("D");
    linkedList.push("F");
    linkedList.pop(); // removes the last element*/

    // linkedlist as Queue
    /*linkedList.offer("A");
    linkedList.offer("B");
    linkedList.offer("C");
    linkedList.offer("D");
    linkedList.offer("F");*/
    //linkedList.poll(); // removes the last element

    /*linkedList.add(4, "E");
    linkedList.remove("E");

    System.out.println(linkedList);*/

   /*  int [] myArr = new int[5];
    myArr[0] = 1;
    myArr[1] = 10;
    myArr[2] = 6;
    myArr[3] = 8;
    myArr[4] = 15;
    myArr[8] = 20;
    

    int[] newArr = new int[myArr.length* 2];
    for (int i = 0; i < myArr.length; i++){
      newArr[i] = myArr[i];
    }
    newArr = myArr;
    System.out.println(Arrays.toString(newArr)); */

    // ArrayList

    /*List<String> myList = new ArrayList<>();
    myList.add("Hello");
    myList.add("Here");
    System.out.println(myList);

    String secondElement = myList.get(1);
    System.out.println(secondElement);

    myList.set(0, "Walker");
    myList.remove(1);

    //Linkedlist
    List<Integer> myList2 = new LinkedList<>();
    myList2.add(10);
    myList2.add(3);
    myList2.add(18);
    myList2.add(9);
    myList2.add(100);*/

    //Iterator interface

    // Iterator methods
    // hasNext() , next() , remove()

    ArrayList<Integer> numbers = new ArrayList<>();

    numbers.add(10);
    numbers.add(20);
    numbers.add(30);

    System.out.println("List: " +  numbers);

    //creating an instance of the Iterator

    Iterator<Integer> iterate = numbers.iterator();
    int number = iterate.next();


    System.out.println(number);
    System.out.println(iterate.hasNext());
    iterate.remove();
    System.out.println("Removed Element: " + number);
  }
 }