package PresSpringXML;

public class PresSpringXML {
	public static void main(String[] args) {
	    try {
	        ApplicationContext applicationContext = new ApplicationContext("src/main/resources/bean.xml");
	        OrderService orderService = applicationContext.getInstance(OrderService.class);
	        Order order = orderService.getOrderDetails(1);
	        System.out.println(order);
	    } catch (Exception e) {
	        e.printStackTrace();
	    }
	}
}