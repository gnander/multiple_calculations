import java.util.Scanner;

public class calculator_1 {
    //function to add 2 numbers
    public static void addition(int x , int y){
        System.out.println("Sum = " + (x+y));
    }
    //function to subtract 2 number
    public static void subtraction(int x , int y){
        System.out.println("Sub = "+(x-y));
    }
    //function to multiply 2 numbers
    public static void multiplication(int x , int y){
        System.out.println("Mul = "+(x*y));
    }
    //function to division 2 numbers
    public static void division(int x , int y){
        System.out.println("Div = "+(x/y));
    }
    //function to modulus 2 numbers
    public static void modulus(int x , int y){
        System.out.println("Mod = "+(x%y));
    }

    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        int j;//this very wrong
        do{
            System.out.println("Enter 1st value");
            int a = sc.nextInt();
            System.out.println("Enter 2nd value");
            int b = sc.nextInt();
            System.out.println("press...  1.Addition / 2.Subtraction / 3.Multiplication / 4.Division / 5.Modulus ");
            int c = sc.nextInt();
            //advanced switch which uses arrow function and doesn't require break statement
            switch (c) {
                case 1 -> addition(a, b);
                case 2 -> subtraction(a, b);
                case 3 -> multiplication(a, b);
                case 4 -> division(a, b);
                case 5 -> modulus(a, b);
                default -> System.out.println("Invalid");//default the unspecified condition
            }
            System.out.println("press 0 to exit");
            j = sc.nextInt();
            //to stop memory leak, object is closed
        }while (j!=0);
        sc.close();
    }
}