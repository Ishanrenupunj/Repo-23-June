public class Product{
    private int itemno;
    private String name;
    private double price;
    private int quantity;
    public int getItemno(){
        return itemno;
    }
    public String getName(){
        return name;
    }
    public double getPrice(){
        return price;
    }
    public void setPrice(double price){
        this.price=price;
    }
    public int getQuantity(){
        return quantity;
    }
    public void setQuantity(int quantity){
        this.quantity=quantity;
    }
    public Product(int itemno,String name){
        this.itemno=itemno;
        this.name=name;
    }
    public Product(int itemno,String name,double price){
                this.itemno=itemno;
                this.name=name;
                this.price=price;
    }
    public Product(int itemno,String name,double price,int quantity){
                this.itemno=itemno;
                this.name=name;
                this.price=price;
                this.quantity=quantity;
    }
}