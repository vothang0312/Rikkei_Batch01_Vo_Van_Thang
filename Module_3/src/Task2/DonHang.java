package Task2;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class DonHang {
    private   String maHoaDon;
    private String maKhachHang;
    private   String maSanPham;
    private int soLuong;
    private Date ngayMua;
    private   int donGia;
    private   int tongTien;

    @Override
    public String toString() {
        return "DonHang{" +
                "maHoaDon='" + maHoaDon + '\'' +
                ", maKhachHang='" + maKhachHang + '\'' +
                ", maSanPham='" + maSanPham + '\'' +
                ", soLuong=" + soLuong +
                ", ngayMua=" + ngayMua +
                ", donGia=" + donGia +
                ", tongTien=" + tongTien +
                ", donHangs=" + donHangs +
                '}';
    }

    ArrayList<DonHang> donHangs= new ArrayList<DonHang>();
    public String getMaHoaDon() {
        return maHoaDon;
    }

    public void setMaHoaDon(String maHoaDon) {
        this.maHoaDon = maHoaDon;
    }

    public String getMaKhachHang() {
        return maKhachHang;
    }

    public void setMaKhachHang(String maKhachHang) {
        this.maKhachHang = maKhachHang;
    }

    public String getMaSanPham() {
        return maSanPham;
    }

    public void setMaSanPham(String maSanPham) {
        this.maSanPham = maSanPham;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public Date getNgayMua() {
        return ngayMua;
    }

    public void setNgayMua(Date ngayMua) {
        this.ngayMua = ngayMua;
    }

    public int getDonGia() {
        return donGia;
    }

    public void setDonGia(int donGia) {
        this.donGia = donGia;
    }

    public int getTongTien() {
        return tongTien;
    }

    public void setTongTien(int tongTien) {
        this.tongTien = tongTien;
    }

    public DonHang(String maHoaDon, String maKhachHang, String maSanPham, int soLuong, Date ngayMua, int donGia, int tongTien) {
        this.maHoaDon = maHoaDon;
        this.maKhachHang = maKhachHang;
        this.maSanPham = maSanPham;
        this.soLuong = soLuong;
        this.ngayMua = ngayMua;
        this.donGia = donGia;
        this.tongTien = tongTien;
    }

    public DonHang()
    {

    }
    public  void Them()
    {
        Scanner sc  = new Scanner(System.in);
        System.out.println("Nhap ma hoa don:");
        String maHoaDon = sc.nextLine();
        System.out.println("Nhap ma khach hang::");
        String maKhachHang = sc.nextLine();
        System.out.println("Nhap ma san pham:");
        String maSanPham = sc.nextLine();
        System.out.println("Nhap so luong:");
        int soLuong = Integer.parseInt(sc.nextLine());

        Date date = new Date();
        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
        while (true) {
            try {
                System.out.println("Nhap Ngay mua:");
                String ngayMua = sc.nextLine();
                date = format.parse(ngayMua);
                break;
            } catch (Exception e) {
                System.out.println("Sai dinh dang");
            }
            break;
        }
        System.out.println("Nhap don gia:");
        int donGia = Integer.parseInt(sc.nextLine());
        System.out.println("Nhap tong tien:");
        int tongTien =Integer.parseInt(sc.nextLine());
        DonHang dh = new DonHang(maHoaDon,maKhachHang,maSanPham,soLuong,date,donGia,tongTien);
        donHangs.add(dh);
    }
    public  void HienThi(){
        System.out.println(donHangs);
    }
}
