import java.util.Scanner;

public class Board{
  
  static char[] row1 = {' ', ' ', ' '};
  static char[] row2 = {' ', ' ', ' '};
  static char[] row3 = {' ', ' ', ' '};
  public static char move;
  public static int row;
  public static int col;
   
    //logic of the program
   public static void main(String[] args){
   
    System.out.println("enter x or o");
     
     Logic.logic();
    
     
     
   }//end main
  
  public static boolean noWinner(){
    return true;
  }
  
  public static void makemove(int row, int col, char move){
    if(row == 1){
       row1[col - 1] = move;
     
     }
     if(row == 2){
       row2[col - 1] = move;
     }
      if(row == 3){
       row3[col - 1] = move;
     }
     
     printBoard();
  }
  
  //prints the board
  public static void printBoard(){
    
     System.out.println(" " + row1[0] + " | " +row1[1] + "  |  " +row1[2] + " ");
     System.out.println("____________");
     System.out.println(" " + row2[0] + " | " +row2[1] + "  |  " +row2[2] + " ");
     System.out.println("____________");
     System.out.println(" " + row3[0] + " | " +row3[1] + "  |  " +row3[2] + " ");
  }//end of print board
  
  
 }//end of class
