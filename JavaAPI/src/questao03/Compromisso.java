package questao03;

import java.util.Calendar;

public class Compromisso {
    private String titulo;
    private String descricao;
    private String local;
    private Calendar data;

    Compromisso(String titulo, String descricao, String local, Calendar data) {
        this.titulo = titulo;
        this.descricao = descricao;
        this.local = local;
        this.data = data;
    }

    String getTitulo() {
        return titulo;
    }

    String getDescricao() {
        return descricao;
    }

    String getLocal() {
        return local;
    }

    Calendar getData() {
        return data;
    }
}
