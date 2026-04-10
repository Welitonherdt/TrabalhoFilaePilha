# Atividade Pilha e Fila com Array (Java)

## Nome do aluno
Weliton Herdt Sebastião

## Descricao do projeto
Este projeto implementa duas estruturas de dados classicas em Java, sem uso de classes prontas da linguagem:
- Pilha (LIFO)
- Fila (FIFO)

As duas estruturas foram construidas manualmente com arrays, com menu interativo no console para testar todas as operacoes.

## Explicacao breve: Pilha e Fila
- Pilha (LIFO: Last In, First Out): o ultimo elemento inserido e o primeiro a sair.
- Fila (FIFO: First In, First Out): o primeiro elemento inserido e o primeiro a sair.

No projeto:
- A pilha usa a variavel `topo` para controlar a posicao do ultimo elemento.
- A fila usa os controles `inicio`, `fim` e `quantidade` em array circular para controlar entrada e saida.

## Estrutura dos arquivos
- `Main.java` -> menu principal e interacao com o usuario
- `PilhaArray.java` -> implementacao da pilha com array
- `FilaArray.java` -> implementacao da fila com array

## Funcionalidades implementadas
### Pilha
- `push()`
- `pop()`
- `peek()`
- `isEmpty()`
- `isFull()`
- `display()`

### Fila
- `enqueue()`
- `dequeue()`
- `front()`
- `isEmpty()`
- `isFull()`
- `display()`

### Extras implementados
- Definicao da capacidade da pilha e da fila no inicio do programa
- Opcao de limpar pilha/fila
- Exibicao da quantidade atual de elementos
- Validacao de entradas no menu

## Como compilar e executar
No terminal, dentro da pasta do projeto, execute:

```bash
javac Main.java PilhaArray.java FilaArray.java
java Main
```



## Link do video no YouTube
https://youtu.be/qkvYU4vk6xw