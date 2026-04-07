import java.util.Scanner;

/**
 * Classe principal com menu textual para testar Pilha e Fila.
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("==== Atividade: Pilha e Fila com Array (Java) ====");

        // Extra da atividade: permite definir tamanho do array no inicio.
        int capacidadePilha = lerInteiroPositivo(scanner, "Informe a capacidade da PILHA: ");
        int capacidadeFila = lerInteiroPositivo(scanner, "Informe a capacidade da FILA: ");

        PilhaArray pilha = new PilhaArray(capacidadePilha);
        FilaArray fila = new FilaArray(capacidadeFila);

        boolean executando = true;
        while (executando) {
            exibirMenuPrincipal();
            int opcao = lerInteiro(scanner, "Escolha uma opcao: ");

            switch (opcao) {
                case 1:
                    menuPilha(scanner, pilha);
                    break;
                case 2:
                    menuFila(scanner, fila);
                    break;
                case 3:
                    executando = false;
                    System.out.println("Encerrando o programa...");
                    break;
                default:
                    System.out.println("Opcao invalida. Tente novamente.");
            }
        }

        scanner.close();
    }

    private static void exibirMenuPrincipal() {
        System.out.println("==== MENU PRINCIPAL ====");
        System.out.println("1 - Testar PILHA");
        System.out.println("2 - Testar FILA");
        System.out.println("3 - Sair");
    }

    /**
     * Submenu da pilha com as operacoes obrigatorias e extras.
     */
    private static void menuPilha(Scanner scanner, PilhaArray pilha) {
        boolean voltar = false;
        while (!voltar) {
            System.out.println("---- MENU PILHA ----");
            System.out.println("1 - push (empilhar)");
            System.out.println("2 - pop (desempilhar)");
            System.out.println("3 - peek (topo)");
            System.out.println("4 - isEmpty (esta vazia?)");
            System.out.println("5 - isFull (esta cheia?)");
            System.out.println("6 - display (exibir pilha)");
            System.out.println("7 - quantidade de elementos");
            System.out.println("8 - limpar pilha");
            System.out.println("9 - voltar ao menu principal");

            int opcao = lerInteiro(scanner, "Escolha uma opcao da PILHA: ");

            switch (opcao) {
                case 1:
                    int valorPush = lerInteiro(scanner, "Valor para empilhar: ");
                    if (pilha.push(valorPush)) {
                        System.out.println("Valor " + valorPush + " empilhado com sucesso.");
                    } else {
                        System.out.println("Erro: a pilha esta cheia.");
                    }
                    break;
                case 2:
                    Integer valorPop = pilha.pop();
                    if (valorPop == null) {
                        System.out.println("Erro: a pilha esta vazia.");
                    } else {
                        System.out.println("Valor removido: " + valorPop);
                    }
                    break;
                case 3:
                    Integer topo = pilha.peek();
                    if (topo == null) {
                        System.out.println("A pilha esta vazia.");
                    } else {
                        System.out.println("Topo da pilha: " + topo);
                    }
                    break;
                case 4:
                    System.out.println(pilha.isEmpty() ? "A pilha esta vazia." : "A pilha NAO esta vazia.");
                    break;
                case 5:
                    System.out.println(pilha.isFull() ? "A pilha esta cheia." : "A pilha NAO esta cheia.");
                    break;
                case 6:
                    pilha.display();
                    break;
                case 7:
                    System.out.println("Quantidade de elementos na pilha: " + pilha.size());
                    break;
                case 8:
                    pilha.clear();
                    System.out.println("Pilha limpa com sucesso.");
                    break;
                case 9:
                    voltar = true;
                    break;
                default:
                    System.out.println("Opcao invalida. Tente novamente.");
            }
        }
    }

    /**
     * Submenu da fila com as operacoes obrigatorias e extras.
     */
    private static void menuFila(Scanner scanner, FilaArray fila) {
        boolean voltar = false;
        while (!voltar) {
            System.out.println("---- MENU FILA ----");
            System.out.println("1 - enqueue (inserir)");
            System.out.println("2 - dequeue (remover)");
            System.out.println("3 - front (primeiro elemento)");
            System.out.println("4 - isEmpty (esta vazia?)");
            System.out.println("5 - isFull (esta cheia?)");
            System.out.println("6 - display (exibir fila)");
            System.out.println("7 - quantidade de elementos");
            System.out.println("8 - limpar fila");
            System.out.println("9 - voltar ao menu principal");

            int opcao = lerInteiro(scanner, "Escolha uma opcao da FILA: ");

            switch (opcao) {
                case 1:
                    int valorEnqueue = lerInteiro(scanner, "Valor para inserir na fila: ");
                    if (fila.enqueue(valorEnqueue)) {
                        System.out.println("Valor " + valorEnqueue + " inserido com sucesso.");
                    } else {
                        System.out.println("Erro: a fila esta cheia.");
                    }
                    break;
                case 2:
                    Integer valorDequeue = fila.dequeue();
                    if (valorDequeue == null) {
                        System.out.println("Erro: a fila esta vazia.");
                    } else {
                        System.out.println("Valor removido: " + valorDequeue);
                    }
                    break;
                case 3:
                    Integer primeiro = fila.front();
                    if (primeiro == null) {
                        System.out.println("A fila esta vazia.");
                    } else {
                        System.out.println("Primeiro elemento da fila: " + primeiro);
                    }
                    break;
                case 4:
                    System.out.println(fila.isEmpty() ? "A fila esta vazia." : "A fila NAO esta vazia.");
                    break;
                case 5:
                    System.out.println(fila.isFull() ? "A fila esta cheia." : "A fila NAO esta cheia.");
                    break;
                case 6:
                    fila.display();
                    break;
                case 7:
                    System.out.println("Quantidade de elementos na fila: " + fila.size());
                    break;
                case 8:
                    fila.clear();
                    System.out.println("Fila limpa com sucesso.");
                    break;
                case 9:
                    voltar = true;
                    break;
                default:
                    System.out.println("Opcao invalida. Tente novamente.");
            }
        }
    }

    /**
     * Le um inteiro com tratamento de entrada invalida.
     */
    private static int lerInteiro(Scanner scanner, String mensagem) {
        while (true) {
            System.out.print(mensagem);
            String entrada = scanner.nextLine();

            try {
                return Integer.parseInt(entrada);
            } catch (NumberFormatException e) {
                System.out.println("Entrada invalida. Digite um numero inteiro.");
            }
        }
    }

    /**
     * Garante que a capacidade seja maior que zero.
     */
    private static int lerInteiroPositivo(Scanner scanner, String mensagem) {
        while (true) {
            int valor = lerInteiro(scanner, mensagem);
            if (valor > 0) {
                return valor;
            }
            System.out.println("Valor invalido. Informe um numero maior que zero.");
        }
    }
}
