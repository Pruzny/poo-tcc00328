public class Aula {
    public static void aula() {
        try {
            erro(3);
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Errou o tamanho");
        }
        catch (ArithmeticException e) {
            System.out.println("Errou a conta");
        }
        catch (Exception e) {
            System.out.println("Erro desconhecido");
        }
    }
    
    private static void erro(int num) {
        switch (num) {
            case 1:
                float[] a = new float[3];
                a[4] = 4;
                System.out.println(a[4]);
                break;
            case 2:
                float b = (float) (4/0);
                System.out.println(b);
                break;
            case 3:
                int c = Integer.parseInt("numero");
                System.out.println(c);
        }
    }
    
    private static void teste() throws MinhaException {
        throw new MinhaException();
    }
    
    private static void teste2() throws MinhaException{
        teste();
    }
}
