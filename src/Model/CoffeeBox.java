package Model;

 class CoffeeBox extends Box {


    private static final int MAX_COFFEE = 30;

    @Override
    void fillBoxOfProducts() {
        numberOfProducts = MAX_COFFEE;
    }
}
