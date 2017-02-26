package Arrays;
import java.util.Arrays;
//слияние
public class Arrays3 {
    public static int a = 0;
    public static int [] b;

    public static void main(String[] args) {
        int [] FirstArray = new int[] {3, 6, 8, 9, 11, 23, 24};
        int [] SeondArray = new int[] {2, 12, 13, 14, 15};
        b = new int[FirstArray.length + SeondArray.length];
        int maxLength = FirstArray.length > SeondArray.length ? FirstArray.length : SeondArray.length;
        for (int i = 0; i < maxLength; i++) {
            numAdd(FirstArray, i);
            numAdd(SeondArray, i);
        }
        Arrays.stream(b).forEach(System.out::println);
    }
    public static void numAdd(int[] arrayFrom, int index) {
        if (index < arrayFrom.length) {
            b[a] = arrayFrom[index];
            a++;
        }
    }
}
