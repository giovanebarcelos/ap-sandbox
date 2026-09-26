// Dublê de teste (test double) em C++ sem framework externo: uma classe
// abstrata (interface) e uma implementação "fake" usada só no teste, que
// grava o que foi chamado em vez de enviar algo de verdade.
// Compilar e rodar:
//   g++ -std=c++17 AP2213-TesteDubleBoletim.cpp -o teste_boletim
//   ./teste_boletim
#include <cassert>
#include <iostream>
#include <sstream>
#include <string>

class ServicoNotificacao {
public:
    virtual void enviar(const std::string& destinatario, const std::string& mensagem) = 0;
    virtual ~ServicoNotificacao() = default;
};

// Dublê de teste: não envia nada de verdade, só guarda a última chamada.
class ServicoNotificacaoFake : public ServicoNotificacao {
public:
    std::string ultimoDestinatario;
    std::string ultimaMensagem;

    void enviar(const std::string& destinatario, const std::string& mensagem) override {
        ultimoDestinatario = destinatario;
        ultimaMensagem = mensagem;
    }
};

bool processarAluno(const std::string& nome, double media, ServicoNotificacao& servico) {
    bool aprovado = media >= 6.0;
    std::ostringstream msg;
    msg << "Resultado: " << (aprovado ? "APROVADO" : "REPROVADO") << " (media " << media << ")";
    servico.enviar(nome, msg.str());
    return aprovado;
}

int main() {
    ServicoNotificacaoFake servicoFalso;

    bool aprovado = processarAluno("Ana", 7.5, servicoFalso);

    assert(aprovado == true);
    assert(servicoFalso.ultimoDestinatario == "Ana");
    assert(servicoFalso.ultimaMensagem == "Resultado: APROVADO (media 7.5)");

    bool reprovado = processarAluno("Bruno", 4.0, servicoFalso);

    assert(reprovado == false);
    assert(servicoFalso.ultimaMensagem == "Resultado: REPROVADO (media 4)");

    std::cout << "Todos os testes passaram!" << std::endl;
    return 0;
}
