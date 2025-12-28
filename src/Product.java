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
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Product product = (Product) obj;
        return id == product.id && Objects.equals(category, product.category);
    }
}
