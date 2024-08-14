import java.util.Scanner;

public class baiTap6 {
    public static void main(String[] args) {
        int choice;
        Scanner sc = new Scanner(System.in);
        do{
            System.out.println("----MENU----");
            System.out.println("1.món cá");
            System.out.println("2.bò xào tái");
            System.out.println("3.nộm hoa chuối");
            System.out.println("4.lẩu ba ba");
            System.out.println("5.thoát");
            System.out.println("mời bạn nhập từ 1-5");
            choice = sc.nextInt();
            switch(choice){
                case 1:
                    System.out.println("mời bạn ăn cá");
                    break;
                    case 2:
                        System.out.println("mời bạn ăn thịt bò xào tái");
                        break;
                        case 3:
                            System.out.println("mời bạn ăn nộm hoa chuối");
                            break;
                            case 4:
                                System.out.println("mời bạn ăn lẩu ba ba");
                                break;
                                case 5:
                                    System.exit(0);//câu lệnh thoát trương trình
                                    break;
                                default:
                                    System.out.println("chọn sai cú pháp,vui lòng chọn lại");
                                    break;


            }

        } while (true);
    }
   }