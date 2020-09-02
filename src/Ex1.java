public class Ex1 {
// Wypisz poniższy kawałek tabliczki mnożenia:
//            5 x 1 = 5
//            5 x 2 = 10
//            5 x 3 = 15
//            5 x 4 = 20
//    Zmodyfikuj powyższe żeby wyświetlało ten kawałek tabliczki dla liczby zadanej w
//    parametrze.

    public void printMultiplicationTable(int givenNumber) {
        for (int index = 1; index < 5; index++) {
            System.out.println(givenNumber + " x " + index + " = " + givenNumber * index);
        }
    }
}
