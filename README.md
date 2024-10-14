# Lista de Tarefas em Java

## Descrição

Este é um projeto simples de lista de tarefas desenvolvido em **Java** para praticar habilidades de manipulação de dados, controle de fluxo e interação com o usuário por meio do terminal. Ele permite adicionar, visualizar e excluir tarefas de uma lista, utilizando a classe `ArrayList` para armazenar os dados.

## Funcionalidades

- Adicionar tarefas à lista.
- Visualizar todas as tarefas adicionadas.
- Excluir tarefas da lista com base em seu número.
- Sistema de menu interativo no terminal.

## Tecnologias Utilizadas

- **Java SE 8 ou superior**: Linguagem principal do projeto.
- **ArrayList**: Para armazenar e gerenciar as tarefas.
- **Scanner**: Para capturar a entrada do usuário.
- **Tratamento de Exceções**: Para lidar com entradas inválidas do usuário.

## Requisitos

- **Java 8 ou superior**: Certifique-se de que o JDK está instalado e configurado no seu ambiente.
- **Git**: Para clonar e versionar o projeto (opcional).

## Como Executar o Projeto

1. **Clone o repositório:**

   ```bash
   git clone https://github.com/seu-usuario/lista-de-tarefas-java.git
   ```

2. **Entre no diretório do projeto:**

   ```bash
   cd lista-de-tarefas-java
   ```

3. **Compile o projeto:**

   No terminal, execute o seguinte comando para compilar o código:

   ```bash
   javac -d . src/com/marcelo/estudojava/listadetarefas/ListaDeTarefas.java
   ```

4. **Execute o projeto:**

   Após a compilação, execute o seguinte comando para rodar o programa:

   ```bash
   java com.marcelo.estudojava.listadetarefas.ListaDeTarefas
   ```

## Estrutura do Projeto

```
lista-de-tarefas-java/
├── src/
│   └── com/
│       └── marcelo/
│           └── estudojava/
│               └── listadetarefas/
│                   └── ListaDeTarefas.java
└── README.md
```

- **src/com/marcelo/estudojava/listadetarefas/ListaDeTarefas.java**: Contém a lógica do programa.

## Uso

Ao executar o programa, o usuário verá um menu com as seguintes opções:

1. **Adicionar tarefa**: O usuário pode inserir uma tarefa que será adicionada à lista.
2. **Ver tarefas**: Exibe todas as tarefas da lista, numeradas.
3. **Excluir tarefa**: O usuário pode remover uma tarefa da lista informando o número da tarefa.
4. **Sair**: Encerra o programa.

Exemplo de uso:

```plaintext
--- Lista de Tarefas ---
Escolha uma opção:
1. Adicionar tarefa
2. Ver tarefas
3. Excluir tarefa
4. Sair
```

## Tratamento de Exceções

O programa lida com possíveis entradas inválidas, como inserir caracteres em vez de números ao escolher uma opção no menu. Caso um erro ocorra, uma mensagem de erro será exibida e o programa solicitará uma nova entrada.

## Contribuições

Contribuições são bem-vindas! Sinta-se à vontade para fazer um fork deste repositório e enviar um pull request com melhorias ou novas funcionalidades.

1. Faça o fork do projeto.
2. Crie um branch para sua funcionalidade (`git checkout -b feature/nova-funcionalidade`).
3. Faça o commit das suas alterações (`git commit -m 'Adiciona nova funcionalidade'`).
4. Envie o código para o repositório (`git push origin feature/nova-funcionalidade`).
5. Abra um pull request no GitHub.

