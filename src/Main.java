import Ex11.Animal;
import Ex11.Cat;
import Ex11.Cow;
import Ex11.Dog;

public class Main {
//    Wywoływanie poszczegulnych zadań

    public static void main(String[] args) {
        Ex1 exercise1 = new Ex1();
        exercise1.printMultiplicationTable(5);

        System.out.println("-------------------");

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
        System.out.println("-------------------");

        Ex3 exercise3 = new Ex3();
        exercise3.sumOfNumbersInARange(15,20);

        System.out.println("-------------------");

        Ex4 exercise4 = new Ex4();
        int[] table = {1, 5, 77};
        exercise4.provideArray(table);

        System.out.println("-------------------");

        Animal kot = new Cat();
        Animal pies = new Dog();
        Animal krowa = new Cow();

        Animal[] wies = {kot,krowa,pies};
        for (int i = 0; i< wies.length; i++){
            wies[i].makeSound();
        }

        System.out.println("-------------------");

        Ex5 exercise5 = new Ex5();
        int[] table1 = {85, 96, 78, 108, 3, 100, 98, 7};
        exercise5.showBiggestAndSmallestFromTable(table1);

        System.out.println("-------------------");

        Ex6 exercise6 = new Ex6();
        exercise6.isNegativeValue(table1);

        System.out.println("-------------------");

        Ex7 exercise7 = new Ex7();
        exercise7.getArtmeticSequence(9,78,25);
        exercise7.getArtmeticSequence(5,2,3);

        System.out.println("-------------------");

        Ex8 exercise8 = new Ex8();
        System.out.println(exercise8.isSequenceisArtmecic(table1));

        System.out.println("-------------------");

        Ex9 exercise9 = new Ex9();
        exercise9.moduloFunction(9,4);
        exercise9.moduloFunction(2,1);

        System.out.println("-------------------");

        Ex10 exercise10 = new Ex10();
        System.out.println(exercise10.checkingTheModuloOperatoe(8, 3));
        System.out.println(exercise10.checkingTheModuloOperatoe(1, 2));




    }
}
