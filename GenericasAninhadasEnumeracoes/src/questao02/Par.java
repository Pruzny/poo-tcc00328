package questao02;

public class Par<F, S> {
    private F primeiro;
    private S segundo;
    
    Par(F primeiro, S segundo) {
        this.primeiro = primeiro;
        this.segundo = segundo;
    }
    
    public F getPrimeiro() {
        return primeiro;
    }
    
    public S getSegundo() {
        return segundo;
    }
    
    public void setPrimeiro(F novo) {
        primeiro = novo;
    }
    
    public void setSegundo(S novo) {
        segundo = novo;
    }
    
}
