package Food2Door;

public class OrderRequestRetriever {

    public OrderRequest retrieve() {

        Product product = new Product("Pomidor", 1);
        return new OrderRequest("HealthyFood" ,product , 120);

    }
}
