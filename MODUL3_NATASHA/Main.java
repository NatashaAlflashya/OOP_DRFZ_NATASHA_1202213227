import java.util.Scanner;
import java.util.InputMismatchException;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        boolean repeat = true;
        Calculation calculation = new Calculation();

        while(true) {
            try {
              System.out.println("===Menu Program===:");
              System.out.println("1. Square");
              System.out.println("2. Circle");
              System.out.println("3. Trapezoid");
              System.out.println("0. exit");
              System.out.print("pilihan: ");

              int choice = input.nextInt();
              switch (choice) {
                case 1:
                  System.out.print("Side of the Square: ");
                  double radius = input.nextDouble();
                  break;

                case 2:
                  System.out.print("Radius of circle: ");
                  double side = input.nextDouble();
                  calculation.setCircle(side);
                  break;

                case 3:
                  System.out.print("Side of the base of the trapezoid: ");
                  double a = input.nextDouble();
                  System.out.print("Upper side of the trapezoid: ");
                  double b = input.nextDouble();
                  System.out.print("Tinggi: ");
                  double t = input.nextDouble();
                  calculation.setTrapezoid(a, b, t);
                  continue;
                }
            }catch(Exception a){
                System.out.println("Inputan Harus dalam Integer");
                }
            }   
        }
    }