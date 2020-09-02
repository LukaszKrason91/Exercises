public class Ex2 {
    //    2. Dla danej liczby sprawdź, czy jest ona liczbą pierwszą.
//        2.2 Znajdz 7 pierwszych liczb pierwszych
    public void isPrimeNumber(int primeNumber) {
        if (primeNumber == 0){
            return ;
        }
        for(int i = 2; i < primeNumber; i++){
            if(primeNumber%i==0){
                System.out.println(primeNumber + " nie jest liczbą pierwszą, dzieli się przez " + i);
                return;
            }
        }
        System.out.println(primeNumber + " jest liczbą pierwszą");
    }
    public boolean isPrimeNumber2(int primeNumber) {
        if (primeNumber == 0){
            return false;
        }
        for(int i = 2; i < primeNumber; i++){
            if(primeNumber%i==0){
                return false;
            }
        }
        System.out.println(primeNumber + " jest liczbą pierwszą");
        return true;
    }

}
