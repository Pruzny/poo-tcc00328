package questao01;

public class ConversaoUnidadesArea {
    private static final double METRO_PE = 10.76;
    private static final double PE_CENTIMETRO = 929;
    private static final double MILHA_ACRE = 640;
    private static final double ACRE_PE = 43560;
    
    public static double metroParaPe(double metro) {
        return metro*METRO_PE;
    }
    
    public static double peParaMetro(double pe) {
        return pe/METRO_PE;
    }
    
    public static double peParaCentimetro(double pe) {
        return pe*PE_CENTIMETRO;
    }
    
    public static double centimetroParaPe(double centimetro) {
        return centimetro/PE_CENTIMETRO;
    }
    
    public static double milhaParaAcre(double milha) {
        return milha*MILHA_ACRE;
    }
    
    public static double acreParaMilha(double acre) {
        return acre/MILHA_ACRE;
    }
    
    public static double acreParaPe(double acre) {
        return acre*ACRE_PE;
    }
    
    public static double peParaAcre(double pe) {
        return pe/ACRE_PE;
    }
    
    public static double metroParaAcre(double metro) {
        return peParaAcre(metroParaPe(metro));
    }
    
    public static double metroParaCentimetro(double metro) {
        return peParaCentimetro(metroParaPe(metro));
    }
}
