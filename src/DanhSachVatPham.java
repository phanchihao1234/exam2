import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DanhSachVatPham {
    private List<VatPham> arr;
    private float soXu;
    public DanhSachVatPham() {
        arr = new ArrayList<>();
    }

    public void nhap() {
        int n ; int flag;
        Scanner s = new Scanner(System.in);
//        System.out.println("1. nhap vat pham");
//        System.out.println("2. nhap so xu cua Spon");
        System.out.println("Nhập soluong vật phẩm");
        n = s.nextInt();
        for (int i=0;i<n;i++) {
            VatPham a = new VatPham();
            a.nhap();
            arr.add(a);
        }
        System.out.println("nhập số xu của spon: ");
        this.soXu = s.nextFloat();

//        VatPham b= new Spon();
//        b.nhap();
//        arr.add(b);
//        flag =s.nextInt();
//        if (flag==1){
//            System.out.println("Nhập soluong vật phẩm");
//            n = s.nextInt();
//            for (int i=0;i<n;i++) {
//                VatPham a = new VatPham();
//                a.nhap();
//                arr.add(a);
//            }
//        }else if (flag ==2){
//
//        }else {
//            nhap();
//        }

    }

    public void xuat() {

        System.out.println("------Thông tin vật phẩm-------");
        for(VatPham a:this.arr){
            a.xuat();
        }
    }
    public void cau3(){
        float max=0;
        String ten="";
        for(VatPham a:this.arr){
            if(max<(a.getSoVangQuyDoi()*a.sucCongPha())){
                max =a.getSoVangQuyDoi()*a.sucCongPha();
                ten = a.getTenVatPham();
            }
        }
        System.out.println("Vật phẩm tốn nhiều xu vàng nhất");
        System.out.println("Tên vật phẩm: " + ten +" -----Giá: "+max);
    }
    public void cau4() {
        float sum = 0;
        for (VatPham a : this.arr) {
            sum+=a.getSoVangQuyDoi()*a.sucCongPha();
        }
        if(this.soXu<sum){
            System.out.println(this.soXu + " Spon ko cứu được team");
        }else {
            System.out.println(this.soXu + "Spon cứu được team");
        }
    }
}
