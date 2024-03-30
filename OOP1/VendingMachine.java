package OOP1;

import java.util.ArrayList;
import java.util.List;

public class VendingMachine 
{
    List<Product> listProduct = new ArrayList<>();
    public VendingMachine(List<Product> lp)
    {
        this.listProduct =lp;
    }
    public List<Product> getProductList()
    {
        return listProduct;
    }
    
    public void addProductList(Product pr)
    {
        listProduct.add(pr);
    }
    Product getProductByName(String name)
    {
        for(Product pr : listProduct)
        {
            if(pr.getName().equals(name))
                return pr;
        }
        return null;

    }
    Product getProductByCost(double cost)
    {
        for(Product pr : listProduct)
        {
            if(pr.getCost() == cost)
                return pr;
        }
        return null;

    }
}
