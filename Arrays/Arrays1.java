package Arrays;
// Сдвиг массива
public class Arrays1 {
    public static void main(String[] args) {
        int[] array1 = new int[]{1, 2, 3, 4, 5, 6, 7, 8};
        int n = 1;
        int[] arrray2 = new int[array1.length];
        for (int i = array1.length - 1; i >= 0; i--) {
            if (i + n >= array1.length) {
                arrray2[i + n - array1.length] = array1[i];
            } else {
                arrray2[i + n] = array1[i];
            }
        }
        for (int i : arrray2) {
            System.out.println(i);
        }

    }
}