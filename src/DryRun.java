import java.util.*;
import java.io.*;

public class DryRun
{
    public static void main(String args[])
    {
        Scanner scan = new Scanner(DryRun.class.getResourceAsStream("DryRun.txt"));
        System.out.println(scan.next() + "! We are ready to begin!");
    }
}