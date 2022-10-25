import java.util.Scanner;
public class PerfectSquare {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int lower, upper, num,i;
        System.out.println("Enter the lower limit:");
        lower = sc.nextInt();
        System.out.println("Enter the upper limit:");
        upper = sc.nextInt();
        System.out.println("The perfect square numbers between the " + lower + " and  " + upper + " limit are:");
        for (i = lower; i <= upper; i++) {
            num = i * i;
            if (num <= upper) {
                System.out.println(num);
            }
        }
    }
}


