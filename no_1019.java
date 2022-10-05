import java.util.Scanner;

public class no_1019 {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        String[] s = sc.next().split("[.]");
        int[] arr = new int[s.length];
        for(int i = 0; i < arr.length; i++){
            arr[i] = Integer.parseInt(s[i]);
        }
        System.out.printf("%04d.%02d.%02d", arr[0], arr[1], arr[2]);
    }
}