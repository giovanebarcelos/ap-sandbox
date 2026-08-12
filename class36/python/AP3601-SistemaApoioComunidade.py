import hashlib
from abc import ABC, abstractmethod


class Notificavel(ABC):
    @abstractmethod
    def notificar(self, mensagem):
        pass


class Pessoa(ABC):
    def __init__(self, nome):
        if not nome or not nome.strip():
            raise ValueError("nome invalido")
        self._nome = nome

    @property
    def nome(self):
        return self._nome

    @abstractmethod
    def descricao(self):
        pass


class Doador(Pessoa, Notificavel):
    def __init__(self, nome, valor_doado):
        super().__init__(nome)
        if valor_doado <= 0:
            raise ValueError("valor doado deve ser positivo")
        self._valor_doado = valor_doado

    def descricao(self):
        return f"{self.nome} doou R$ {self._valor_doado}"

    def notificar(self, mensagem):
        print(f"Email para {self.nome}: {mensagem}")


class Voluntario(Pessoa, Notificavel):
    def __init__(self, nome, horas_disponiveis):
        super().__init__(nome)
        if horas_disponiveis <= 0:
            raise ValueError("horas disponiveis deve ser positivo")
        self._horas_disponiveis = horas_disponiveis

    def descricao(self):
        return f"{self.nome} tem {self._horas_disponiveis}h disponiveis por semana"

    def notificar(self, mensagem):
        print(f"SMS para {self.nome}: {mensagem}")


class Usuario:
    def __init__(self, nome, senha):
        if not senha or len(senha) < 8:
            raise ValueError("senha deve ter 8+ caracteres")
        self.nome = nome
        self._hash_senha = self._calcular_hash(senha)

    @staticmethod
    def _calcular_hash(texto):
        return hashlib.sha256(texto.encode()).hexdigest()


class SistemaDeApoio:
    def __init__(self):
        self._pessoas = []

    def cadastrar_doador(self, nome, valor_texto):
        try:
            valor = float(valor_texto)
            doador = Doador(nome, valor)
            self._pessoas.append(doador)
            print(f"Doador cadastrado: {doador.descricao()}")
        except ValueError as e:
            if "could not convert" in str(e):
                print("[ERRO] Digite o valor usando apenas numeros.")
            else:
                print(f"[ERRO] {e}")

    def cadastrar_voluntario(self, nome, horas):
        voluntario = Voluntario(nome, horas)
        self._pessoas.append(voluntario)
        print(f"Voluntario cadastrado: {voluntario.descricao()}")

    def notificar_todos(self, mensagem):
        for pessoa in self._pessoas:
            if isinstance(pessoa, Notificavel):
                pessoa.notificar(mensagem)


sistema = SistemaDeApoio()

sistema.cadastrar_doador("Ana", "500.0")
sistema.cadastrar_voluntario("Beto", 10)
sistema.cadastrar_doador("Caio", "abc")

sistema.notificar_todos("Obrigado por participar!")

admin = Usuario("admin", "senhaForte123")
print("Usuario administrador criado com seguranca")
