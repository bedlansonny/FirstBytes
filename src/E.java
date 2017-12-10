//marked correct

import java.util.*;

public class E
{
    public static void main(String args[])
    {
        Scanner scan = new Scanner(E.class.getResourceAsStream("E.txt"));

        LinkedList<Integer> cars = new LinkedList<Integer>();



        while (scan.hasNext()) {
            String command = scan.next();
            if (command.equals("START")) {

                cars = new LinkedList<Integer>();

                String[] start = scan.nextLine().split(" ");

                for (int i = 2; i < Integer.parseInt(start[1]) + 2; i++)
                    cars.add(Integer.parseInt(start[i]));
            }
            else if (command.equals("DROPOUT") || command.equals("PITSTOP")) {
                cars.remove(cars.indexOf(scan.nextInt()));
            }
            else if (command.equals("OVERTAKE")) {
                int car = scan.nextInt();
                int index = cars.indexOf(car);
                cars.remove(cars.indexOf(car));
                cars.add(index-1,car);
            }
            else if (command.equals("PITRETURN")) {
                int x = scan.nextInt();
                cars.add(scan.nextInt(),x);
            }
            else if (command.equals("CRASH")) {
                String[] dead = scan.nextLine().trim().split(" ");
                for (String car : dead) {
                    cars.remove(cars.indexOf(Integer.parseInt(car)));
                }
            }
            else if (command.equals("END")) {
                for (int car : cars) {
                    System.out.print(car + " ");
                }
                System.out.println();
            }
        }
    }
}