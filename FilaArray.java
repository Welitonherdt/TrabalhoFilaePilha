public class FilaArray {
    private final int[] elementos;
    private int inicio;
    private int fim;
    private int quantidade;

    /**
     * Cria a fila com capacidade fixa.
     */
    public FilaArray(int capacidade) {
        if (capacidade <= 0) {
            throw new IllegalArgumentException("A capacidade da fila deve ser maior que zero.");
        }
        this.elementos = new int[capacidade];
        this.inicio = 0;
        this.fim = 0;
        this.quantidade = 0;
    }

    /**
     * Insere um novo elemento no fim da fila.
     * Retorna false caso a fila esteja cheia.
     */
    public boolean enqueue(int valor) {
        if (isFull()) {
            return false;
        }

        elementos[fim] = valor;
        fim = (fim + 1) % elementos.length;
        quantidade++;
        return true;
    }

    /**
     * Remove e retorna o primeiro elemento da fila.
     * Retorna null se a fila estiver vazia.
     */
    public Integer dequeue() {
        if (isEmpty()) {
            return null;
        }

        int valorRemovido = elementos[inicio];
        inicio = (inicio + 1) % elementos.length;
        quantidade--;
        return valorRemovido;
    }

    /**
     * Retorna o primeiro elemento sem remover.
     */
    public Integer front() {
        if (isEmpty()) {
            return null;
        }
        return elementos[inicio];
    }

    /**
     * Verifica se nao ha elementos na fila.
     */
    public boolean isEmpty() {
        return quantidade == 0;
    }

    /**
     * Verifica se a fila atingiu a capacidade maxima.
     */
    public boolean isFull() {
        return quantidade == elementos.length;
    }

    /**
     * Quantidade atual de elementos na fila.
     */
    public int size() {
        return quantidade;
    }

    /**
     * Limpa a fila reiniciando os ponteiros de controle.
     */
    public void clear() {
        inicio = 0;
        fim = 0;
        quantidade = 0;
    }

    /**
     * Exibe os elementos da fila do primeiro para o ultimo.
     */
    public void display() {
        if (isEmpty()) {
            System.out.println("Fila vazia.");
            return;
        }

        System.out.println("Elementos da fila (inicio -> fim):");
        for (int i = 0; i < quantidade; i++) {
            int indiceReal = (inicio + i) % elementos.length;
            System.out.println("[" + indiceReal + "] " + elementos[indiceReal]);
        }
    }
}
