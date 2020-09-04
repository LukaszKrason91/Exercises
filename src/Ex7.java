public class Ex7 {
    //    Napisz funkcję tworzącą ciąg arytmetyczny o podanych: długości, pierwszym elemencie,
//    różnicy ciągu
    public void getArtmeticSequence(int length, int firstValue, int difference) {
        int[] artmecicSequence = new int[length];
        for(int i = 0; i < length; i++){
            artmecicSequence[i] = firstValue + i*difference;
        }
        System.out.print("[ ");
        for(int i: artmecicSequence){
            System.out.print( i + " " );
        }
        System.out.println("]");

    }

}
