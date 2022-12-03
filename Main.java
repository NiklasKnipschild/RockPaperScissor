import java.util.Scanner;
import java.util.Random;

//This is a rock, paper, scissor game to give me a chance to practice with some concepts
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome to Niks Rock, Paper, Scissor Game!");
        String name = " ";
        System.out.print("Please enter your name: ");
        name = scan.next();
        System.out.println("\n" + name + " enjoy your game!");
        int round = 0; //keeps track of the number of rounds
        int playerwins = 0; //keeps track of the number of playerwins
        int cpuwins = 0;//keeps track of the number of cpu wins
        int gametie = 0;//keeps track of ties
        while (true) {

            //Generates a random number of 1 to 3 1 will be rock, 2 will be paper, 3 will be scissor
            Random rand = new Random();
            System.out.println("\nPlease make your selection");
            System.out.println("1) Rock");
            System.out.println("2) Paper");
            System.out.println("3) Scissor");
            System.out.println("4) Quit");
            System.out.print("Choice: ");
            int choice = scan.nextInt();
            round++;
            switch (choice) {
                case 1: //this is the selection for rock
                    int CPUMove = rand.nextInt(3 + 1);
                    if (CPUMove == 1) {
                        System.out.println(name + " you picked Rock. The computer picked Rock! The Game is a tie!");
                        gametie++;
                    } else if (CPUMove == 2) {
                        System.out.println(name + " you picked Rock. The computer picked Paper! You lose!");
                        cpuwins++;
                    } else if (CPUMove == 3) {
                        System.out.println(name + " you picked Rock. The computer picked Scissor! You win!");
                        playerwins++;
                    }
                    break;
                case 2: //this is selection for paper
                    int CPUMove2 = rand.nextInt(3 + 1);
                    if (CPUMove2 == 1) {
                        System.out.println(name + " you picked Paper. The computer picked Rock! You win!");
                        playerwins++;
                    } else if (CPUMove2 == 2) {
                        System.out.println(name + " you picked Paper. The computer picked Paper! You tie!!");
                        gametie++;
                    } else if (CPUMove2 == 3) {
                        System.out.println(name + " you picked Paper. The computer picked Scissor! You lose!");
                        cpuwins++;
                    }
                    break;
                case 3: //this is selection for scissor
                    int CPUMove3 = rand.nextInt(3 + 1);
                    if (CPUMove3 == 1) {
                        System.out.println(name + " you picked Scissor. The computer picked Rock! You win!");
                        playerwins++;
                    } else if (CPUMove3 == 2) {
                        System.out.println(name + " you picked Scissor. The computer picked Paper! You lose!");
                        cpuwins++;
                    } else if (CPUMove3 == 3) {
                        System.out.println(name + " you picked Scissor. The computer picked Scissor! You tie!");
                        gametie++;
                    }
                    break;
                case 4: //this exits the game and tells the user if they won or not
                    if (cpuwins > playerwins) {
                        System.out.println("\n" + name + " Thank you for playing! You have won " + playerwins + " times and the computer has won " + cpuwins + " times and you have tied " + gametie + " times, unfortunately the computer has won!");
                    } else if (playerwins > cpuwins) {
                        System.out.println("\n" + name + " Thank you for playing! You have won " + playerwins + " times and the computer has won " + cpuwins + " times and you have tied " + gametie + " times, congrats you have won!!");
                    } else {
                        System.out.println("\n" + name + " Thank you for playing! You have won " + playerwins + " times and the computer has won " + cpuwins + " times and you have tied " + gametie + " times, therefore it is a tie");

                    }
                    System.exit(0);
                    break;
                default:
                    System.out.println("Incorrect selection, please try again");
                    round--;
                    break;
            }
            System.out.println("\n" + name + " has played " + round + " rounds. The computer has won " + cpuwins + " times and you have won " + playerwins + " times and you have tied " + gametie + " times.");

        }
    }
}