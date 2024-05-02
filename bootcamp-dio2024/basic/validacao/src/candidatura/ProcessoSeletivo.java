package candidatura;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo {
    public static void main(String[] args) {
        String [] candidatos = {"FELIPE", "MARCIA", "JULIA", "PAULO", "AUGUSTO" };

        for(String candidato: candidatos) {
            entrandoEmContato(candidato);
        }
    }

    static void entrandoEmContato(String candidato) {
        int tentativasRealizadas = 1;
        boolean continuarTentando = true;
        boolean atendeu=false;

        do {
            atendeu = atender();
            continuarTentando = !atendeu;

            if (continuarTentando)
                tentativasRealizadas++;
            else
                System.out.println("CONTATO REALIZADO COM SUCESSO");

        } while (continuarTentando && tentativasRealizadas < 3);

        if (atendeu)
            System.out.println("("+ tentativasRealizadas + ")" + " CONSEGUIMOS CONTATO COM " + candidato);
        else
            System.out.println("("+ tentativasRealizadas + ")" + " NÃO CONSEGUIMOS CONTATO COM " + candidato);
    }

    static boolean atender() {
        return new Random().nextInt(3)==1;
    }

    static void selecaoCandidatos() {
        String [] candidatos = {"FELIPE", "MARCIA", "JULIA", "PAULO", "AUGUSTO", "MONICA", "FABRICIO", "MIRELA", "DANIELA", "JORGE"};

        int candidatosSelecionados = 0;
        int candidatoAtual = 0;
        double salarioBase = 2000;

        while (candidatosSelecionados < 5 && candidatoAtual < candidatos.length) {
            String candidato = candidatos[candidatoAtual];
            double salarioPretendido = valorPretendido();

            // System.out.println("O candidato " + candidato + " solicitou o valor " + salarioPretendido);
            if (salarioBase >= salarioPretendido) {
                // System.out.println("candidato " + candidato + " selecionado");
                candidatosSelecionados++;
            }

            candidatoAtual++;
        }
    }

    static void imprimirSelecionados() {
        String [] candidatos = {"FELIPE", "MARCIA", "JULIA", "PAULO", "AUGUSTO" };

        for (int i = 0; i < candidatos.length; i++) {
            System.out.println("Candidato selecionado: " + candidatos[i]);
        }
    }

    static double valorPretendido() {
        return ThreadLocalRandom.current().nextDouble(1800, 2200);
    }

    static void analisarCandidato(double salarioPretendido) {
        double salarioBase = 2000.0;
        if (salarioBase > salarioPretendido) {
            System.out.println("LIGAR PARA O CANDIDATO");
        } else if (salarioBase == salarioPretendido) {
            System.out.println("LIGAR PARA O CANDIDATO COM CONTRA PROPOSTA");
        } else {
            System.out.println("AGUARDANDO O RESULTADO DOS DEMAIS CANDIDATOS");
        }
    }
}
