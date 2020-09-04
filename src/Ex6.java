public class Ex6 {
//    6. Dla zadanej tablicy intów policz ile jest w niej liczb ujemnych. Jeśli takie występują
//    utwórz nową tablicę, do której przepisze tylko te ujemne liczby

    public void isNegativeValue(int[] table){
        System.out.print("[ ");
        for(int i: table){
            System.out.print( i + " " );
        }
        System.out.println("]");
        int negativeValue = 0;
        for(int index: table){
            if(index < 0){
                negativeValue++;
            }
        }
        System.out.println(negativeValue);
        if(negativeValue != 0) {
            int[] negativeValues = new int[negativeValue];
            negativeValue = 0;
            for (int index : table) {
                if (index < 0) {
                    negativeValues[negativeValue] = index;
                    negativeValue++;
                }
            }
            System.out.print("[ ");
            for(int i: negativeValues){
                System.out.print( i + " " );
            }
            System.out.println("]");
        }else {
            System.out.println("Tablica nie ma wartosci ujemnych");
        }

    }

}
