import java.util.Scanner;
public class FarToCelsius
{
    public static void main(String arg[])
    {
        double f,c;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter  Fahrenheit temperature:");
        f=sc.nextDouble();
        c=(f-32)*5/9;
        System.out.println("Celsius temperature is = "+c);
    }

}