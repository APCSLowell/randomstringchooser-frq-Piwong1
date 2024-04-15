import java.util.*;
public class RandomStringChooser
{
  /* to be implemented in part (a) */
  private Arraylist<String> available;
  public RandomStringChooser(String[] list){
  available=new Arraylist<String>();
    for(int i=0;i<list.length;i++){
    available.add(list[i]);
    }

  }
  public String getNext(){
    if(available.size()<1)
      return "NONE";
  private int choice=(int)(Math.random()*available.size());
    private String temp=available.get(i);
    available.remove(i);
    return temp;
  }
  //Heads up! 
  //You will get a very confusing error message until you have working code in part b as well
}
