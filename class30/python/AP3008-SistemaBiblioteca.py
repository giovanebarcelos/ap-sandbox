class Autor:
    def __init__(self, nome, nacionalidade):
        self.nome = nome
        self.nacionalidade = nacionalidade


class Livro:
    def __init__(self, titulo, autor):
        self.titulo = titulo
        self.autor = autor
        self.disponivel = True


class Usuario:
    def __init__(self, nome, matricula):
        self.nome = nome
        self.matricula = matricula


class Emprestimo:
    def __init__(self, livro, usuario, data):
        self.livro = livro
        self.usuario = usuario
        self.data_emprestimo = data
        livro.disponivel = False

    def devolver(self):
        self.livro.disponivel = True


autor = Autor("Machado de Assis", "Brasileira")
livro = Livro("Dom Casmurro", autor)
usuario = Usuario("Beto", "2026001")

emprestimo = Emprestimo(livro, usuario, "2026-08-11")
print(f"{livro.titulo} disponivel? {livro.disponivel}")

emprestimo.devolver()
print(f"{livro.titulo} disponivel apos devolucao? {livro.disponivel}")
