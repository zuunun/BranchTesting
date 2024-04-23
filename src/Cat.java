public class Cat extends Animal {

    @Override
    public void makeSound() {
        System.out.println("Meow");
    }

    //...
    @Override
    public boolean eat(String foodType) {
        return true;
    }

    @Override
    public void showMood(boolean happy) {
        if (happy)
            System.out.println("The cat is purring");
        else
            System.out.println("The cat is hissing");
    }
}



