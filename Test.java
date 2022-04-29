class Test
{
  public static void main(String args[])
  {      
    System.out.println("-------------VEGGIE PIZZA-------------");
     Pizza v = new VeggiePizza();
     v.preparePizza();
     System.out.println("");
     System.out.println("-------------PANEER PIZZA-------------");
     Pizza p = new PaneerPizza();
     p.preparePizza();
  }
}
