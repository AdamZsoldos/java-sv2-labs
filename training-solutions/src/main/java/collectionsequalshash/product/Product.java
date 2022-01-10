package collectionsequalshash.product;

import java.util.Objects;

public class Product {

    private String name;
    private String registryNumber;

    public Product(String name, String registryNumber) {
        this.name = name;
        this.registryNumber = registryNumber;
    }

    public String getName() {
        return name;
    }

    public String getRegistryNumber() {
        return registryNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return registryNumber.equals(product.registryNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(registryNumber);
    }
}
