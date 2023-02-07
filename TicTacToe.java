package WorkShop;

import java.util.Scanner;

public class TicTacToe {
    static  char[] board = new char[10];
    //UC1
    public static void createBoard(){
        for(int i = 1 ; i < 10; i++){
            board[i] = ' ';
        }
    }


    //UC2
    public static void chooseLetter(){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter your Choice X or O");
        char player , computer;
        player = sc.next().charAt(0);
        if(player == 'X'){
            computer = 'O';
        }
        else {
            computer = 'X';
        }
        System.out.println("You have selected : " +player);
        System.out.println("Computers choice is : " +computer);
    }
    public static void main(String[] args) {
        createBoard();

        chooseLetter();
    }
}
