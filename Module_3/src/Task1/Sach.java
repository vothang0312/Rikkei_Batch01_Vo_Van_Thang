package Task1;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class Sach extends SanPham{
    protected String namXuatBan;
    protected String tacGia;
    protected Date ngayXuatBan;
    protected int lanTaiBan;
    ArrayList<Sach> listsSaches = new ArrayList<>();

    @Override
    public String toString() {
        return "Sach{" +
                "namXuatBan='" + namXuatBan + '\'' +
                ", tacGia='" + tacGia + '\'' +
                ", ngayXuatBan=" + ngayXuatBan +
                ", lanTaiBan=" + lanTaiBan +
                ", tenSP='" + tenSP + '\'' +
                ", soLuong=" + soLuong +
                ", donGia=" + donGia +
                ", danhMuc='" + danhMuc + '\'' +
                '}';
    }

    public Sach() {

    }

    public Sach(String tenSP, int soLuong, int donGia, String danhMuc, String maSP,
                String namXuatBan, String tacGia, Date ngayXuatBan, int lanTaiBan) {
        super(tenSP, soLuong, donGia, danhMuc, maSP);

        this.namXuatBan = namXuatBan;
        this.tacGia = tacGia;
        this.ngayXuatBan = ngayXuatBan;
        this.lanTaiBan = lanTaiBan;
    }


    public String getNamXuatBan() {
        return namXuatBan;
    }

    public void setNamXuatBan(String namXuatBan) {
        this.namXuatBan = namXuatBan;
    }

    public String getTacGia() {
        return tacGia;
    }

    public void setTacGia(String tacGia) {
        this.tacGia = tacGia;
    }

    public Date getNgayXuatBan() {
        return ngayXuatBan;
    }

    public void setNgayXuatBan(Date ngayXuatBan) {
        this.ngayXuatBan = ngayXuatBan;
    }

    public int getLanTaiBan() {
        return lanTaiBan;
    }

    public void setLanTaiBan(int lanTaiBan) {
        this.lanTaiBan = lanTaiBan;
    }


    @Override
    public void HienThiThongTin() {
        System.out.println(listsSaches);
    }

    @Override
    public double PhanTeamGiamGia(String loaikhachhang) {
        switch (loaikhachhang) {
            case "thuong":
                return 0.02;
            case "vip1":
                return 0.05;
            case "vip2":
                return 0.1;
        }
        return 0;

    }

    public void Them() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao ten SP: ");
        String tenSP = sc.nextLine();
        System.out.println("Nhap vao so luong: ");
        int soLuong = Integer.parseInt(sc.nextLine());
        System.out.println("Nhap vao don gia: ");
        int donGia = Integer.parseInt(sc.nextLine());
        System.out.println("Nhap vao danh muc: ");
        String danhMuc = sc.nextLine();
        System.out.println("Nhap vao ma Sp: ");
        String maSP = sc.nextLine();
        System.out.println("Nhap vao nam xuat ban: ");
        String namXuatBan = sc.nextLine();
        System.out.println("Nhap vao tac gia: ");
        String tacGia = sc.nextLine();

        System.out.println("Nhap vao lan tai ban: ");
        int lanTaiBan = Integer.parseInt(sc.nextLine());
        Date date = new Date();
        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
        while (true) {
            try {
                System.out.println("Nhap vao ngay Xuat Ban: ");
                String ngayXuatBan = sc.nextLine();
                date = format.parse(ngayXuatBan);
                break;
            } catch (Exception e) {
                System.out.println("Sai dinh dang");
            }
            break;
        }
        Sach sach = new Sach(tenSP, soLuong, donGia, danhMuc, maSP, namXuatBan, tacGia, date, lanTaiBan);
        listsSaches.add(sach);


    }

}
