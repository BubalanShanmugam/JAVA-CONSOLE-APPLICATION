import java.util.Scanner;

public class Bubalan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // while(true)

        int n;
        int digit = 0;

        do {
            System.out.println("------------");
            System.out.println("1.Addition");
            System.out.println("2.Subraction");
            System.out.println("3.Multiplication");
            System.out.println("4.Division");
            System.out.println("5.Exit");
            System.out.print("Enter your choice:");
            n = sc.nextInt();

            if (n > 0 && n <= 5) {
                System.out.print("Enter the no  of  values:");
                digit = sc.nextInt();


                switch (n) {
                    case 1:

                        if (digit == 2) {
                            double num1, num2;
                            num1 = sc.nextDouble();
                            num2 = sc.nextDouble();
                            double result = Calculator.add(num1, num2);
                            System.out.println(num1 + "+" + num2 + "=" + result);
                        } else {
                            double num1, num2, num3;
                            num1 = sc.nextDouble();
                            num2 = sc.nextDouble();
                            num3 = sc.nextDouble();
                            double result = Calculator.add(num1, num2, num3);
                            System.out.println(num1 + " +" + num2 + " + " + num3 + "= " + result);
                        }
                        break;

                    case 2:

                        if (digit == 2) {
                            double num1, num2;
                            num1 = sc.nextDouble();
                            num2 = sc.nextDouble();
                            double result = Calculator.sub(num1, num2);
                            System.out.println(num1 + "-" + num2 + "=" + result);
                        } else {
                            double num1, num2, num3;
                            num1 = sc.nextDouble();
                            num2 = sc.nextDouble();
                            num3 = sc.nextDouble();
                            double result = Calculator.sub(num1, num2, num3);
                            System.out.println(num1 + "-" + num2 + "-" + num3 + "=" + result);
                        }
                        break;


                    case 3:

                        if (digit == 2) {
                            double num1, num2;
                            num1 = sc.nextDouble();
                            num2 = sc.nextDouble();
                            double result = Calculator.mul(num1, num2);
                            System.out.println(num1 + "*" + num2 + "=" + result);
                        } else {
                            double num1, num2, num3;
                            num1 = sc.nextDouble();
                            num2 = sc.nextDouble();
                            num3 = sc.nextDouble();
                            double result = Calculator.mul(num1, num2, num3);
                            System.out.println(num1 + "*" + num2 + "*" + num3 + "=" + result);
                        }
                        break;

                    case 4:
                        if (digit == 2) {
                            double num1, num2;
                            num1 = sc.nextDouble();
                            num2 = sc.nextDouble();
                            double result = Calculator.div(num1, num2);
                            System.out.println(num1 + "/" + num2 + "=" + result);
                        } else {
                            double num1, num2, num3;
                            num1 = sc.nextDouble();
                            num2 = sc.nextDouble();
                            num3 = sc.nextDouble();
                            double result = Calculator.div(num1, num2, num3);
                            System.out.println(num1 + "/" + num2 + "/" + num3 + "=" + result);
                        }
                        break;
                    case 5:
                        System.out.println("Exiting");
                        break;
                }
            }

        } while (n!=0);

    }
}
