import java.util.Scanner;

public class Logic{

   public static boolean logic() {
    Scanner input = new Scanner(System.in);
      Board.move = input.next().charAt(0); 
       if(Board.move == 'x' || Board.move == 'o'){
         System.out.println("Enter a row: ");
         Board.row = input.nextInt();
         if(Board.row == 1 || Board.row == 2 || Board.row == 3){
           System.out.println("Enter a column: ");
           Board.col = input.nextInt();
           if(Board.col == 1 || Board.col == 2 || Board.col == 3){
            Board.makemove (Board.row,Board.col,Board.move);
           }
          }
         
         return true;
        }
    else{
      System.out.println("Wrong!");
      
      return false;
      //Logic.logic();
    }
   }
}