package Task1;

import java.util.ArrayList;
import java.util.Scanner;

public class DoDungHocTap extends  SanPham{
    protected String xuatXu;
    protected String thuongHieu;
    protected String nhaCungCap;
    protected String huongDanSuDung;
    protected String mauSac;
    protected String chatLieu;
    protected double kichThuoc;
    ArrayList<DoDungHocTap> listdodunghoctaps = new ArrayList<>();

    public DoDungHocTap(){

    }

    public DoDungHocTap(String tenSP, int soLuong, int donGia, String danhMuc, String maSP, String xuatXu,
                        String thuongHieu, String nhaCungCap, String huongDanSuDung, String mauSac, String chatLieu, double kichThuoc) {
        super(tenSP, soLuong, donGia, danhMuc, maSP);
        this.xuatXu = xuatXu;
        this.thuongHieu = thuongHieu;
        this.nhaCungCap = nhaCungCap;
        this.huongDanSuDung = huongDanSuDung;
        this.mauSac = mauSac;
        this.chatLieu = chatLieu;
        this.kichThuoc = kichThuoc;
    }

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

    public String getMauSac() {
        return mauSac;
    }

    public void setMauSac(String mauSac) {
        this.mauSac = mauSac;
    }

    public String getChatLieu() {
        return chatLieu;
    }

    public void setChatLieu(String chatLieu) {
        this.chatLieu = chatLieu;
    }

    public double getKichThuoc() {
        return kichThuoc;
    }

    public void setKichThuoc(double kichThuoc) {
        this.kichThuoc = kichThuoc;
    }

    @Override
    public String toString() {
        return "DoDungHocTap{" +
                "xuatXu='" + xuatXu + '\'' +
                ", thuongHieu='" + thuongHieu + '\'' +
                ", nhaCungCap='" + nhaCungCap + '\'' +
                ", huongDanSuDung='" + huongDanSuDung + '\'' +
                ", mauSac='" + mauSac + '\'' +
                ", chatLieu='" + chatLieu + '\'' +
                ", kichThuoc=" + kichThuoc +
                ", tenSP='" + tenSP + '\'' +
                ", soLuong=" + soLuong +
                ", donGia=" + donGia +
                ", danhMuc='" + danhMuc + '\'' +
                '}';
    }

    @Override
    public void HienThiThongTin() {
        System.out.println(listdodunghoctaps);
    }

    @Override
    public double PhanTeamGiamGia(String loaikhachhang) {
        switch (loaikhachhang){
            case "thuong":
                return 0.01;
            case "vip1":
                return 0.03;
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
        System.out.println("Nhap vao xuat xu: ");
        String xuatXu = sc.nextLine();
        System.out.println("Nhap vao ten thuong hieu: ");
        String thuongHieu = sc.nextLine();
        System.out.println("Nhap vao ten nha cung cap: ");
        String nhaCungCap = sc.nextLine();
        System.out.println("Nhap vao huong dan su dung: ");
        String huongDanSuDung = sc.nextLine();
        System.out.println("Nhap vao mau sac: ");
        String mauSac = sc.nextLine();
        System.out.println("Nhap vao chat lieu: ");
        String chatLieu = sc.nextLine();
        System.out.println("Nhap vao kich thuoc: ");
        double kichThuoc = Double.parseDouble(sc.nextLine());

        DoDungHocTap doDungHocTap = new DoDungHocTap(tenSP,soLuong,donGia,danhMuc,maSP,
                xuatXu,thuongHieu,nhaCungCap,huongDanSuDung,mauSac,chatLieu,kichThuoc);
        listdodunghoctaps.add(doDungHocTap);

    }

}
