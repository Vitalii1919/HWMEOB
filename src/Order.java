import java.util.Arrays;
import java.util.Objects;

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
        if (basket == null && order.basket != null || basket != null && order.basket == null) return false;
        if (basket == null && order.basket == null) return true; // Если оба массива null, считаем равными
        if (basket.length != order.basket.length) return false;
        for (int i = 0; i < basket.length; i++) {
            if (basket[i] == null && order.basket[i] != null || basket[i] != null && order.basket[i] == null) {
                return false;
            }
            if (basket[i] != null && !basket[i].equals(order.basket[i])) {
                return false;
            }
        }
        return true;
    }
}