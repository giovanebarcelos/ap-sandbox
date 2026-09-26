"""Teste unitário em Python usando unittest (biblioteca padrão, sem instalar nada).

Executar:
    python3 AP2212-TesteUnitarioCalculadora.py -v
"""
import unittest


def dobro(n):
    return n * 2


def eh_par(n):
    return n % 2 == 0


def fatorial(n):
    if n < 0:
        raise ValueError("fatorial não definido para negativos")
    resultado = 1
    for i in range(2, n + 1):
        resultado *= i
    return resultado


class TesteCalculadora(unittest.TestCase):

    def test_dobro_de_sete_e_quatorze(self):
        self.assertEqual(dobro(7), 14)

    def test_dobro_de_zero_e_zero(self):
        self.assertEqual(dobro(0), 0)

    def test_eh_par_reconhece_numero_par(self):
        self.assertTrue(eh_par(4))

    def test_eh_par_reconhece_numero_impar(self):
        self.assertFalse(eh_par(7))

    def test_fatorial_de_cinco_e_cento_e_vinte(self):
        self.assertEqual(fatorial(5), 120)

    def test_fatorial_de_zero_e_um(self):
        self.assertEqual(fatorial(0), 1)

    def test_fatorial_de_negativo_lanca_excecao(self):
        with self.assertRaises(ValueError):
            fatorial(-1)


if __name__ == "__main__":
    unittest.main()
