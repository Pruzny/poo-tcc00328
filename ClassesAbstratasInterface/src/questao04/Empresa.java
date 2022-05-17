package questao04;

import java.util.ArrayList;

public class Empresa {
    public static void calcularPagamento() {
        ArrayList<Funcionario> funcionarios = new ArrayList<>();
        funcionarios.add(new FuncionarioAssalariado("Marcos", 2500));
        funcionarios.add(new FuncionarioPorHora("Beto", 2000, 6));
        funcionarios.add(new FuncionarioComissionado("Sergio", (float) 0.6, 1400));
        funcionarios.add(new FuncionarioAssalariadoComissionado("Jeronimo", 2000, (float) 0.4, 900, (float) 1.1));

        for (Funcionario funcionario: funcionarios) {
            System.out.printf("%s: %.2f\n", funcionario.getNome(), funcionario.calcularPagamento());
            funcionario.mudarSemana();
        }
    }
}
