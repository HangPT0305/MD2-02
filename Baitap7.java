public class Baitap7 {
    public static void main(String[] args) {
        System.out.println("các số nguyên tố nhỏ hơn 100 là:");
        // in ra các số từ 2 đến 99
        for (int i = 2; i < 100; i++) {
            boolean flag = true;
            //căm cờ
            for (int n =2;n <= Math.sqrt(i);n++) {
                // Math.sqr dùng tối ưu hoá code đỡ phải ktra dài dòng
                if (i % n == 0) {
                    flag = false;
                }
            }
            if (flag) {
                System.out.println(i + "đây là số nguyên tố");
            }
        }
    }
}
