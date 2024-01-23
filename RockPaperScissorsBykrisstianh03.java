package RockPaperScissors_PracticalProject;

import java.util.Random;
import java.util.Scanner;

public class RockPaperScissorsBykrisstianh03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Choose [r]ock, [p]aper or [s]cissors: ");

       String Rock = "rock";
       String Paper = "paper";
       String Scissors = "scissors";

       String playerMove = scanner.nextLine();
       if (playerMove.equals("r") || playerMove.equals("rock")) {
           playerMove = Rock;
       } else if (playerMove.equals("p") || playerMove.equals("paper")) {
           playerMove = Paper;
       } else if (playerMove.equals("s") || playerMove.equals("scissors")) {
           playerMove = Scissors;
       } else {
           System.out.println("Invalid Input. Try Again...");
           return;
       }
       Random random = new Random();

       int computerRandomNumber = random.nextInt(3);
       String computerMove ="";

       if (computerRandomNumber == 0) {
           computerMove = Rock;;
       } else if (computerRandomNumber == 1) {
           computerMove = Paper;
       } else if (computerRandomNumber == 2) {
           computerMove = Scissors;
       }
        System.out.printf("The computer chose %s.%n", computerMove);

       if ((playerMove.equals(Rock) && computerMove.equals(Scissors)) ||
               (playerMove.equals(Paper) && computerMove.equals(Rock)) ||
               (playerMove.equals(Scissors) && computerMove.equals(Paper))) {
           System.out.println("You win.");
       } else if ((playerMove.equals(Rock) && computerMove.equals(Paper)) ||
               (playerMove.equals(Paper) && computerMove.equals(Scissors)) ||
               (playerMove.equals(Scissors) && computerMove.equals(Rock))) {
           System.out.println("You lose.");
       } else if ((playerMove.equals(Rock) && computerMove.equals(Rock)) ||
               (playerMove.equals(Paper) && computerMove.equals(Paper)) ||
        (playerMove.equals(Scissors) && computerMove.equals(Scissors))) {
           System.out.println("This game was a Draw.");
       }
    }

}

