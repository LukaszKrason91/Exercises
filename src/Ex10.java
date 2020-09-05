public class Ex10 {
//    Właśnie się dowiedziałeś, że istnieje operator %. Napisz funkcję, która będzie sprawdzała,
//    czy napisana w poprzednim zadaniu funkcja zwraca dokładnie takie same wyniki jak ten
//    operator. Przetestuj dla różnych przypadków.
    public boolean checkingTheModuloOperatoe(int firstValue, int secondValue){
        Ex9 exercise9 = new Ex9();
        return exercise9.moduloFunction(firstValue,secondValue) == (firstValue % secondValue);
    }
}
