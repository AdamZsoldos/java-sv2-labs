package classstructureconstructors;

public class StoreMain {

    private static Store[] stores;

    public static void main(String[] args) {

        stores = new Store[2];

        stores[0] = new Store("Apple Idared");
        addStoreStock(0, 10);
        removeStoreStock(0, 4);
        addStoreStock(0, 3);

        stores[1] = new Store("Apple Granny Smith");
        addStoreStock(1, 20);
        removeStoreStock(1, 17);
        removeStoreStock(1, 50);
    }

    public static void addStoreStock(int storeIndex, int stock) {
        System.out.println("Adding " + stock + " stock to store " + storeIndex + ".");
        stores[storeIndex].store(stock);
        printStoreData(storeIndex);
    }

    public static void removeStoreStock(int storeIndex, int stock) {
        System.out.println("Removing " + stock + " stock from store " + storeIndex + ".");
        stores[storeIndex].dispatch(stock);
        printStoreData(storeIndex);
    }

    public static void printStoreData(int storeIndex) {
        System.out.println("Store " + storeIndex + " product: " + stores[storeIndex].getProduct() + "; stock: " + stores[storeIndex].getStock());
    }
}
