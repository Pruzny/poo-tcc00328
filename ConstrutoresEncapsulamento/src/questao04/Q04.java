package questao04;

public class Q04 {
    public static void q04() {
        Data datas[] = new Data[6];
        datas[0] = new Data(31, 1, 2019);
        datas[1] = new Data(12, 12, 2001);
        datas[2] = new Data("Agosto", 8, 2017);
        datas[3] = new Data("Janeiro", 31, 2019);
        datas[4] = new Data(31, 2019);
        datas[5] = new Data(346, 2001);

        for (int i=0; i<6; i++) {
            datas[i].mostrarData();
            System.out.println();
        }
    }
}
