package set;
import java.util.LinkedHashSet;

//To sort a set Use TreeSet object
//to sort map use TreeMap
//to sort list use Collections.sort and implement comparable/comparator
public class Custom_HashSet {
	public static void main(String[] args) {
		LinkedHashSet<Trainer> hs= new LinkedHashSet<>();
		hs.add(new Trainer(2,"Pol"));
		hs.add(new Trainer(7,"Nod"));
		hs.add(new Trainer(2,"Nod"));
		hs.add(new Trainer(7,"Pol"));		
		hs.add(new Trainer(2,"pol")); 			//this shoudn't add in a HashSet--wrote case sensitive logic
		
		
		System.out.println(hs);				
		//See Trainer class...hashcode and equals**
		
		Trainer trainer= new Trainer(2, "Nod");
		System.out.println(hs.contains(trainer));	
		//to avoid duplicate values, instead of overloading equals and hashcode
		//simply check hs.contains and Enter values..implemeted in Custom_HashSet 2
	}

}

/*

import java.util.LinkedHashSet;
 
public class MyLhsUdObjSearch {
 
    public static void main(String a[]){
         
        LinkedHashSet<Price> lhs = new LinkedHashSet<Price>();
        lhs.add(new Price("Banana", 20));
        lhs.add(new Price("Apple", 40));
        lhs.add(new Price("Orange", 30));
        for(Price pr:lhs){
            System.out.println(pr);
        }
        Price key = new Price("Banana", 20);
        System.out.println("Does set contains key? "+lhs.contains(key));
    }
}
 
class Price{
     
    private String item;
    private int price;
     
    public Price(String itm, int pr){
        this.item = itm;
        this.price = pr;
    }
     
    public int hashCode(){
        System.out.println("In hashcode");
        int hashcode = 0;
        hashcode = price*20;
        hashcode += item.hashCode();
        return hashcode;
    }
     
    public boolean equals(Object obj){
        System.out.println("In equals");
        if (obj instanceof Price) {
            Price pp = (Price) obj;
            return (pp.item.equals(this.item) && pp.price == this.price);
        } else {
            return false;
        }
    }
     
    public String getItem() {
        return item;
    }
    public void setItem(String item) {
        this.item = item;
    }
    public int getPrice() {
        return price;
    }
    public void setPrice(int price) {
        this.price = price;
    }
     
    public String toString(){
        return "item: "+item+"  price: "+price;
    }
}
*/