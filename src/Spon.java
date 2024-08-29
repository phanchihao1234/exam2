import java.util.Scanner;

public class Spon extends VatPham{
    private int soXu;
    public Spon(){

    }
    public int getSoXu() {
        return soXu;
    }

    public void setSoXu(int soXu) {
        this.soXu = soXu;
    }

    public void nhap(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số xu của Spon: ");
        this.soXu = sc.nextInt();
    }
    public void xuat(){
        System.out.println("############");
        System.out.println("số xu: " + this.soXu);
    }

}
