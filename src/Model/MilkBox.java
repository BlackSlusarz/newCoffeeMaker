package Model;

 class MilkBox extends Box{
    private static final int MAX_MILK = 25;

    @Override
    void fillBoxOfProducts(){
        numberOfProducts = MAX_MILK;
    }
}
