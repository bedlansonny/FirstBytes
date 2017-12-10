import java.util.*;

public class A
{
    public static void main(String args[])
    {
        Scanner scan = new Scanner(A.class.getResourceAsStream("A.txt"));

        int num = scan.nextInt();
        for (int a = 0; a < num; a++) {

            int money = scan.nextInt();
            int lots = scan.nextInt();
            int[] prices = new int[lots];

            for (int b = 0; b < lots; b++) {
                prices[b] = scan.nextInt();

            }

            int max = 0;
            for (int index = 0; index < lots; index++) {
                int total = 0;
                int count = 0;

                while (total <= money && index < lots) {

                    total += prices[index];
                    if (total <= money)
                        count++;
                    index++;
                }

                if (count > max)
                    max = count;

            }

            System.out.println(max);


        }
    }
}