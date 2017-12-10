//marked correct

import java.util.*;

public class C
{
    public static void main(String args[])
    {
        Scanner scan = new Scanner(C.class.getResourceAsStream("C.txt"));

        int num = scan.nextInt();

        for (int a = 0; a < num; a++) {

            int r = scan.nextInt();
            int c = scan.nextInt();
            scan.nextLine();
            char[][] wall = new char[r][];

            for (int b = 0; b < r; b++) {
                wall[b] = scan.nextLine().toCharArray();
            }

/*            for (char[] line : wall) {
                for (char thing : line)
                    System.out.print(thing);
                System.out.println();
            }*/

            while (true) {
                boolean bad = true;
                for (int row = 0; row < r-1; row++) {
                    for (int col = 0; col < c-1; col++) {
                        char ul = wall[row][col];
                        char ur = wall[row][col+1];
                        char bl = wall[row+1][col];
                        char br = wall[row+1][col+1];

                        //if allwhite, return yes

                        if (goodsquare(ul,ur,bl,br)) {
                            //System.out.println(""+ul+ur+"\n"+bl+br+"\n");

                            wall[row][col] = 'W';
                            wall[row][col+1] = 'W';
                            wall[row+1][col] = 'W';
                            wall[row+1][col+1] = 'W';
                            bad = false;

                        }
                    }
                }

                 // if you did nothing, return false, if all white, return true, if you did none of those things, go again
                if (bad) {
                    System.out.println("no");
                    break;
                }
                if (allwhite(wall)) {
                    System.out.println("yes");
                    break;
                }



            }


        }


    }

    public static boolean goodsquare(char a, char b, char c, char d) {
        String chars = ""+a+b+c+d;
        char[] things = chars.toCharArray();

        if (!chars.contains(""+ 'R') && !chars.contains(""+ 'G') && !chars.contains(""+ 'B'))
        {
            return false;
        }

        char ref = 0;
        for (char ca : things) {
            if(ref == 0 && ca != 'W')
            {
                ref = ca;
            }
            else if(ca != ref && ca != 'W')
                return false;
        }
        return true;
    }

    public static boolean allwhite(char[][] wall) {
        for (char[] line : wall)
            for (char thing : line)
                if (thing != 'W')
                    return false;

        return true;
    }
}