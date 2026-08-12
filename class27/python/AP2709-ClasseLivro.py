class Livro:
    def __init__(self):
        self.titulo = ""
        self.autor = ""
        self.numero_paginas = 0

    def exibir_ficha(self):
        print(f"{self.titulo} - {self.autor} ({self.numero_paginas} paginas)")


l1 = Livro()
l1.titulo = "Algoritmos e Programacao"
l1.autor = "Giovane Barcelos"
l1.numero_paginas = 320
l1.exibir_ficha()

l2 = Livro()
l2.titulo = "Clean Code"
l2.autor = "Robert C. Martin"
l2.numero_paginas = 464
l2.exibir_ficha()
