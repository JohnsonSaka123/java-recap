import java.util.Scanner;
import java.util.Stack;

public class PostfixEvaluator {
    public static void main(String[] args){
      Scanner input = new Scanner(System.in);
      String expression;

      System.out.println("Enter a postfix expression (e.g. 5 4 + 3 *):");
      expression = input.nextLine();

      int result = evaluate(expression);
      System.out.println("Result: " + result);
    }


    public static int evaluate(String expr){
      Stack<Integer> stack = new Stack<>();
      String[] tokens =  expr.split(" ");

      for( String token : tokens){
        if(isOperator(token)){
          int op1 = stack.pop();
          int op2 = stack.pop();

          int result = applyOperator(token, op1,op2);
          stack.push(result);
        }else{
          stack.push(Integer.parseInt(token));
        }
      }

      return stack.pop(); //final result
    }


    public static boolean isOperator(String token){

      return token.equals("+") || token.equals("-") || token.equals("*") || token.equals("/");

    }

    public static int applyOperator(String operator, int a , int b){
        switch(operator){
          case "+" :
            return a + b ;
          case "-" :
            return a - b ;
          case "*" :
            return a * b ;
          case "/" :
            return a / b ;
          default : throw new IllegalArgumentException("Unknown operator: " + operator);
        }
    }
  
}