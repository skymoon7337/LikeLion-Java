package til.t20250617;

public class TryCatchCL1 {
    public static void main(String[] args) {

         int a=10;
         int b=0;

         try {
              int result = a/b;
              System.out.println("Result: + result");
         } catch(ArithmeticException e){
              System.out.println("Error: " + e.getMessage());
              }

    }
}
