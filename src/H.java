import java.util.*;

public class H {
    public static void main(String args[]) {
        Scanner scan = new Scanner(H.class.getResourceAsStream("H.txt"));

        int num = scan.nextInt();

        for (int a = 0; a < num; a++) {

            int total = scan.nextInt();
            String[] flour = scan.nextLine().trim().split(" ");

            int[] amounts = new int[flour.length];
            for (int i = 0; i < amounts.length; i++)
                amounts[i] = Integer.parseInt(flour[i]);

            System.out.println("The minimum cost is " + getprice(amounts,0,amounts.length) + " glicks.");






        }

    }

    public static int getprice(int[] amounts, int low, int high) {
        int mid = (low + high) / 2;

        int total = 0;
        for (int i : amounts)
            total += i;

        if (high-low <= 2)
            return total;
        else
            return getprice(amounts, low, mid) + getprice(amounts, mid, high) + total;
    }

}
