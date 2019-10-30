package Model;

 class ChocolateBox extends Box {
    private static final int MAX_CHOCOLATE = 20;

    @Override
    void fillBoxOfProducts(){
        numberOfProducts = MAX_CHOCOLATE;
    }
}
