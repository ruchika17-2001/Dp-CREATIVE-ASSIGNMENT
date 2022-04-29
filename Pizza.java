public abstract class Pizza
{
 final public void preparePizza()
 {
  createDough();
  applySauce();
  addToppings();
  addCheese();
  bakePizza();
  cutPizza();
  packInBox();
 }

public void createDough()
{
  System.out.println("Making a dough for pizza...");
}

 public void applySauce()
 {
  System.out.println("Applying sauce on a base...");
 }

 public void addCheese()
 {
  System.out.println("Adding cheese...");
 }
  
 abstract void addToppings();

 public void bakePizza()
 {
  System.out.println("Baking pizza in microwave oven...");
 }
 public void cutPizza()
 {
  System.out.println("Cutting pizza into pieces...");
 }
 public void packInBox()
 {
  System.out.println("Pizza packed in a box...\n");
 }
} 
