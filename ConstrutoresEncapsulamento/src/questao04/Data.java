package questao04;

public class Data {
    private int dia;
    private int mes;
    private int ano;
    
    public Data(int dia, int mes, int ano) {
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }
    
    public Data(String mes, int dia, int ano) {
        this.dia = dia;
        this.ano = ano;

        String[] meses = {"Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho",
            "Julho", "Agosto", "Setembro", "Outubro", "Novembro", "Dezembro"};
        int num = 0;
        for (int i=0; i<12; i++) {
            if (mes.toLowerCase().equals(meses[i].toLowerCase())) {
                num = i+1;
            }
        }
        this.mes = num;
    }
    
    public Data(int dias, int ano) {
        this.ano = ano;
        int[] mesesNum = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int i = 0;
        while (dias > mesesNum[i]) {
            dias -= mesesNum[i];
            i++;
        }
        this.dia = dias;
        this.mes = i+1;
    }

    public void mostrarData() {
        System.out.printf("%02d/%02d/%04d\n", this.dia, this.mes, this.ano);

        String[] meses = {"Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho",
            "Julho", "Agosto", "Setembro", "Outubro", "Novembro", "Dezembro"};
        System.out.printf("%s %02d, %04d\n", meses[this.mes-1], this.dia, this.ano);

        int[] mesesNum = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int dias = 0;
        for (int i=0; i<mes-1; i++) {
            dias += mesesNum[i];
        }
        dias += this.dia;
        System.out.printf("%03d %04d\n", dias, this.ano);
    }
}
