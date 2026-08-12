import hashlib


def validar_nome_usuario(nome_usuario):
    if not nome_usuario or not nome_usuario.strip():
        raise ValueError("nome invalido")
    if len(nome_usuario) > 100:
        raise ValueError("nome muito longo")


def calcular_hash_sha256(texto):
    return hashlib.sha256(texto.encode()).hexdigest()


validar_nome_usuario("Ana")
print("Nome valido aceito")

try:
    validar_nome_usuario("")
except ValueError as e:
    print(f"Erro: {e}")

print(f"Hash de 'minhaSenha123': {calcular_hash_sha256('minhaSenha123')}")
print(f"Hash de 'minhaSenha124': {calcular_hash_sha256('minhaSenha124')}")
