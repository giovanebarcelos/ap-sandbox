class Aluno:
    def __init__(self, nome):
        self._nome = nome
        self._media = 0.0

    @property
    def nome(self):
        return self._nome

    @property
    def media(self):
        return self._media

    def set_media(self, media):
        if media < 0 or media > 10:
            return False
        self._media = media
        return True

    def esta_aprovado(self):
        return self._media >= 7.0


a1 = Aluno("Fernanda")
a1.set_media(8.5)
print(f"{a1.nome}: {a1.media} aprovado? {a1.esta_aprovado()}")

ok = a1.set_media(15.0)
print(f"Media invalida aceita? {ok}")
