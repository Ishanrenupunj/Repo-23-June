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
    public Product(int itemno,String name){}
    public Product(int itemno,String name,double price){}
    public Product(int itemno,String name,double price,int quantity){}
}