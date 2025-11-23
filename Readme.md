## Sistema de Agenda Veterinária 🐾

Trabalho final de Programação Orientada a Objetos em Java, simulando a agenda de uma clínica veterinária.

### Funcionalidades

- Cadastro de consultas para **cachorros, gatos e coelhos**
- Registro de **nome, idade, raça** e **tipo de atendimento**
- Tipos de atendimento: **Banho, Tosa, Banho e Tosa, Consulta**
- Registro de **doença** para consultas
- Limite de **10 consultas** na agenda
- Validações de entrada (menus, nome, idade, raça e respostas s/n)

### Tecnologias

- Java 21  
- Maven  
- JUnit 5  
- Swing (`JOptionPane`)


## Repositorio para a aula de Orientação a Objetos da Quarta Fase de sistemas

# Guia de Contribuição

## 1) Clonar o repositório

```bash
# Usando HTTPS
git clone https://github.com/ViniciusDuranteBagio/OOPQuartaFase.git
```

Entre na pasta do projeto:

```bash
cd OOPQuartaFase
```

---

## 2) (Primeiro uso) Configurar seu usuário no Git

```bash
git config --global user.name "Seu Nome"
git config --global user.email "seu-email@exemplo.com"
```

---

## 3) Criar uma nova branch
O padrão de nomenclatura de branch para ser usado é o numero da aula e o nome e sobrenome do aluno.
Exemplo: aula-3-vinicius-durante-bagio

```bash
git checkout -b aula-x-nome-do-aluno-e-sobrenome
```

Verifique que está na branch correta:

```bash
git branch
```

---

## 4) Fazer alterações, adicionar e commitar

```bash
# Verifique os arquivos alterados
git status

# Adicione os arquivos
git add .

# Faça o commit
git commit -m "feat: sua descrição clara e objetiva"
```

Sugestões de prefixos para commits:
- `feat:` nova funcionalidade  
- `fix:` correção de bug  
- `docs:` documentação  
- `refactor:` refatoração de código  
- `test:` testes  
- `chore:` mudanças diversas (configurações, build, etc.)

---

## 5) Enviar a branch para o repositório remoto (push)

```bash
git push -u origin feature/minha-nova-funcionalidade
```

Nos próximos pushes para essa mesma branch, basta usar:

```bash
git push
```

## 6) Manter sua branch atualizada com a `main`

```bash
# Vá para a branch principal
git checkout main

# Atualize a main local
git pull origin main

# Volte para sua branch
git checkout feature/minha-nova-funcionalidade

# Rebase para aplicar suas mudanças no topo da main
git rebase main
```

Se houver conflitos:
```bash
# Resolva os arquivos manualmente
git add arquivo-resolvido
git rebase --continue
```

Depois envie sua branch atualizada:
```bash
git push --force-with-lease
```

---

## Fluxo resumido

```bash
git clone https://github.com/ViniciusDuranteBagio/OOPQuartaFase.git
cd OOPQuartaFase
git checkout -b feature/minha-nova-funcionalidade
# editar arquivos...
git add .
git commit -m "feat: descrição curta"
git push -u origin feature/minha-nova-funcionalidade
```

---

## ⚠️ Dicas de solução de problemas

| Situação                       | O que verificar                                                                 |
|-------------------------------|----------------------------------------------------------------------------------|
| Erro de autenticação (HTTPS)  | Gere um **Personal Access Token (PAT)** no GitHub e use no lugar da senha.       |
| Permissão negada (SSH)        | Adicione sua chave pública no GitHub e teste com `ssh -T git@github.com`.        |
| “Nada para enviar”            | Confirme se fez `git commit` antes de `git push`. Use `git log --oneline` para verificar. |
| Conflitos de merge/rebase     | Resolva os arquivos listados, depois `git add` e `git rebase --continue`.        |
