package mypack;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;

import my.Pet;

public class ShoppingCart {
  HashMap items = null;
  int numberOfItems = 0;
  
  public int numberOfItems(){
	  return numberOfItems;
  }

  public ShoppingCart() {
      items = new HashMap();
  }

  public synchronized void add(int petId, Pet pet) {
	  items.put(petId, pet);

    numberOfItems++;
  }

  public synchronized void remove(int petId) {
    //if(items.containsKey(petId)) {
     //   ShoppingCartItem scitem = (ShoppingCartItem) items.get(petId);
    //    scitem.decrementQuantity();

     //   if(scitem.getQuantity() <= 0)
            items.remove(petId);

        numberOfItems--;
    //}
  }

  public synchronized Collection getItems() {
      return items.values();
  }

  protected void finalize() throws Throwable {
      items.clear();
  }

  public synchronized int getNumberOfItems() {
      return numberOfItems;
  }
  public synchronized double getTotal() {
	  
    double amount = 0.0;

    for(Iterator i = getItems().iterator(); i.hasNext(); ) {
        //ShoppingCartItem item = (ShoppingCartItem) i.next();
        //Pet pet = (Pet) item.getItem();
        Pet pet=(Pet)i.next();

        amount +=  Integer.parseInt(pet.getPrice());
        //request.setAttribute( "value",numberOfItems); 
    }
    return roundOff(amount);
  }

  private double roundOff(double x) {
      long val = Math.round(x*100); // cents
      return val/100.0;
  }

  public synchronized void clear() {
      items.clear();
      numberOfItems = 0;
  }
}





/****************************************************
 * 作者：孙卫琴                                     *
 * 来源：<<Tomcat与Java Web开发技术详解>>           *
 * 技术支持网址：www.javathinker.org                *
 ***************************************************/
