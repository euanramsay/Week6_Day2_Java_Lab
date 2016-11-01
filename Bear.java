import java.util.*;

public class Bear{
  
  private String name;
  private ArrayList<Edible> belly;

  public Bear(String name){
    this.name = name;
    this.belly = new ArrayList<Edible>();
  }
  // An array list does not have a maximum size, it dynamically changes as each item is added to the arraylist.

  public String getName(){
    return this.name;
  }

  public int foodCount(){
    return this.belly.size();
  }

  public void eat(Edible food, int nutrition){
    this.belly.add(food);
  }

 // public boolean bellyFull(){
 //   return foodCount() == belly.length;
 // }

 public void sleep(){
  this.belly.clear();
 }

 public Edible throwUp() {
  if (foodCount() > 0) {
    Edible food = belly.remove(0);
    return food;
  }
  return null;
 }

 public int totalNutrition() {
  int totalNutritionValue = 0;
  for (int i = 0; i < this.belly.size(); i++) {
    totalNutritionValue += this.belly.get(i).nutritionValue();
    }
  return totalNutritionValue;
 }


}
