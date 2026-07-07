# EscopoVariaveis — Aula 09
# Demonstra escopo local vs global

PI = 3.14159  # constante por convenção
print(f"Constante PI = {PI} (acessível em todo o programa)")
def calcular_area(raio):
    area = PI * raio ** 2  # area é variável local
    return area
raio = float(input("Digite o raio: "))
resultado = calcular_area(raio)
print(f"Área do círculo: {resultado:.2f}")
