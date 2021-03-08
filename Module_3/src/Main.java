import Task1.DoChoiTreEm;
import Task1.DoDungHocTap;
import Task1.Sach;
import Task2.DonHang;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Sach sach = new Sach();
        DoChoiTreEm dcte = new DoChoiTreEm();
        DoDungHocTap ddht = new DoDungHocTap();
        DonHang donHang = new DonHang();

        int functionID = 0;
        boolean flag = true;
        do {
            showMenu();
            functionID = sc.nextInt();
            sc.nextLine();
            switch (functionID) {
                case 1:
                    sach.Them();break;
                case 2:
                    ddht.Them();break;
                case 3:
                    dcte.Them();;break;
                case 4:donHang.Them();break;

                case 5:
                    sach.HienThiThongTin();
                    break;
//                case 6:showAlldodunghoctap();break;
//                case 7:showAlldochoitreem();break;
//                case 8:

                case 9:
                    donHang.HienThi();
                    sach.HienThiThongTin();
                    dcte.HienThiThongTin();
                    ddht.HienThiThongTin();
                    break;
//                case 10:timkiemtomasp();break;
//                case 11:timkiemtomakh();break;
                default:
                    flag = false;
                    break;
            }
        } while (flag == true);
        sc.close();
    }
    public static void showMenu(){
        System.out.println("1.Thêm sách");
        System.out.println("2.Thêm Đồ dùng học tập");
        System.out.println("3.Thêm đồ chơi trẻ em");
        System.out.println("4.Thêm đơn hàng");
        System.out.println("5.Hiển thị tất cả sản phẩm sách");
        System.out.println("6.Hiển thị tất cả sản phẩm đồ dùng học tập");
        System.out.println("7.Hiển thị tất cả sản phẩm đồ chơi trẻ em");
        System.out.println("8.Hiển thị tất cả sản phẩm có trong nhà sách");
        System.out.println("9.Hiển thị danh sách đơn hàng");
        System.out.println("10.Tìm kiếm theo mã sản phẩm");
        System.out.println("11.Tìm kiếm theo mã khách hàng");
        System.out.println("12.Thoát");
    }

}
