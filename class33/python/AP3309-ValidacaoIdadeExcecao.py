class IdadeInvalidaError(Exception):
    pass


def validar_idade(idade):
    if idade < 0 or idade > 130:
        raise IdadeInvalidaError(f"idade fora da faixa aceita: {idade}")


try:
    validar_idade(-5)
except IdadeInvalidaError as e:
    print(f"Erro: {e}")

try:
    validar_idade(25)
    print("Idade 25 valida")
except IdadeInvalidaError as e:
    print(f"Erro: {e}")
