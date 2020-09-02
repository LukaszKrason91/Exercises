public class Ex3 {
    //    3. Napisz funkcję, która dla zadanych dwóch parametrów X i Y obliczy sumę liczb od X do Y
    public void sumOfNumbersInARange(int firstNumber, int secondNumber) {
        int sum = 0;
        if (firstNumber < secondNumber) {
            for (int i = firstNumber; i <= secondNumber; i++) {
                sum = sum + i;
            }
        } else {
            for (int i = secondNumber; i <= firstNumber; i++) {
                sum = sum + i;
            }
        }
        System.out.println("suma liczb z zadanego zakresu wynosi: " + sum);
    }

}
