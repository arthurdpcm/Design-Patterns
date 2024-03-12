public class Item {

    private String upcCode;
    private float price;

    public Item(String upc, float cost){
        this.upcCode=upc;
        this.price=cost;
    }

    public String getUpcCode() {
        return upcCode;
    }

    public float getPrice() {
        return price;
    }


}
