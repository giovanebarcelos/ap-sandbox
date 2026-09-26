package br.edu.fapa.ap;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.verify;

@ExtendWith(MockitoExtension.class)
class BoletimTest {

    @Mock
    private ServicoNotificacao servico; // dublê: nenhum e-mail/SMS real é enviado

    @Test
    void alunoComMediaSeisEAprovado() {
        Boletim boletim = new Boletim(servico);

        boolean aprovado = boletim.processarAluno("Ana", 7.5);

        assertTrue(aprovado);
        verify(servico).enviar("Ana", "Resultado: APROVADO (média 7.5)");
    }

    @Test
    void alunoComMediaMenorQueSeisEReprovado() {
        Boletim boletim = new Boletim(servico);

        boolean aprovado = boletim.processarAluno("Bruno", 4.0);

        assertFalse(aprovado);
        verify(servico).enviar("Bruno", "Resultado: REPROVADO (média 4.0)");
    }
}
