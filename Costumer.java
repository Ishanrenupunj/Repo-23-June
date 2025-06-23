public class Costumer {
    private int costid;
    private String name;
    private String address;
    private long phone;
    public int getCostid(){
        return costid;
    }
    public String getName(){
        return name;
    }
    public String getAddress()
{
    return address;
}   
public void setAddress(String address){
    this.address=address;
}
public long getPhone(){
    return phone;
}
public void setPhone(long phone){
    this.phone=phone;
}
public Costumer(int costid,String name){
    this.costid=costid;
    this.name=name;
}
public Costumer(int costid,String name,String address){
    this.costid=costid;
    this.name=name;
    this.address=address;
}
public Costumer(int costid,String name,String address,long phone){
    this.costid=costid;
    this.name=name;
    this.address=address;
    this.phone=phone;
}
}
