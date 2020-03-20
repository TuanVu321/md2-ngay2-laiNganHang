import java.util.Scanner;

public class interset {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap so tien can vay");
        int money = scanner.nextInt();
        System.out.println("nhap lai suat hang nam theo %");
        double rate = scanner.nextDouble();
        System.out.println("nhap so thang ");
        byte month = scanner.nextByte();
        double totle_interset = money*(rate*100)/12*month;
        System.out.println("So tien lai la: "+ totle_interset);
    }
}
