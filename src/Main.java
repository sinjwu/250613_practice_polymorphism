class Animal {
    public void makeSound() {
        System.out.println();
    }
}

class Dog extends Animal {
    @Override
    public void makeSound() {
        System.out.println("멍멍");
    }
}

class Cat extends Animal {
    @Override
    public void makeSound() {
        System.out.println("야옹");
    }
}

class Lion extends Animal {
    @Override
    public void makeSound() {
        System.out.println("어흥");
    }
}

public class Main {
    public static void main(String[] args) {
        Animal a1 = new Dog();
        Animal a2 = new Cat();
        Animal a3 = new Lion();

        Animal[] animals = {a1, a2, a3};
        for (int i = 0; i < animals.length; i++) {
            animals[i].makeSound();
        }
    }
}