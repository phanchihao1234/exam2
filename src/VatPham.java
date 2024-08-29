import java.util.Scanner;

public class VatPham {
    private String tenVatPham;
    private float chiSo;
    private float hetSo;
    private float soVangQuyDoi;

    public VatPham(){

    }

    public VatPham(String tenVatPham, float chiSo, float hetSo,float soVangQuyDoi) {
        this.tenVatPham = tenVatPham;
        this.chiSo = chiSo;
        this.hetSo = hetSo;
        this.soVangQuyDoi=soVangQuyDoi;
    }

    public String getTenVatPham() {
        return tenVatPham;
    }

    public void setTenVatPham(String tenVatPham) {
        this.tenVatPham = tenVatPham;
    }

    public float getChiSo() {
        return chiSo;
    }

    public void setChiSo(float chiSo) {
        this.chiSo = chiSo;
    }

    public float getHetSo() {
        return hetSo;
    }

    public void setHetSo(float hetSo) {
        this.hetSo = hetSo;
    }

    public float getSoVangQuyDoi() {
        return soVangQuyDoi;
    }

    public void setSoVangQuyDoi(float soVangQuyDoi) {
        this.soVangQuyDoi = soVangQuyDoi;
    }

    public float sucCongPha(){
//        float scp = this.chiSo*this.hetSo;
        return this.chiSo*this.hetSo;
    }
    public void nhap(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập tên vật phẩm: ");
        this.tenVatPham = sc.nextLine();
        System.out.println("Nhập chỉ số sức mạnh: ");
        this.chiSo = sc.nextFloat();
        System.out.println("Nhập hệ số sức mạnh: ");
        this.hetSo = sc.nextFloat();
        System.out.println("Số vàng quy đổi trên 1 sức công phá: ");
        this.soVangQuyDoi = sc.nextFloat();
    }
    public  void xuat(){
        System.out.println("~~~~~~~~~~~~~~~");
        System.out.println("Tên vật phẩm: "+ this.tenVatPham);
        System.out.println("Chỉ số sức mạnh: "+ this.chiSo);
        System.out.println("Hệ số sức mạnh: "+ this.hetSo);
        System.out.println("Số vàng quy đổi trên 1 sức công phá: "+ this.soVangQuyDoi);
        System.out.printf("Sức công phá: %f\n",sucCongPha());
    }

}
