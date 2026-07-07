# CalculadoraJurosSimples — Aula 13
# Calcula juros simples: J = C * i * t

capital = float(input("Capital inicial: R$ "))
taxa = float(input("Taxa de juros mensal (%): "))
tempo = int(input("Tempo (meses): "))
juros = capital * (taxa / 100) * tempo
montante = capital + juros
print(f"Juros: R$ {juros:.2f}")
print(f"Montante final: R$ {montante:.2f}")
