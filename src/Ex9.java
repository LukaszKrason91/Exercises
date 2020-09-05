public class Ex9 {
    //    Załóżmy, że nie wiesz, że istnieje operator %, a potrzebujesz wylicz resztę z dzielenia
//    dwóch liczb. Napisz własną wersję funkcji modulo.
    public int moduloFunction(int firstValue, int secondValue) {
        while(firstValue > secondValue){
            firstValue = firstValue - secondValue;
        }
        System.out.println(firstValue);
        return firstValue;
    }

    public int getRemainderAfterDivision(int baseNumber, int divider){
        int divisionResultRounded = baseNumber/divider;
        return baseNumber - (divisionResultRounded*divider);
    }



}
