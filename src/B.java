import java.util.*;

public class B
{
    public static void main(String args[])
    {
        Scanner scan = new Scanner(B.class.getResourceAsStream("B.txt"));

        int num = scan.nextInt();

        for (int a = 0; a < num; a++)
        {
            int targetCount = scan.nextInt();
            int time = scan.nextInt();

            int[] shoots = new int[100];

            for(int i = 0; i < targetCount; i++)
            {
                int targetPoints = scan.nextInt();
                int targetTime = scan.nextInt()-1;

                if(shoots[targetTime] < targetPoints)
                    shoots[targetTime] = targetPoints;
                else
                {
                    for(int z = targetTime-1; z >=0; z--)
                    {
                        if(shoots[z] <= targetPoints)
                        {
                            shoots[z] = targetPoints;
                            break;
                        }
                    }
                }
            }

            int points = 0;
            for(int i = 0; i < time; i++)
            {
                points += shoots[i];
            }

            System.out.println(points);
        }
    }
}