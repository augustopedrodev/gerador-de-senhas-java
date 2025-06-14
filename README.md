
# 🔐 Gerador de Senhas Seguras

Este é um projeto simples em Java que gera senhas seguras com base no tamanho especificado pelo usuário. O objetivo é fornecer uma ferramenta fácil de usar para gerar senhas aleatórias com uma combinação de letras, números e caracteres especiais.


## Estrutura do Projeto
Primeiramente foi feito um diagrama UML que representa os possíveis atributos e métodos da classe GeradorDeSenhas: (apenas um esboço)

![Diagrama UML](https://raw.githubusercontent.com/augustopedrodev/gerador-de-senhas-java/main/GerarSenhas.jpg)


- `Main.java`: Contém a lógica principal de interação com o usuário.
- `GeradorSenhas.java`: Responsável por gerar a senha aleatória de acordo com o tamanho especificado.

## Rodando localmente

**Clone o repositório:**

```bash
git clone https://github.com/augustopedrodev/gerador-senhas.git
cd gerador-senhas
```

**Compile o arquivo java**:
```bash
javac com/pedroaugusto/gerador/senhas/*.java
```

**Execute o programa:**
```bash
java com.pedroaugusto.gerador.senhas.Main
```

## Como funciona

- O usuário informa o tamanho desejado da senha (entre 6 e 20).
- O programa gera uma senha aleatória com letras, números e símbolos especiais.
- O usuário decide se quer gerar outra senha ou encerrar o programa.



## Aprendizados

Este projeto permitiu consolidar conhecimentos importantes de Java:

### Uso de package
- O código foi organizado em pacotes (com.pedroaugusto.gerador.senhas) para garantir modularidade, organização e evitar conflitos de nomes em projetos maiores.

### Programação Orientada a Objetos (POO)
- Separação da lógica em diferentes classes com responsabilidades distintas.

- Encapsulamento foi aplicado para manter a integridade e clareza do código.

### Uso de SecureRandom
- A classe SecureRandom foi utilizada para gerar senhas de forma mais segura e imprevisível que Random, essencial em contextos onde a segurança é uma prioridade.

### Uso de UML
- O diagrama de classes UML foi criado antes da implementação, auxiliando no planejamento do código.

- Isso facilitou a visualização das relações entre classes e responsabilidades.

- A UML também ajuda na documentação e comunicação técnica do projeto.


## Autor

**Pedro Augusto**  
🔗 [LinkedIn](https://www.linkedin.com/in/ramos-pedro-augusto/)  
💻 [GitHub](https://github.com/augustopedrodev)



