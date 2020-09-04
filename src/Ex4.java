public class Ex4 {
//     Dla zadanej tablicy 3 intów zamień miejscami pierwszy i trzeci element.
//            Przykład:
//    zadana tablica [12, 7, 19]
//    wynik [19, 7, 12]

    public void provideArray(int[] table){
        System.out.print("[ ");
        for(int i: table){
            System.out.print( i + " " );
        }
        System.out.println("]");

      int oldFirstValue = table [0];
        table[0] = table[2];
        table[2] = oldFirstValue;

        System.out.print("[ ");
        for(int i: table){
            System.out.print( i + " " );
        }
        System.out.println("]");
    }
}
