package LantDeMagazine;

import java.util.Objects;

public class Product {
    private int barCod;
    private String productName;
    private Double price;
    private String category;
    private int expDate;

    public Product (int bar,String pro, Double pri,String cat,int exp){
        this.barCod=bar;
        this.productName=pro;
        this.price=pri;
        this.category=cat;
        this.expDate=exp;
    }


    public int getBarCod() {
        return barCod;
    }

    public String getProductName() {
        return productName;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Double getPrice() {
        return price;
    }

    public String getCategory() {
        return category;
    }

    public int getExpDate() {
        return expDate;
    }
     boolean same(Product product) {
        if (this.barCod == product.barCod && this.productName.equals(product.productName) && this.price.equals(product.price) && this.category.equals(product.category) && this.expDate == product.expDate){
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "Product{" +
                "barCod=" + barCod +
                '}';
    }
}
