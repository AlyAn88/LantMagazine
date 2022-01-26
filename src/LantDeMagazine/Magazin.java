package LantDeMagazine;
import java.io.Serializable;
import java.util.ArrayList;

public class Magazin  {
    ArrayList<ProductStock> products = new ArrayList<>();
    private Person admin;
    private  String name;
    void addProduct(Product productStatus) {
        if (productStatus.getProductName() != null) {
            ProductStock newProduct = new ProductStock();
            newProduct.setProduct(productStatus);
            newProduct.setNoOfProducts(1);
            int nr;
            for (nr = 0; nr < products.size(); nr++) {
                Product thatProduct = products.get(nr).getProduct();
                if (thatProduct.same(newProduct.getProduct())) {
                    break;
                }
            }
            if (nr < products.size()) {
                products.get(nr).setNoOfProducts(products.get(nr).getNoOfProducts() + 1);
            } else {
                products.add(newProduct);

            }
        }
    }
    public  String toString (){
        return name;
    }

    public String getName() {
        return name;
    }

    public void setName (String nume){
        this.name=nume;
    }
    public void setAdmin(Person admin) {
        this.admin = admin;
    }
    public Person getAdmin() {
        return admin;
    }
    public void seeProduct (){
        int loc;
        for (loc=0;loc< products.size();loc++) {
            System.out.println(products.get(loc));
        }
    }
    public Product findProduct(int ofProduct){
        int loc;
        for(loc=0;loc<products.size();loc++){
            if(ofProduct==products.get(loc).getProduct().getBarCod()){
                return products.get(loc).getProduct();
            }
        }
        return null;
    }

    public void removeProdus(Product produs) {

    }

}


