package Model;

 abstract class Box {
    int numberOfProducts = 0;
    int numberOfMilk = 0;
    int numberOfChocolate =0;

    boolean getNumberOfProducts(){
        if (isEmpty()){
            return false;
        }
        numberOfProducts--; //Jezeli nie puste, pobieramy produkty
        return true;
    }
    boolean getNumberOfMilk(){
        if (isEmpty()){return false; }
        numberOfMilk--;
        return true;
    }
    boolean getNumberOfChocolate(){
        if (isEmpty()){return false;}
        numberOfChocolate--;
        return true;
    }

    boolean isEmpty(){
        return numberOfProducts<=0;
    }
    abstract void fillBoxOfProducts();

}
