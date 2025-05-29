public class bai6_epKieuDuLieu {
    public static void main(String[] args) {
        int a = 5;
        int b = 10;
        double kq = (double) a/b; //int -> double

        System.out.println(kq);

        //Ép kiểu hẹp
        int c = 128;
        byte d = (byte) c;
        System.out.println(c);
        System.out.println(d);

        int e = 15;
        byte f = (byte) e;
        System.out.println(f); // int -> byte
        System.out.println(e);
    }
}
