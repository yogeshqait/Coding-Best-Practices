import java.util.Scanner;

public class ShapeArea {

    public static void main(String[] args) {

        System.out.println("Choose the Desired Shape");
        System.out.println("Press 1 for Square");
        System.out.println("Press 2 for Rectangle");
        System.out.println("Press 3 for Triangle");
        System.out.println("Press 4 for Circle");
        Scanner input = new Scanner(System.in);
        int choice = input.nextInt();

        switch (choice) {
            case 1:
                System.out.println("Enter Side of Square");
                float side = input.nextFloat();
                System.out.println("Area of Square is : "+side * side+" sq units");
                break;
            case 2:
                System.out.println("Enter Length of Rectangle");
                float length = input.nextFloat();
                System.out.println("Enter Breadth of Rectangle");
                float breadth = input.nextFloat();
                System.out.println("Area of Rectangle is : "+length * breadth+" sq units");
                break;
            case 3:
                System.out.println("Enter Base of Triangle");
                float base = input.nextFloat();
                System.out.println("Enter Altitude of Triangle");
                float altitude = input.nextFloat();
                System.out.println("Area of Triangle is : "+0.5 * base * altitude+" sq units");  
                break;
            case 4:
                System.out.println("Enter Radius of Circle");
                float radius = input.nextFloat();
                double area = 3.14 * radius * radius;
                System.out.println("Area of Circle is : "+area+" sq units");
                break;
        
            default:
                System.out.println("Wrong Option Entered Exiting.......");
                break;
        }
        
    }
}