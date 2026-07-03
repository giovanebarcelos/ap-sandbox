def senha_forte(senha):
    return len(senha) >= 8

print("12345678 forte?", senha_forte("12345678"))
print("123 forte?", senha_forte("123"))
