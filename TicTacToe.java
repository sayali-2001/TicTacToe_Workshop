package WorkShop;

import java.util.Scanner;

public class TicTacToe {
    static  char[] board = new char[10];
    public static void createBoard(){
        for(int i = 1 ; i < 10; i++){
            board[i] = ' ';
        }
    }
    public static void showBoard(){
        System.out.println();
        System.out.println(" "+board[1]+" | "+board[2]+ " | "+board[3]+ " ");
        System.out.println("-----------------");
        System.out.println(" "+board[4]+" | "+board[5]+ " | "+board[6]+ " ");
        System.out.println("-----------------");
        System.out.println(" "+board[7]+" | "+board[8]+ " | "+board[9]+ " ");
    }
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
        showBoard();
        chooseLetter();
    }
}
