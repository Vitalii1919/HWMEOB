//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
import java.util.Arrays;
import java.util.Objects;

// Класс Product
        class Product {
            private int id; // Артикул
            private String name; // Название
            private int price; // Цена
            private String category; // Категория

            // Конструктор класса Product
            public Product(int id, String name, int price, String category) {
                this.id = id;
                this.name = name;
                this.price = price;
                this.category = category;
            }

            // Переопределение метода toString()
            @Override
            public String toString() {
                return "Товар[артикул=" + id + ", название=" + name + ", цена=" + price + ", категория=" + category + "]";
            }

            // Переопределение метода equals()
            @Override
            public boolean equals(Object obj) {
                if (this == obj) return true;
                if (obj == null || getClass() != obj.getClass()) return false;
                Product product = (Product) obj;
                return id == product.id && Objects.equals(category, product.category);
            }
        }

// Класс Order
        class Order {
            private String customer; // Заказчик
            private Product[] basket; // Массив продуктов

            // Конструктор класса Order
            public Order(String customer, Product[] basket) {
                this.customer = customer;
                this.basket = basket;
            }

            // Переопределение метода toString()
            @Override
            public String toString() {
                return "Заказ[клиент=" + customer + ", товары=" + Arrays.toString(basket) + "]";
            }

            // Переопределение метода equals()
            @Override
            public boolean equals(Object obj) {
                if (this == obj) return true;
                if (obj == null || getClass() != obj.getClass()) return false;
                Order order = (Order) obj;
                if (!Objects.equals(customer, order.customer)) return false;
                if (basket.length != order.basket.length) return false;
                for (int i = 0; i < basket.length; i++) {
                    if (!basket[i].equals(order.basket[i])) {
                        return false;
                    }
                }
                return true;
            }
        }

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
    }
}