import java.util.Scanner;

public class baiTap1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap vao so bat ki");
        int n = sc.nextInt();
        if (n% 3==0 && n%5==0) {
            System.out.println(n +"có chia hết cho 3 và 5");
        }else {
            System.out.println("không chia hết cho 3 và 5");
        }

    }
}
