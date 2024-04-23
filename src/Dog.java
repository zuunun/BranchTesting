public class Dog extends Animal {

    @Override
    public void makeSound() {
        System.out.println("Woof");
    }

    //...
    @Override
    public boolean eat(String foodType) {
        return true;
    }


    @Override
    public void showMood(boolean happy) {
        if (happy)
            System.out.println("The dog is wagging its tail");
        else
            System.out.println("The dog is growling");
    }
}


