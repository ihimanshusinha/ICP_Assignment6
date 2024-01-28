import java.util.Scanner;

public class Question1 {
    public static int additionSimple(int x, int y){
        int sum = x + y;
        return sum;
    }
    public static int subtractionSimple(int x, int y){
        int Sub = x - y;
        return Sub;
    }
    public static int multiplicationSimple(int x, int y){
        int Mul = x * y;
        return Mul;
    }
    public static double divisionSimple(int x, int y){
        double Div = x / y;
        return Div;
    }
    public static int remainderSimple(int n, int m){
        int rem = n % m;
        return rem;
    }
    public static double squareRootSimple(int n ){
        double Sq = (int)(Math.sqrt(n));
        return Sq;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter The Value : ");
       int a= sc.nextInt();
       System.out.print("Enter The Value : ");
       int b=sc.nextInt();
       System.out.print("Enter The Value : ");
       int c=sc.nextInt();
       System.out.print("Enter The Value : ");
       int d=sc.nextInt();
     System.out.println("Addition is "+ additionSimple(a, b));
     System.out.println("Subtraction is "+ subtractionSimple(a, b));
     System.out.println("Multiplication is "+ multiplicationSimple(a, b));
     System.out.println("Division is "+ divisionSimple(a, b));
     System.out.println("Remainder is "+remainderSimple(c, d));
  if(c >=0){
    System.out.println("Square root is "+squareRootSimple(c));
  }else{
    System.out.println("Cannot Find Negative Number Square root  ");
  }
  
    }
}
