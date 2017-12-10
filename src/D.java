import java.util.*;

public class D
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(DryRun.class.getResourceAsStream("D.txt"));

        while(true)
        {
            int sideCount = sc.nextInt();
            if(sideCount == 0)
                break;

            double perimeter = 2 * sideCount * Math.tan(Math.PI / sideCount);

            double error = Math.abs((Math.PI / perimeter) / (Math.PI));

            System.out.println(error);
        }
    }
}