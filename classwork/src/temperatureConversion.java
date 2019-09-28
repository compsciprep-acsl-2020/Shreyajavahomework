import java.util.Scanner;
public class temperatureConversion {
        public static void main(String[]args) {
            double finaltemp = 0;
            Scanner s = new Scanner(System.in);
            System.out.println("Enter 1 for celsius, Enter 2 for Fahrenheit");
            int type = s.nextInt();
            double answer = fahrenheit(type, finaltemp);
            double answer2 = celsius(type, finaltemp);
            if (type ==1) {
                System.out.println("The temperature from Fahrenheit to Celsius is "+ answer + "C");
            }
            else {
                System.out.println("The temperature from Celsius to Fahrenheit is "+ answer2 + "F");
            }
        }
        public static double fahrenheit(int type, double finaltemp) {
            if (type == 1) {
                Scanner sn = new Scanner(System.in);
                System.out.println("Enter temperature in fahrenheit to turn into Celsius");
                double temp = sn.nextDouble();
                finaltemp = ((temp-32)* 5/9);
            }
            return finaltemp;

        }
        public static double celsius(int type, double finaltemp) {
            if (type ==2) {
                Scanner sn = new Scanner(System.in);
                System.out.println("Enter temperature in celsius to turn into fahrenheit");
                double temp = sn.nextDouble();
                finaltemp = (temp * 9/5) + 32;

            }
            return finaltemp;
        }

    }


