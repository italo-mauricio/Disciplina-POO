package AtividadesExtras.TicTacToe;

import AtividadesExtras.TicTacToe.Player.PlayerStatus;
import AtividadesExtras.TicTacToe.Player.RegisterPlayer;

public class TicTacToe {
    private char[][] ticTacToe;
    private int move;

    public TicTacToe(){
        ticTacToe = new char[3][3];
        move = 1;
    }


    public char[][] getTicTacToe() {
        return ticTacToe;
    }

    public void setTicTacToe(char[][] ticTacToe) {
        this.ticTacToe = ticTacToe;
    }

    public int getMove() {
        return move;
    }

    public void setMove(int move) {
        this.move = move;
    }


    public boolean validMove(int line, int colum, char signal){ // verificar se um movimento é válido
        if(ticTacToe[line][colum] == 'X' || ticTacToe[line][colum] == 'Y'){
            return false;
        }else {
            ticTacToe[line][colum] = signal;
            move++;
            return true;
        }
    }

    public void displayBoard(){
        for (int i = 0; i < ticTacToe.length; i++){
            for (int j = 0; j < ticTacToe[i].length; j++){
                System.out.print(ticTacToe[i][j] + " | ");
            }
            System.out.println();
        }
    }

    public boolean chekWinner(char signal) {
        //verificar quem ganhou
        if ((ticTacToe[0][0] == signal && ticTacToe[0][1] == signal && ticTacToe[0][2] == signal) ||    // linha 1
                (ticTacToe[1][0] == signal && ticTacToe[1][1] == signal && ticTacToe[1][2] == signal) ||  // linha 2
                (ticTacToe[2][0] == signal && ticTacToe[2][1] == signal && ticTacToe[2][2] == signal) ||  // linha 3
                (ticTacToe[0][0] == signal && ticTacToe[1][0] == signal && ticTacToe[2][0] == signal) ||  // coluna 1
                (ticTacToe[0][1] == signal && ticTacToe[1][1] == signal && ticTacToe[2][1] == signal) ||  // coluna 2
                (ticTacToe[0][2] == signal && ticTacToe[1][2] == signal && ticTacToe[2][2] == signal) ||  // coluna 3
                (ticTacToe[0][0] == signal && ticTacToe[1][1] == signal && ticTacToe[2][2] == signal) ||  // diagonal
                (ticTacToe[0][2] == signal && ticTacToe[1][1] == signal && ticTacToe[2][0] == signal)) {   //diagonal inversa
            return true;
        }
        return false;
    }

    public boolean playerOneMove(){
        if (move % 2 == 1){
            return true;
        }
        return false;
    }

    String registerPlayer1(){  // os métodos para retornar o nickname para definir o vencedor
        PlayerStatus.main();
        return RegisterPlayer.nickName;
    }
    String registerPlayer2(){
        PlayerStatus.main();
        return RegisterPlayer.nickName;
    }


}
