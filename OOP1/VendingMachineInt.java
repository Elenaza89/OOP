package OOP1;

import java.util.ArrayList;
import java.util.List;

public interface VendingMachineInt 
{
    //List<Product> getProductList();    
    
    void addProductList(Product pr);
   
    Product getProductByName(String name);
   
    Product getProductByCost(double cost);   
}