package p3_top_10;
import java.util.*;
class Item {
       private String itemName;
       private int quantity;
       private static int cnt = 0; //variable to count

       public void getItem() {
           Scanner sc = new Scanner(System.in);

           System.out.print("Enter item name: ");
           itemName = sc.next();
           System.out.print("Enter item quantity: ");
           quantity = sc.nextInt();

           //increment counter
           cnt++;
       }

       public void showItem() {
           System.out.println("Item Name: " + itemName + "\tQuantity: " + quantity);
       }

       public static int getCounter() {
           return cnt;
       }
   }



public class P10 {
	public static void main(String[] args) {
        String name="Sushil-01021402019";
        System.out.println(name);
         try {
             Item I1 = new Item();
             Item I2 = new Item();
             Item I3 = new Item();

             I1.getItem();
             I2.getItem();
             I3.getItem();

             I1.showItem();
             I2.showItem();
             I3.showItem();

             System.out.println("Total object created (total items are): " + Item.getCounter());
         } catch (Exception e) {
             System.out.println(e.toString());
         }

     }
}
