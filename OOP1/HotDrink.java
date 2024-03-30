package OOP1;

import java.io.Console;

public class HotDrink extends Product 
{
    private int temperature;
    public HotDrink(String name, double cost, int temperature)
    {

        super(name, cost);
        this.temperature = temperature;

    }

    @Override
    public void test()
    {
        System.out.println("test");
    }

    @Override
    public String toString() {
        return "HotDrink [ " +
         " name =" + super.getName() +
         " cost = " + super.getCost() +            
            " temperature=" + temperature + 
            "]";
    }
    

}
