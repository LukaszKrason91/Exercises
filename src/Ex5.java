public class Ex5 {
//    Dla zadanej tablicy intów wyświetl najmniejszą oraz największą liczbę z tablicy

    public void showBiggestAndSmallestFromTable(int[] table){
            System.out.print("[ ");
            for(int i: table){
                System.out.print( i + " " );
            }
            System.out.println("]");
            int min = table[0];
            int max = min;
            for(int index:table){
                if(min > index){
                    min = index;
                }else{
                    if (max < index){
                        max = index;
                    }
                }
            }
            System.out.println("Max Value = " + max);
            System.out.println("Min Value = " + min);
    }



}
