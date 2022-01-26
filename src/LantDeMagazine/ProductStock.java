package LantDeMagazine;
import java.io.Serializable;

public class ProductStock {
    private int noOfProducts=1;
    private Product product;
    private String name;


     public void setupProduct(Product products){

         this.product=product;
    }

     public void setNoOfProducts(int noOfProducts) {

         this.noOfProducts = noOfProducts;
     }


    public void setProduct(Product product) {

         this.product = product;
    }

    public int getNoOfProducts() {

         return noOfProducts;
    }

    public Product getProduct() {
        return product;
    }



    public String toString(){
         this.name= product.getProductName();
         return name + " cantitatea:"+ noOfProducts + " ,bar cod:"+ product.getBarCod()+ " pretul"+ product.getPrice();


    }



}
