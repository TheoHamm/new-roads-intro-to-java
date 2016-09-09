import java.util.Scanner;
public class TestApp{
 
 public static void main(String[] args){
   
   //do something
 
  int num1 = 5;
  double num2 = 3.5;
  String world = "This is a string literal";
  char x = 'x';
  
  Scanner input = new Scanner(System.in);
  System.out.println("Enter three numbers: ");
  double num3 = input.nextDouble();
  double num4 = input.nextDouble();
  double num5 = input.nextDouble();
   
  System.out.println("The numbers you chose are " + num3 + " " + num4 + " " + num5);
   
 
  double sum = num3 + num4 + num5;
  double average = sum / 3;
   
  System.out.println("This is the average of you numbers " + average);
  
  boolean flag = false;
   
  //logical operators
  //exapmples - <, >, ==
   
  if(average > 2){
  
    flag = true;
  }
  
  if(flag == true){
    System.out.println("Your average is greater then 2");
  }

 
 }

}