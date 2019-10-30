package Model;

import Model.exceptions.EmptyBoxException;

public class Store {
    CoffeeBox coffeeBox;
    MilkBox milkBox;
    ChocolateBox chocolateBox;

    private Store(){
        milkBox = new MilkBox();
        coffeeBox = new CoffeeBox();
        chocolateBox = new ChocolateBox();
        fillAll();
    }
    public void fillAll(){
        milkBox.fillBoxOfProducts();
        coffeeBox.fillBoxOfProducts();
        chocolateBox.fillBoxOfProducts();
    }
    public void getCoffee() throws EmptyBoxException {
        if (!coffeeBox.getNumberOfProducts()){
            throw new EmptyBoxException("Coffee");
        }
    }
}
