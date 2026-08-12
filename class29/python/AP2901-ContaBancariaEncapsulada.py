class ContaBancaria:
    def __init__(self):
        self._saldo = 0.0

    @property
    def saldo(self):
        return self._saldo

    def depositar(self, valor):
        if valor <= 0:
            return False
        self._saldo = self._saldo + valor
        return True

    def sacar(self, valor):
        if valor <= 0 or valor > self._saldo:
            return False
        self._saldo = self._saldo - valor
        return True


conta = ContaBancaria()
conta.depositar(500.0)
print(f"Saldo: {conta.saldo}")

ok = conta.depositar(-100.0)
print(f"Deposito negativo aceito? {ok}")

conta.sacar(200.0)
print(f"Saldo apos saque: {conta.saldo}")
