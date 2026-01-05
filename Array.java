import java.util.Scanner;
public class Array {
    public static void main(String []args){
        Scanner sca = new Scanner(System.in);
        System.out.print("Enter size of array : ");
        int size = sca.nextInt();
        int[] array = new int[size];
        int sum = 0;

        for (int a = 0;a < size; a++) {
            while (true){
                System.out.printf("Enter array of index %d : ",a);
                int value = sca.nextInt();
            if (value >= 0 && value <= 50) {
                array[a] = value;
                sum += value;
                break;
            }else {
                System.out.println("Try again.!");
            }
            }
        }
        System.out.println(sum + "");
        sca.close();
    }
}