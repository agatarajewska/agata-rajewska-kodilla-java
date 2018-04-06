package Food2Door;

public class OrderRequest {

    private String supplier;
    private Product product;
    private Integer quantity;

    public OrderRequest(String supplier, Product product, Integer quantity) {
        this.supplier = supplier;
        this.product = product;
        this.quantity = quantity;
    }

    public String getSupplier() {
        return supplier;
    }

    public void setSupplier(String supplier) {
        this.supplier = supplier;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }
}
