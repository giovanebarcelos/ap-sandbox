import hashlib


class Usuario:
    def __init__(self, nome, senha):
        if not nome or not nome.strip():
            raise ValueError("nome invalido")
        if not senha or len(senha) < 8:
            raise ValueError("senha deve ter 8+ caracteres")
        self.nome = nome
        self.hash_senha = self._calcular_hash(senha)

    @staticmethod
    def _calcular_hash(texto):
        return hashlib.sha256(texto.encode()).hexdigest()

    def verificar_senha(self, senha_digitada):
        return self.hash_senha == self._calcular_hash(senha_digitada)


u1 = Usuario("Ana", "senhaForte123")
print(f"Usuario criado: {u1.nome}")
print(f"Senha correta? {u1.verificar_senha('senhaForte123')}")
print(f"Senha errada? {u1.verificar_senha('outraSenha')}")
