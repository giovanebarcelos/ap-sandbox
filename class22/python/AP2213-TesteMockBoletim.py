"""Dublê de teste (mock) em Python com unittest.mock (biblioteca padrão).

processar_aluno() depende de uma função "notificar" (em produção, enviaria
um e-mail/SMS de verdade). No teste, substituímos essa dependência por um
Mock() para não enviar nada de verdade e ainda assim verificar a chamada.

Executar:
    python3 AP2213-TesteMockBoletim.py -v
"""
import unittest
from unittest.mock import Mock


def processar_aluno(nome, media, notificar):
    aprovado = media >= 6.0
    situacao = "APROVADO" if aprovado else "REPROVADO"
    notificar(nome, f"Resultado: {situacao} (média {media})")
    return aprovado


class TesteMockBoletim(unittest.TestCase):

    def test_aluno_com_media_seis_e_aprovado(self):
        servico_falso = Mock()  # dublê: nenhum e-mail real é enviado

        aprovado = processar_aluno("Ana", 7.5, servico_falso)

        self.assertTrue(aprovado)
        servico_falso.assert_called_once_with("Ana", "Resultado: APROVADO (média 7.5)")

    def test_aluno_com_media_menor_que_seis_e_reprovado(self):
        servico_falso = Mock()

        aprovado = processar_aluno("Bruno", 4.0, servico_falso)

        self.assertFalse(aprovado)
        servico_falso.assert_called_once_with("Bruno", "Resultado: REPROVADO (média 4.0)")


if __name__ == "__main__":
    unittest.main()
