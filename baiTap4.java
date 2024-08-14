import java.util.Scanner;

public class baiTap4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập vào số bắt đầu của mảng");
        int start = sc.nextInt();
        System.out.println("nhập số kết thuc mảng");
        int end = sc.nextInt();
        int sum = 0;
        for (int i = start; i <= end; i++) {
            if (i % 2 == 0) {
                sum += i;

            }
        }
        System.out.println("tổng các số chẵn trong khoảng từ " + start + "đến" + end + "là:" + sum);

    }
}
