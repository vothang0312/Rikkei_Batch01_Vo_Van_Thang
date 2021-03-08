package Task1;

import java.util.ArrayList;
import java.util.Scanner;

public class DoChoiTreEm extends SanPham {

    protected String xuatXu;
    protected String thuongHieu;
    protected String nhaCungCap;
    protected String huongDanSuDung;
    ArrayList<DoChoiTreEm> listdochoitreems = new ArrayList<>();

    public String getXuatXu() {
        return xuatXu;
    }

    public void setXuatXu(String xuatXu) {
        this.xuatXu = xuatXu;
    }

    public String getThuongHieu() {
        return thuongHieu;
    }

    public void setThuongHieu(String thuongHieu) {
        this.thuongHieu = thuongHieu;
    }

    public String getNhaCungCap() {
        return nhaCungCap;
    }

    public void setNhaCungCap(String nhaCungCap) {
        this.nhaCungCap = nhaCungCap;
    }

    public String getHuongDanSuDung() {
        return huongDanSuDung;
    }

    public void setHuongDanSuDung(String huongDanSuDung) {
        this.huongDanSuDung = huongDanSuDung;
    }
    public DoChoiTreEm(){

    }
    public DoChoiTreEm(String tenSP, int soLuong, int donGia, String danhMuc, String maSP, String xuatXu,
                       String thuongHieu, String nhaCungCap, String huongDanSuDung) {
        super(tenSP, soLuong, donGia, danhMuc, maSP);
        this.xuatXu = xuatXu;
        this.thuongHieu = thuongHieu;
        this.nhaCungCap = nhaCungCap;
        this.huongDanSuDung = huongDanSuDung;
    }

    @Override
    public String toString() {
        return "DoChoiTreEm{" +
                "xuatXu='" + xuatXu + '\'' +
                ", thuongHieu='" + thuongHieu + '\'' +
                ", nhaCungCap='" + nhaCungCap + '\'' +
                ", huongDanSuDung='" + huongDanSuDung + '\'' +
                ", tenSP='" + tenSP + '\'' +
                ", soLuong=" + soLuong +
                ", donGia=" + donGia +
                ", danhMuc='" + danhMuc + '\'' +
                '}';
    }

    @Override
    public void HienThiThongTin() {
        System.out.println(listdochoitreems);
    }

    @Override
    public double PhanTeamGiamGia(String loaikhachhang) {
        switch (loaikhachhang){
            case "thuong":
                return 0.02;
            case "vip1":
                return 0.05;
            case "vip2":
                return 0.07;
        }
        return 0;
    }
    public void Them(){
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
        System.out.println("Nhap vao ma xuat xu: ");
        String xuatXu = sc.nextLine();
        System.out.println("Nhap vao thuong hieu: ");
        String thuongHieu = sc.nextLine();
        System.out.println("Nhap vao nha cung cap: ");
        String nhaCungCap = sc.nextLine();
        System.out.println("Nhap vao huong dan su dung: ");
        String huongDanSuDung = sc.nextLine();
        //tao ra bien de luu gia tri
        DoChoiTreEm doChoiTreEm = new DoChoiTreEm(tenSP,soLuong,donGia,danhMuc,maSP,xuatXu,thuongHieu,nhaCungCap,huongDanSuDung);
        listdochoitreems.add(doChoiTreEm);


    }
}
