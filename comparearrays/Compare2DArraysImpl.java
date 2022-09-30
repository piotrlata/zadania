package comparearrays;

public class Compare2DArraysImpl<T> implements Compare2DArrays<T> {
    @Override
    public String compare2DArrays(T[][] array1, T[][] array2) {
        final int HUNDRED = 100;
        int arrayDim2 = array1[0].length;
        int arrayDim1 = array1.length;
        double count = 0;
        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array1[i].length; j++) {
                if (array1[i][j].equals(array2[i][j])) {
                    count++;
                }
            }
        }
        double result = count / (arrayDim1 * arrayDim2) * HUNDRED;
        return result + "%";
    }
}
