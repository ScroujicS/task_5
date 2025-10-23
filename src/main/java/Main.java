public class Main {
    public static void main(String[] args) {
        Basket basket = new BasketImpl();
        basket.addProduct("Груша", 7);
        basket.addProduct("Банан", 5);
        basket.addProduct("Груша", 10);

        System.out.println("Продукты: " + basket.getProducts());
        System.out.println("Кол-во груш: " + basket.getProductQuantity("Груша"));
        System.out.println("Кол-во бананов: " + basket.getProductQuantity("Банан"));

        basket.updateProductQuantity("Банан", 10);
        System.out.println("Обновлено кол-во бананов: " + basket.getProductQuantity("Банан"));
    }
}