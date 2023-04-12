# DiLite: A Lightweight Dependency Injection Framework

DiLite is a minimalistic Dependency Injection (DI) framework, similar to Spring IOC. It allows developers to inject dependencies between different components of their application using XML configuration files or annotations.

## Features

1. Dependency injection through XML configuration files (Jax Binding: OXM - Object XML Mapping)
2. Dependency injection using annotations
3. Injection possibilities via:
    a. Constructor
    b. Setter
    c. Attribute (direct access to the attribute: Field)

## Example Usage

```java
public class PresSpringXML {
    public static void main(String[] args) {
        try {
            ApplicationContext applicationContext = new ApplicationContext("Bean.xml");
            OrderService orderService = applicationContext.getInstance(OrderService.class);
            Order order = orderService.getOrderDetails(1);
            System.out.println(order);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
```
This example demonstrates how to use the DiLite framework with an XML configuration file to inject dependencies into an OrderService class.

#XML Configuration File
The XML file should define the beans that will be managed by the DI framework:
```xml
<?xml version="1.0" encoding="UTF-8"?>
<beans>
    <bean id="orderService" class="bean.OrderService"/>
    <bean id="orderRepository" class="bean.OrderRepository"/>
</beans>
```
# Annotations

The following annotations are provided for dependency injection:

- `@SimpleComponent`: Indicates a class is a component that should be managed by the DI framework
- `@ComponentScan`: Specifies the package to scan for components
- `@Configuration`: Indicates a class is a configuration class for the DI framework
- `@SimplyAutoWired`: Indicates a field should be autowired (injected) by the DI framework

For example:
```java
@Configuration
@ComponentScan(basePackages = "com.example")
public class AppConfig {
    @SimplyAutoWired
    private OrderService orderService;
}
```

In this example, the `AppConfig` class is marked as a configuration class and the `OrderService` field is marked as a dependency. When the `AppConfig` object is instantiated, the `OrderService` dependency will be injected automatically.

# Dependencies
- Java SE 8 or higher
- JAXB API (for XML configuration)
