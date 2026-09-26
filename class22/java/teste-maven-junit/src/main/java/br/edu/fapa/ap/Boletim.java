package br.edu.fapa.ap;

public class Boletim {

    private final ServicoNotificacao servico;

    public Boletim(ServicoNotificacao servico) {
        this.servico = servico;
    }

    public boolean processarAluno(String aluno, double media) {
        boolean aprovado = media >= 6.0;
        String situacao = aprovado ? "APROVADO" : "REPROVADO";
        servico.enviar(aluno, "Resultado: " + situacao + " (média " + media + ")");
        return aprovado;
    }
}
