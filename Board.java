import java.util.Scanner;

public class Board{
  //visible to other classes.
  
  static char[] row1 = {' ', ' ', ' '};
  static char[] row2 = {' ', ' ', ' '};
  static char[] row3 = {' ', ' ', ' '};
 //that is the creation of the board 
  public static char move;
  // this is a character
  public static int row;
  //clarifying the row 
  public static int col;
   //clarifying the col
    //logic of the program
   public static void main(String[] args){
     //the method is associated with the class, not a specific intancee object of that class
   
    System.out.println("enter x or o");
     //tells the player to either enter in x or o
     boolean keepGoing = Logic.logic();
     //this keeps the boolean going
     
     while(keepGoing){
      System.out.println("enter x or o");  
       keepGoing = Logic.logic();
       //this lets you enter x and o again while logic is looping
     }  
      
     
   }//end main
  
  public static boolean noWinner(){
    return true;
    //if there is no winner that repeat the looping 
  }
  
  public static void makemove(int row, int col, char move){
    if(row == 1){
       row1[col - 1] = move;
      //tells the player to make a move 
     
     }
     if(row == 2){
       row2[col - 1] = move;
       //same as the previous step but with row 2
     }
      if(row == 3){
       row3[col - 1] = move;
        //same as previous one but row 3
     }
     
     printBoard();
  }
  
  //prints the board
  public static void printBoard(){
    //you can call a static method without creating an object onf the class. Void means that the method has no return value.
    
     System.out.println(" " + row1[0] + " | " +row1[1] + "  |  " +row1[2] + " ");
     System.out.println("____________");
     System.out.println(" " + row2[0] + " | " +row2[1] + "  |  " +row2[2] + " ");
     System.out.println("____________");
     System.out.println(" " + row3[0] + " | " +row3[1] + "  |  " +row3[2] + " ");
  }//end of print board
  
  public static boolean checkSpot(){
    if(row == 1){
      if(row1[col] != ' '){
        return false;
        //everything that is not  a command is false
      }
      else{
        return true;
        //everything else that is not false is true
      }
    }
  }
  
 }//end of class
