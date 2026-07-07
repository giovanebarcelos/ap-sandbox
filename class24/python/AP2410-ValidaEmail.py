# ValidaEmail — Aula 24
# Funcao que valida formato basico de email

def validar_email(email):
    return "@" in email and "." in email.split("@")[-1]

email = input("Digite seu email: ")
if validar_email(email):
    print(f"Email {email} eh VALIDO!")
else:
    print(f"Email {email} eh INVALIDO!")
