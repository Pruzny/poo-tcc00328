public class questao06 {
    public static void main(String[] args) {
        int e1 = 0, e2 = 1, e3 = 1;
        System.out.println(e1);
        System.out.println(e2);
        System.out.println(e3);
        while (e3 < 100) {
            e1 = e2;
            e2 = e3;
            e3 += e1;
            System.out.println(e3);
        }
    }
}
