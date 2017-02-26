package Arrays;
//удаление одинаковых чисел
public class Arrays2 {
    public static void main(String[] args) {
        boolean x;
        int [] array1 = new int [] {26, 100, 51, 51, 123, 18, 100, 89, 26, 13, 100};
        int [] array2 = new int [array1.length];
        int a = 0;
        for(int i = 0; i < array1.length; i++) {
            x = true;
            for(int j = 0; j < a; j++) {
                if (array1[i] == array2[j]) {
                    x = false;
                }
            }
            if (x) {
                array2[a] = array1[i];
                a++;
            }
        }
        for (int i = 0; i < a; i++) {
            System.out.print(array2[i] + " ");
        }
    }
}