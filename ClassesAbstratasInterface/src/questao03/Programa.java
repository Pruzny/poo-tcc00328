package questao03;

import java.util.ArrayList;
import questao02.*;

public class Programa {
    public static void executar() {
        ArrayList<CarbonFootprint> consumidores = new ArrayList<>();
        consumidores.add(new Carro("alcool", 340.5, 124.13, 0.3));
        consumidores.add(new Carro("eletrico", 165.4, 249.2, 0.5));
        consumidores.add(new Casa(3, false, 15, true));
        consumidores.add(new Escola(5, true, 23, true));
        consumidores.add(new Bicicleta(20));
        consumidores.add(new Bicicleta(24));
        
        for (CarbonFootprint item: consumidores) {
            System.out.print(item);
            System.out.printf("Carbon Footprint: %.2f\n\n", item.getCarbonFootprint());
        }
    }
}
