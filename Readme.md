## Repositorio para a aula de Orientação a Objetos da Quarta Fase de sistemas

# Prova 1

## 1) Como criar sua branch
- Entre nesse link: https://github.com/ViniciusDuranteBagio/OOPQuartaFase/branches
- Aperte no botão "New Branch" para criar um nova branch
- Deixe o nome da branch como "prova-seu-nome", e escolha para ser em cima da branch Prova no Source
- Vá no terminal do intelij e rode os seguintes comandos:
- git fetch
- git checkout prova-seu-nome (aqui é o nome da branch criada anteriormente)
- git branch -> Verifique se está na branch que você criou agora


# Questões da prova
## Questão 1 (1,00)
Crie uma classe chamada Carro com os atributos marca e ano. Depois, na classe main, crie um objeto dessa classe e atribua valores aos atributos. Crie um método ExibirDados e mostre esses valores para o usuario.
## Questão 2 (1,00)
Crie uma classe chamada Prova.Pessoa com os atributos nome e idade, e um método apresentar() que imprime:
   “Olá, meu nome é <nome> e tenho <idade> anos.”
## Questão 3 (1,00)
Crie uma classe Prova.Produto com os atributos nome e preco. No classe main, crie dois objetos dessa classe e imprima os valores de cada um.
## Questão 4 (1,00)
Crie uma classe ContaBancaria com os atributos titular e saldo. Adicione métodos depositar(double valor) e sacar(double valor) que atualizam o saldo.
O saldo nunca pode ficar negativo.
## Questão 5 (1,00)
Crie uma classe Animal com os atributos nome e idade, e um método fazerSom(). Na classe main, crie um objeto Animal e chame o método para fazer som, mostrando o nome a idade do animal, a frase "fez algum som".
## Questão 6 (1,00)
- Crie uma classe Prova.Pessoa, com os atributos nome e idade, com um método apresentar() que vai falar "Olá sou, {nome}, e minha tenho {idade} anos".
- Crie uma classe Aluno que herda de Prova.Pessoa. Adicione o atributo matricula. Sobrescreva o método apresentar() para imprimir também a matrícula.
## Questão 7 (1,00)
- Crie uma classe Cachorro que vai herdar de Animal, e Sobrescreva o metodo FazerSom() para o som de um Cachorro latindo.
- Crie uma classe Gato que vai herdar de Animal, e Sobrescreva o metodo FazerSom() para o som de um Gato miando.
- Na Main crie um objeto de Cachorro e um de Gato e faça eles fazerem o som.
## Questão 8 (1,00)
- Crie uma classe Professor que herda de Prova.Pessoa.
- Adicione o atributo disciplina.
- Sobrescreva o método apresentar() para imprimir também a disciplina.
## Questão 9 (2)
- Crie uma classe Funcionario com atributos nome e salario.
- Crie um método calcularBonus() que retorna 10% do salário.
- Crie uma subclasse Gerente que sobrescreve esse método para retornar 20% do salário.


## 3) Ao finalizar a prova rode os seguintes comandos
- git add .
- git commit -m "finalizada prova {Nome do Aluno}"
- git push