package comparearrays;

public class CompareArrays {
    public static void main(String[] args) {
        Compare2DArrays<Integer> compareInteger = new Compare2DArraysImpl<>();
        Compare2DArrays<String> compareString = new Compare2DArraysImpl<>();

        Integer[][] array = {
                {0, 3, 7, 4, 5, 3, 7, 8},
                {0, 3, 2, 1, 5, 2, 1, 4}};
        Integer[][] array1 = {
                {1, 2, 3, 4, 5, 6, 7, 8},
                {9, 8, 7, 6, 5, 4, 3, 4}};

        String[][] array2 = {
                {"qwe","dsa","axa","zxcc"},
                {"qwe","ged","ger","vxcg"},
                {"hjrt","jtj","yutre", "hryu"}};
        String[][] array3 = {
                {"jty","zxcv","sedse","gdr"},
                {"qwe","m","yuj","vxcg"},
                {"hjrt","k","jyu", "ertywer"}};

        System.out.println(compareInteger.compare2DArrays(array, array1));
        System.out.println(compareString.compare2DArrays(array2,array3));
    }
}
