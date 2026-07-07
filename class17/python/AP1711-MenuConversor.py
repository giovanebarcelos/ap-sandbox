# MenuConversor — Aula 17
# Menu de conversão de unidades (temperatura e distância)

print("=== CONVERSOR ===\n1 - °C → °F\n2 - km → milhas\n3 - kg → libras")
op = int(input("Escolha: "))
if op == 1:
    c = float(input("°C: "))
    print(f"{c}°C = {c*9/5+32:.1f}°F")
elif op == 2:
    km = float(input("km: "))
    print(f"{km} km = {km*0.6214:.2f} milhas")
elif op == 3:
    kg = float(input("kg: "))
    print(f"{kg} kg = {kg*2.2046:.2f} libras")
else:
    print("Opção inválida!")
