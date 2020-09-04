public class Ex9 {
    //    Załóżmy, że nie wiesz, że istnieje operator %, a potrzebujesz wylicz resztę z dzielenia
//    dwóch liczb. Napisz własną wersję funkcji modulo.
    public void moduloFunction(int firstValue, int secondValue) {
        while(firstValue > secondValue){
            firstValue = firstValue - secondValue;
        }
        System.out.println(firstValue);
    }


}
