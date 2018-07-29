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
public class OrdersBusinessService implements OrdersBusinessInterface {

	List<Order> orders = new ArrayList<Order>();
	
	@Override
	public void test() {
		System.out.println("============ Hello from the test method. Order Business Service Version");
		
	}
	
	public OrdersBusinessService() {
		
		orders.add(new Order("00001", "Hot n Spicy McChicken", (float)1.00, 2));
		orders.add(new Order("00002", "20 Piece Nuggets", (float)6.49, 1));
		orders.add(new Order("00003", "Bacon McDouble", (float)2.00, 1));
		orders.add(new Order("00004", "Medium Iced Mocha", (float)2.49, 2));
		orders.add(new Order("00005", "Large Fry", (float)2.99, 3));
		orders.add(new Order("00006", "Large Sprite", (float)1.00, 1));
		orders.add(new Order("00007", "Large Coke", (float)1.00, 1));
		orders.add(new Order("00008", "Large Diet Coke", (float)1.00, 1));
		orders.add(new Order("00009", "Large Sweet Tea", (float)1.00, 1));
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
