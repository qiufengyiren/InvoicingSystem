package entity;

/**
 * 商品表product
 */
public class product {
    private int id;//商品id
    private String productName;//商品名称
    private int quantity;//库存量

    public int getId() { return id; }

    public void setId(int id) { this.id = id; }

    public String getProductName() { return productName; }

    public void setProductName(String productName) { this.productName = productName; }

    public int getQuantity() { return quantity; }

    public void setQuantity(int quantity) { this.quantity = quantity; }
}
