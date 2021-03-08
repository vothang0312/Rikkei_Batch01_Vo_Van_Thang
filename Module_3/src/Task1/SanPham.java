package Task1;

public abstract class SanPham {
    protected     String tenSP;
    protected     int  soLuong;
    protected     int donGia;
    protected    String danhMuc;

    @Override
    public String toString() {
        return "SanPham{" +
                "tenSP='" + tenSP + '\'' +
                ", soLuong=" + soLuong +
                ", donGia=" + donGia +
                ", danhMuc='" + danhMuc + '\'' +
                ", maSP='" + maSP + '\'' +
                '}';
    }


    public SanPham(String tenSP, int soLuong, int donGia, String danhMuc, String maSP) {
        this.tenSP = tenSP;
        this.soLuong = soLuong;
        this.donGia = donGia;
        this.danhMuc = danhMuc;
        this.maSP = maSP;
    }

    public SanPham(){

    }

    private    String   maSP;

    public String getMaSP() {
        return maSP;
    }

    public void setMaSP(String maSP) {
        this.maSP = maSP;
    }

    public String getTenSP() {
        return tenSP;
    }

    public void setTenSP(String tenSP) {
        this.tenSP = tenSP;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public int getDonGia() {
        return donGia;
    }

    public void setDonGia(int donGia) {
        this.donGia = donGia;
    }

    public String getDanhMuc() {
        return danhMuc;
    }

    public void setDanhMuc(String danhMuc) {
        this.danhMuc = danhMuc;
    }

    public abstract void HienThiThongTin();
    public abstract double PhanTeamGiamGia(String loaikhachhang);
}
