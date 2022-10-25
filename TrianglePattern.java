
import java.util.Scanner;
public class TrianglePattern {

    public static void main (String args[])
    {
        int num;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the number of rows:");
        num = s.nextInt();
        for(int i=1;i<=num;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print(i+ " ");
            }

            System.out.println("\n");
        }
    }
}

