/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex04_gra_santoscc;
//EX04_GRA_SantosCC
/**
 *
 * @author Chloe Elisha C. Santos
 */
import java.util.Scanner;
public class RockPaperScissors {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int reqWins = 2;
        int option;
        
        outerLoop:
        do {
            System.out.println("Welcome to Rock, Paper, Scissors. Please choose an option:");
            System.out.print("1. Start game\n2. Change number of rounds\n3. Exit application\n> ");
            option = sc.nextInt();
            
            switch(option){
                case 1:
                    int compTally = 0, userTally = 0;
                    System.out.printf("%nThis match will be first to %d wins.", reqWins);

                    while(!(compTally == reqWins || userTally == reqWins)) {
                        Move compMove = new Move((int)Math.floor(Math.random()*3)+1);
                        System.out.printf("%n%nThe computer has selected its move."
                                + " Select your move:%n1. Rock%n2. Paper%n3. Scissors%n> ");
                        Move userMove = new Move(sc.nextInt());

                        if(compMove.getMove().equals("Rock") && userMove.getMove().equals("Paper")){
                            userTally++;
                            System.out.printf("%nPlayer chose %s. Computer chose %s. Player wins round!%nPlayer: %d - Computer: %d",
                                    userMove.getMove(), compMove.getMove(), userTally, compTally);

                        }
                        else if(compMove.getMove().equals("Rock") && userMove.getMove().equals("Scissors")){
                            compTally++;
                            System.out.printf("%nPlayer chose %s. Computer chose %s. Computer wins round!%nPlayer: %d - Computer: %d",
                                    userMove.getMove(), compMove.getMove(), userTally, compTally);

                        }
                        else if(compMove.getMove().equals("Paper") && userMove.getMove().equals("Scissors")){
                            userTally++;
                            System.out.printf("%nPlayer chose %s. Computer chose %s. Player wins round!%nPlayer: %d - Computer: %d",
                                    userMove.getMove(), compMove.getMove(), userTally, compTally);

                        }
                        else if(compMove.getMove().equals("Paper") && userMove.getMove().equals("Rock")){
                            compTally++;
                            System.out.printf("%nPlayer chose %s. Computer chose %s. Computer wins round!%nPlayer: %d - Computer: %d",
                                    userMove.getMove(), compMove.getMove(), userTally, compTally);

                        }
                        else if(compMove.getMove().equals("Scissors") && userMove.getMove().equals("Rock")){
                            userTally++;
                            System.out.printf("%nPlayer chose %s. Computer chose %s. Player wins round!%nPlayer: %d - Computer: %d",
                                    userMove.getMove(), compMove.getMove(), userTally, compTally);

                        }
                        else if(compMove.getMove().equals("Scissors") && userMove.getMove().equals("Paper")){
                            compTally++;
                            System.out.printf("%nPlayer chose %s. Computer chose %s. Computer wins round!%nPlayer: %d - Computer: %d",
                                    userMove.getMove(), compMove.getMove(), userTally, compTally);

                        }
                        else {
                            System.out.printf("%nPlayer chose %s. Computer chose %s. The round is a tie!%nPlayer: %d - Computer: %d",
                                    userMove.getMove(), compMove.getMove(), userTally, compTally);
                        }
                    }
                    if(userTally == reqWins){
                        System.out.println("\n\nPlayer wins!\n");
                    }
                    else {
                        System.out.println("\n\nComputer wins!\n");
                    }
                    continue outerLoop;
                case 2:
                    System.out.printf("%nHow many wins are needed to win a match?%n> ");
                    reqWins = sc.nextInt();
                    System.out.printf("%n%nNew setting has been saved!%n%n");
                    option = 1;
                    break;
                case 3:
                    break outerLoop;
                default:
                    System.out.printf("%n%d is not a valid choice.", option);
                    break;
            }
        }
        while(option != 3);
        System.out.println("\n\nThank you for playing!");
    }
    
}
