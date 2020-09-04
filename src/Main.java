import Ex11.Animal;
import Ex11.Cat;
import Ex11.Cow;
import Ex11.Dog;

public class Main {
//    Wywoływanie poszczegulnych zadań

    public static void main(String[] args) {
//        Ex1 exercise1 = new Ex1();
//        exercise1.printMultiplicationTable(5);
//
        Ex2 exercise2 = new Ex2();
        exercise2.isPrimeNumber(0);

        int foundPrimeNumbers = 0;
        int index = 2;
        while(foundPrimeNumbers != 7){
             if(exercise2.isPrimeNumber2(index)){
                 foundPrimeNumbers++;
             }
             index++;
        }

        Ex3 exercise3 = new Ex3();
        exercise3.sumOfNumbersInARange(15,20);

        Ex4 exercise4 = new Ex4();
        int[] table = {1, 5, 77};
        exercise4.provideArray(table);

        Animal kot = new Cat();
        Animal pies = new Dog();
        Animal krowa = new Cow();

        Animal[] wies = {kot,krowa,pies};
        for (int i = 0; i< wies.length; i++){
            wies[i].makeSound();
        }

        Ex5 exercise5 = new Ex5();
        int[] table1 = {85, 96, 78, 108, 3, 100, 98, 7};
        exercise5.showBiggestAndSmallestFromTable(table1);

        Ex6 exercise6 = new Ex6();
        exercise6.isNegativeValue(table1);

        Ex7 exercise7 = new Ex7();
        exercise7.getArtmeticSequence(9,78,25);
        exercise7.getArtmeticSequence(5,2,3);




    }
}
