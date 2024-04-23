import java.util.*;
public class RandomStringChooser
{
  /* to be implemented in part (a) */
  private ArrayList<String> available;
  public RandomStringChooser(String[] list){
  available=new ArrayList<String>();
    for(int i=0;i<list.length;i++){
    available.add(list[i]);
    }

    
  }
  public String getNext(){
    if(available.size()<1)
      return "NONE";
   int choice=(int)(Math.random()*available.size());
    return  available.remove(choice);
  }
  //Heads up! 
  //You will get a very confusing error message until you have working code in part b as well
}
