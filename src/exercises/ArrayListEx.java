package exercises;

public class ArrayListEx {
    public static void main(String[] args) {
        int[] someNumbers = {1,2,3,4,5,6,7,8,9,10,11,12};
        int sumN = 0;
        for (int i : someNumbers) {
            if (i % 2 == 0) {
                sumN = sumN + i;
            }
        }
        System.out.println(sumN);
    }
}
