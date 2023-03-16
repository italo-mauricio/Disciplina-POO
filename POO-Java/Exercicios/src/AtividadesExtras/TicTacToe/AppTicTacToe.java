package AtividadesExtras.TicTacToe;
import AtividadesExtras.TicTacToe.Player.PlayerStatus;
import java.util.Scanner;

/***
 * @Italo
 *
 * Programinha básico de jogo da velha em POO, utilizando métodos getters e setters
 */

public class AppTicTacToe {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        TicTacToe ticTacToe = new TicTacToe();

        new Screen();

        boolean win = false;
        char signal;
        int row = 0, column = 0;


        // decidi usar esses dois métodos para controlar melhor os dois personagens
        String player1 = ticTacToe.registerPlayer1();
        String player2 = ticTacToe.registerPlayer2();


        while(!win){
            if(ticTacToe.playerOneMove()){
                System.out.println("Player's turn: " + player1 +"\nChoose row and column (1-3): ");
                signal = 'X';
            }else{
                System.out.println("Player's turn: " +  player2 + "\nChoose row and column (1-3)): ");
                signal = 'Y';
            }

            row = getValue("Row", scan);
            column = getValue("Colum", scan);
            ticTacToe.validMove(row, column, signal);
            ticTacToe.displayBoard();

            if(ticTacToe.chekWinner('X')){
                win = true;
                System.out.println("Congratulations Player: " + player1 + " you are the WINNER!!!");
            }else if (ticTacToe.chekWinner('Y')){
                System.out.println("Congratulations Player: " + player2 + " you are the WINNER!!!");
            }else if (ticTacToe.getMove() > 9){
                win = true;
                System.out.println("Draw!");
            }
        }
    }

    static int getValue(String valueLabel, Scanner scan) {
        int value = 0;
        boolean validValue = false;
        while(!validValue) {
            System.out.println("Enter " + valueLabel + " (1, 2, or 3):");
            value = scan.nextInt();
            if(value >= 1 && value <= 3) {
                validValue = true;
            } else {
                System.out.println("Invalid input, please try again.");
            }
        }
        value--;
        return value;
    }

    private static void appPlayer() {
    }
}