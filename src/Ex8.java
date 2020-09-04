public class Ex8 {
    //    Sprawdź, czy podany ciąg liczb jest ciągiem arytmetycznym
    public boolean isSequenceisArtmecic(int[] table) {
        int difference = table[1] - table[0];
        int firstValue = table[0];
        int[] arrayTable = new int[table.length];

        for (int i = 1; i < table.length; i++) {
            if(difference != (table[i] - table[i-1])){
                return false;
            }
        }


        return true;
    }


}
