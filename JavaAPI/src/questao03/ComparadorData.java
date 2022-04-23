package questao03;

import java.util.Calendar;
import java.util.Comparator;

public class ComparadorData implements Comparator<Compromisso> {
    private int op;

    ComparadorData(int op) {
        this.op = op;
    }

    @Override
    public int compare(Compromisso c1, Compromisso c2) {
        int constante;
        if (op == 0) {
            constante = Calendar.MINUTE;
        } else {
            constante = Calendar.HOUR;
        }
        return c1.getData().get(constante) - c2.getData().get(constante);
    }
}
