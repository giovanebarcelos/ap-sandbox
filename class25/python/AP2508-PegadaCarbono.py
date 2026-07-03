# Estimativa simples de pegada de carbono (kg CO2/mes)
km_carro = 300
kwh = 200
co2 = km_carro * 0.12 + kwh * 0.09
print(f"Pegada estimada: {co2:.1f} kg CO2/mes")
