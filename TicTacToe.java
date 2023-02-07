package WorkShop;

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
    public static void main(String[] args) {
        createBoard();
        showBoard();
    }
}
