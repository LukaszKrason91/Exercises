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
    }
}
