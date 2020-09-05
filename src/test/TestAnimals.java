package test;

import animals.Cat;
import animals.Dog;

public class TestAnimals {
    public static void main(String[] args) {
        Cat cat1 = new Cat();
        cat1.setName("Filemon");

        Cat cat2 = new Cat();
        cat2.setName("Bonifacy");
        cat2.kill();

        Cat cat3 = new Cat();
        cat3.setName("Feliks");


        Dog dog = new Dog();
        dog.setName("Reksio");

        Object[] animals = {cat1, cat2, cat3, dog};

//        String[] animals = {cat1.getName(), cat2.getName(), dog.getName()};

//        for (String nameAnimal : animals) {
//            System.out.println(nameAnimal);
//        }
        for (Object animal : animals) {
            if (animal instanceof Cat) {
                Cat cat = (Cat) animal;
                boolean isCatAlive = cat.isAlive();
                if (isCatAlive == true) {
                    System.out.println(cat.getName());
                }
//                System.out.println(cat.getName());
            } else if (animal instanceof Dog) {
                Dog convertedDog = (Dog) animal;
                boolean isDogAlive = dog.isAlive();
                if (isDogAlive == true) {
                    System.out.println(dog.getName());
                }
//                System.out.println(convertedDog.getName());
            }
        }


    }
}

