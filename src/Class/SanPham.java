/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Class;

import java.util.Date;

/**
 *
 * @author Nguyen Quoc Huy
 */
public class SanPham {

    private int IDSanPham;
    private String tenSanPham;
    private int soLuongConLai;
    private Date HSD;
    private Date NSX;
    private String hinhAnhMinhHoa;
    private int donGia;

    public SanPham() {
    }

    public SanPham(int IDSanPham, String tenSanPham, int soLuongConLai, Date HSD, Date NSX, String hinhAnhMinhHoa, int donGia) {
        this.IDSanPham = IDSanPham;
        this.tenSanPham = tenSanPham;
        this.soLuongConLai = soLuongConLai;
        this.HSD = HSD;
        this.NSX = NSX;
        this.hinhAnhMinhHoa = hinhAnhMinhHoa;
        this.donGia = donGia;
    }

    public int getIDSanPham() {
        return IDSanPham;
    }

    public void setIDSanPham(int IDSanPham) {
        this.IDSanPham = IDSanPham;
    }

    public String getTenSanPham() {
        return tenSanPham;
    }

    public void setTenSanPham(String tenSanPham) {
        this.tenSanPham = tenSanPham;
    }

    public int getSoLuongConLai() {
        return soLuongConLai;
    }

    public void setSoLuongConLai(int soLuongConLai) {
        this.soLuongConLai = soLuongConLai;
    }

    public Date getHSD() {
        return HSD;
    }

    public void setHSD(Date HSD) {
        this.HSD = HSD;
    }

    public Date getNSX() {
        return NSX;
    }

    public void setNSX(Date NSX) {
        this.NSX = NSX;
    }

    public String getHinhAnhMinhHoa() {
        return hinhAnhMinhHoa;
    }

    public void setHinhAnhMinhHoa(String hinhAnhMinhHoa) {
        this.hinhAnhMinhHoa = hinhAnhMinhHoa;
    }

    public int getDonGia() {
        return donGia;
    }

    public void setDonGia(int donGia) {
        this.donGia = donGia;
    }

}
