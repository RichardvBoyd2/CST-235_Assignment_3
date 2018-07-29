package business;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.Local;
import javax.ejb.Stateless;
import javax.enterprise.inject.Alternative;

import beans.Order;

@Stateless
@Local(OrdersBusinessInterface.class)
@Alternative
public class OrdersBusinessService2 implements OrdersBusinessInterface {

	List<Order> orders = new ArrayList<Order>();
	
	@Override
	public void test() {
		System.out.println("============ Hello from the test method. Order Business Service 2 Version");
		
	}
	
	OrdersBusinessService2(){
		
		orders.add(new Order("0000a", "Hot n Spicy McChicken", (float)1.19, 3));
		orders.add(new Order("0000b", "20 Piece Nuggets", (float)5.45, 2));
		orders.add(new Order("0000c", "Bacon McDouble", (float)1.99, 2));
		orders.add(new Order("0000d", "Medium Iced Mocha", (float)2.49, 1));
		orders.add(new Order("0000e", "Large Fry", (float)3.25, 3));
		orders.add(new Order("0000f", "Large Sprite", (float)1.00, 1));
		orders.add(new Order("0000g", "Large Coke", (float)1.00, 1));
		orders.add(new Order("0000h", "Large Diet Coke", (float)1.00, 1));
		orders.add(new Order("0000i", "Large Sweet Tea", (float)1.00, 1));
	}

	@Override
	public List<Order> getOrders() {
		return orders;
	}

	@Override
	public void setOrders(List<Order> orders) {
		this.orders = orders;
		
	}

	
	
}
