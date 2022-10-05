import java.util.Scanner;

public class no_1020 {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        String[] s = sc.next().split("[-]");
        int[] arr = new int[s.length];
        for(int i = 0; i < arr.length; i++){
            arr[i] = Integer.parseInt(s[i]);
        }
        System.out.printf("%06d%07d", arr[0], arr[1]);
    }
}