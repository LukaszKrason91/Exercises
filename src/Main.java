public class Main {
//    Wywoływanie poszczegulnych zadań

    public static void main(String[] args) {
//        Ex1 exercise1 = new Ex1();
//        exercise1.printMultiplicationTable(5);
//
        Ex2 exercise2 = new Ex2();
        exercise2.isPrimeNumber(0);

        int foundPrimeNumbers = 0;
        int index = 1;
        while(foundPrimeNumbers != 7){
             if(exercise2.isPrimeNumber2(index)){
                 foundPrimeNumbers++;
             }
             index++;
        }

        Ex3 exercise3 = new Ex3();
        exercise3.sumOfNumbersInARange(15,20);

    }
}
