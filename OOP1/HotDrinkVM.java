 package OOP1;

import java.util.ArrayList;
import java.util.List;

public class HotDrinkVM implements VendingMachineInt
{
    
    List<Product> listProduct = new ArrayList<>();
    

    @Override
    public void addProductList(Product pr) {
       listProduct.add(pr);
        
    }

    @Override
    public Product getProductByCost(double cost) {
        for(Product pr : listProduct)
        {
            if(pr.getCost() == cost)
                return pr;
        }
        return null;
    }   

    @Override
    public Product getProductByName(String name) {
        for(Product pr : listProduct)
        {
            if(pr.getName().equals(name))
                return pr;
        }
        return null;
    }
    

     
}