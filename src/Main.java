
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Random rand = new Random();
        Scanner in = new Scanner(System.in);
        String finished="Y";
        boolean done= true;
        do {
            do {
                int die1 = 0;
                int die2 = 1;
                int sumDie = 2;
                int otherSum = 3;
                int die3 = 0;
                int die4 = 1;

                die1 = rand.nextInt(1, 6);
                die2 = rand.nextInt(1, 6);
                sumDie = die1 + die2;

                if (sumDie == 11 || sumDie == 7) {
                    System.out.println("You got a " + die1 + " and " +die2+ " which equals to "+ sumDie +". This is a natural, YOU WIN!");
                    break;
                } else if (sumDie == 12 || sumDie == 2 || sumDie == 3) {
                    System.out.println("You got a "+die1 +" and " +die2 + "which equals to " +sumDie+ ". This means YOU CRAPPED OUT (Lost)!!");
                    break;
                } else{
                    System.out.println("you got a "+ die1 + " and "+die2 +" which equals to "+ sumDie + " which is a point, game not over yet");}
                do {
                    die3 = rand.nextInt(1, 6);
                    die4 = rand.nextInt(1, 6);
                    otherSum = die3 + die4;
                    if (otherSum == sumDie) {
                        System.out.println("You got a " + die3 + " and " + die4 + " which equals to " + otherSum + ". The original sum was " + sumDie + ". Meaning you made the point! You win!");
                        done = true;
                    } else if (otherSum == 7) {
                        System.out.println("You got a " + die3 + " and " + die4 + " which equals to " + otherSum + ". Meaning you rolled another 7 and lose!");
                        done = true;
                    } else {
                        System.out.println("Not quite! You got a " + die3 + " and " + die4 + " which equals to " + otherSum + ". The original sum was " + sumDie + " Roll  again!");
                        done = false;
                    }
                }while (!done);

            }while (!done);
            do {
                System.out.println("Would you like to roll again?[Y/N]");
                finished = in.nextLine();
                if (finished.equalsIgnoreCase("Y")) {
                    done=true;
                } else if (finished.equalsIgnoreCase("N")) {
                    System.out.println("Goodbye");
                    done=true;
                } else {
                    System.out.println("Please enter Y or N");
                    done=false;}
            }while (!done);
        }while (finished.equalsIgnoreCase("y"));
    }
}
