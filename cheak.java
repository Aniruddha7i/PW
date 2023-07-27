import java.util.Scanner;
public class cheak {
    public static void main(String[] args) {

        // /q1
        Scanner input= new Scanner(System.in);
        int x,y;
        System.out.println("Enter one integer value: ");
        x=input.nextInt();
        System.out.println("Enter second integer value: ");
        y=input.nextInt();
        System.out.println("The product is: "+x*y);

        // q2
        System.out.println("Enter a charecter: ");
        char ch = input.nextLine();
        System.out.println(int(ch));

        // q3
        System.out.println("Enter length and breadth of a rectangle: ");
        int a=input.nextInt();
        int b=input.nextInt();
        System.out.println("Area is: "+a*b);

        // q4
        System.out.println("Enter a integer: ");
        int n=input.nextInt();
        System.out.println("ans: ",n*n*n);

        // q5
        System.out.println("Enter a number x: ");
        int x=input.nextInt();
        System.out.println("Enter a number y: ");
        int y=input.nextInt();
        int t=x;
        x=y;
        y=t;
        System.out.println("x: "+x+"y: "+y);

    }
}
