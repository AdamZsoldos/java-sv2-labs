package classstructureconstructors;

public class Store {

    private String product;
    private int stock;

    public Store(String product) {
        this.product = product;
    }

    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    public int getStock() {
        return stock;
    }

    public void store(int stock) {
        if (stock <= 0) return;
        this.stock += stock;
    }

    public void dispatch(int stock) {
        if (stock <= 0) return;
        if (this.stock >= stock) this.stock -= stock;
        else this.stock = 0;
    }
}
