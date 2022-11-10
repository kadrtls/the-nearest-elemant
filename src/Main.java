import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("bir sayı giriniz.");
        int  num= scanner.nextInt();
        int[] arr={12,19,7,33,71,26,54};
        for (int dizi:arr) {
            System.out.print(dizi +",");
        }
        System.out.println();
        Arrays.sort(arr);
        for (int i=0;i< arr.length;i++){
            if (arr[i]>=num){
                System.out.println("sayıya yakın en büyük sayı:"+arr[i]);
                System.out.println("sayıya yakın en küçük sayı:"+arr[i-1]);
                break;
            }
        }
    }
}