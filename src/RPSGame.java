import java.util.Scanner;

public class RPSGame {
    public static void main(String[] args) {
        boolean restart = false;
        String stringAnswer;
        String endStringAnswer = "";
        String playerAMove = "";
        String playerBMove = "";

        Scanner in = new Scanner(System.in);
        System.out.println("Do you want to play Rock Paper Scissors? [Y/N]");
        stringAnswer = in.nextLine();

        if(stringAnswer.equalsIgnoreCase("Y")) {
            restart = true;
            } else if (stringAnswer.equalsIgnoreCase("N")) {
                restart = false;
            } else{
            System.out.println("Invalid Response");
        }

        while (restart){
            System.out.println("Player A, enter your move [R,P, or S]: ");
            playerAMove = in.next();
            System.out.println("Player B, enter your move [R,P, or S]: ");
            playerBMove = in.next();

            if(playerAMove.equalsIgnoreCase("R")){
                if(playerBMove.equalsIgnoreCase("R")) {
                    System.out.println("It's a tie");
                } else if (playerBMove.equalsIgnoreCase("P")){
                    System.out.println("Paper covers rock : Player B wins!");
                } else if (playerBMove.equalsIgnoreCase("s")){
                    System.out.println("Rock breaks scissors : Player B wins!");
                }

            }

            if(playerAMove.equalsIgnoreCase("P")){
                if(playerBMove.equalsIgnoreCase("P")) {
                    System.out.println("It's a tie");
                } else if (playerBMove.equalsIgnoreCase("R")){
                    System.out.println("Paper covers rock : Player A wins!");
                } else if (playerBMove.equalsIgnoreCase("s")){
                    System.out.println("Scissors cuts paper : Player B wins!");
                }
            }

            if(playerAMove.equalsIgnoreCase("S")){
                if(playerBMove.equalsIgnoreCase("S")) {
                    System.out.println("It's a tie");
                } else if (playerBMove.equalsIgnoreCase("P")){
                    System.out.println("Scissors cuts paper : Player A wins!");
                } else if (playerBMove.equalsIgnoreCase("R")){
                    System.out.println("Rock breaks scissors : Player B wins!");
                } else {
                    System.out.println("Invalid Response");
                }
            }

            System.out.println("Play again? [Y/N]");
            endStringAnswer = in.next();


            if(endStringAnswer.equalsIgnoreCase("Y")) {
                restart = true;
            } else if (endStringAnswer.equalsIgnoreCase("N")) {
                restart = false;
            }
        }
    }

}
