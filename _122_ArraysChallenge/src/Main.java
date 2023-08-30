import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int[] arr = generateArray(10);
        System.out.println(Arrays.toString(arr));
        sortDescending(arr);
        System.out.println(Arrays.toString(arr));
    }
    private static int[] generateArray(int len){
        Random random = new Random();
        int[] arr = new int[len];
        for(int i = 0;i<len;i++){
            arr[i] = random.nextInt(100);
        }
        return arr;
    }
    private static void sortDescending(int[] arr){
        int n = arr.length;
        int tmp;
        for(int i = 0;i<n-1;i++){
            for (int j = i+1;j<n;j++){
                if(arr[j]>arr[i]){
                    tmp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = tmp;
                }
            }
        }
    }
}