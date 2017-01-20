public class TTTPlayer{
  private String name;
  private String xo;
  private boolean hasWon;
  
  
  public TTTplayer(){
    String name = "player 1";
    String xo = "x";
    Boolean Haswon = false; 
  }

  public String getName(){
    return name;
  }
  public void setName(String newName){
    name = newName;
  }
  public String toString(){
    return name + " " + xo + " " + hasWon;
  }
   public String getxo(){
    return xo;
  }
  public void setxo(String newxo){
    xo = newxo;
  }
  public String toString(){
    return name + " " + xo + " " + hasWon;
  
   public String gethasWon(){
    return hasWon;
  }
  public void sethasWon(String newhasWon){
    hasWon = newhasWon;
  }
  public String toString(){
    return name + " " + xo + " " + hasWon;
    
    
    
}
  
  
  
  
  
  
  
  
  