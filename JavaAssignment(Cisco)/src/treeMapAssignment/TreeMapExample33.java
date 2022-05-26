package treeMapAssignment;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeMap;

class SortByPriceAsc implements Comparator<Item>{
	public int compare(Item i1, Item i2) {
		if(i1.price<i2.price)
			return -1;
		else if(i1.price==i2.price)
			return i1.id-i2.id;
		else
			return 1;
	}
}
class Item /*implements Comparable<Item>*/{
	int id;
	String name;
	float price;
	Item(int id, String name, float price){
		this.id = id;
		this.name = name;
		this.price = price;
	}
	public int compareTo(Item item) {
		if(this.price<item.price)
			return -1;
		else if(this.price==item.price)
			return this.id-item.id;
		else
			return 1;
	}
	public String toString() {
		return "[ ID : "+id+", Name : "+name+", Price : "+price+" ]";
	}
}
public class TreeMapExample33 {

	public static void main(String[] args) {
		TreeMap<Item,String> items = new TreeMap<Item, String>(new SortByPriceAsc());
		items.put(new Item(1202, "Jeans", 1499f), "Jeans");
		items.put(new Item(1225, "Shirt", 799f), "Shirt");
		items.put(new Item(1212, "tshirt", 449f), "tshirt");
		items.put(new Item(1245, "Shoe", 999f), "Shoe");
		Set<Item> keyset = items.keySet();
		for(Item item : keyset) {
			System.out.println(item);
		}

	}

}