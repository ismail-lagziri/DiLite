package PresSpringAnnotation;

public class PresSpringAnnotation {
	public static void main(String[] args) {
		try {
			ApplicationContext applicationContext = new ApplicationContext(ApplicationConfig.class);
			OrderService orderService = applicationContext.getInstance(OrderService.class);
			Order order = orderService.getOrderDetails(1);
			System.out.println(order);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
