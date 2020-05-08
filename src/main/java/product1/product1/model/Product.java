package product1.product1.model;

import javax.xml.stream.Location;

public class Product {
    private String productname;
    private int productid;
    private Location location;

    public Product(String productname, int productid, Location location){
        this.productname =productname;
        this.productid =productid;
        this.location =location;
    }

    public String getProductname() {
        return productname;
    }

    public void setProductname(String productname) {
        this.productname = productname;
    }

    public int getProductid() {
        return productid;
    }

    public void setProductid(int productid) {
        this.productid = productid;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    @Override
    public String toString() {
        return "Product{" +
                "productname='" + productname + '\'' +
                ", productid=" + productid +
                ", location=" + location +
                '}';
    }
}
