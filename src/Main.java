import java.util.Arrays;
import java.util.Objects;

// Класс для тестирования
public class Main {
    public static void main(String[] args) {
        // Создание товаров
        Product product1 = new Product(1, "Laptop", 80000, "Electronics");
        Product product2 = new Product(2, "Smartphone", 30000, "Electronics");
        Product product3 = new Product(1, "Laptop", 80000, "Electronics");
        Product product4 = new Product(3, "Book", 500, "Literature");

        // Вывод товаров
        System.out.println(product1);
        System.out.println(product2);
        System.out.println(product3);
        System.out.println(product4);

        // Сравнение товаров
        System.out.println("Сравнение product1 и product2: " + product1.equals(product2));
        System.out.println("Сравнение product1 и product3: " + product1.equals(product3));
        System.out.println("Сравнение product1 и product4: " + product1.equals(product4));

        // Создание заказов
        Product[] basket1 = {product1, product2};
        Product[] basket2 = {product1, product2};
        Product[] basket3 = {product1, product4};

        Order order1 = new Order("John Doe", basket1);
        Order order2 = new Order("Jane Doe", basket2);
        Order order3 = new Order("John Smith", basket3);

        // Вывод заказов
        System.out.println(order1);
        System.out.println(order2);
        System.out.println(order3);

        // Сравнение заказов
        System.out.println("Сравнение order1 и order2: " + order1.equals(order2));
        System.out.println("Сравнение order1 и order3: " + order1.equals(order3));
    }
}
