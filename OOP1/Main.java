package OOP1;
//package ООП;

public class Main {
    public static void main(String[] args) 
    {
        HotDrinkVM machine = new HotDrinkVM(); 
        machine.addProductList(new HotDrink("Американо",180, 60) );
        machine.addProductList(new HotDrink("Чай",120, 80) );
        machine.addProductList(new HotDrink("Латте",160, 70) );
        machine.addProductList(new HotDrink("Глинтвейн",250, 80) );
        printProductByName(machine, "Чай");
    }

    public static void printProductByName(VendingMachineInt vm, String name)
    {

        System.out.println(vm.getProductByName(name));
        
    }
}
