class ContaBancaria:
    def __init__(self):
        self.titular = ""
        self.saldo = 0.0

    def depositar(self, valor):
        self.saldo = self.saldo + valor

    def sacar(self, valor):
        if valor > self.saldo:
            return False
        self.saldo = self.saldo - valor
        return True

    def consultar_saldo(self):
        return self.saldo


conta1 = ContaBancaria()
conta1.titular = "Ana"
conta1.depositar(500.0)

conta2 = ContaBancaria()
conta2.titular = "Beto"
conta2.depositar(1200.0)

print(f"{conta1.titular}: {conta1.consultar_saldo()}")
print(f"{conta2.titular}: {conta2.consultar_saldo()}")

conta1.sacar(200.0)
print(f"{conta1.titular} apos saque: {conta1.consultar_saldo()}")
