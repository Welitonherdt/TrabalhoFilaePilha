public class PilhaArray {
    private final int[] elementos;
    private int topo;

    /**
     * Cria a pilha com capacidade fixa.
     */
    public PilhaArray(int capacidade) {
        if (capacidade <= 0) {
            throw new IllegalArgumentException("A capacidade da pilha deve ser maior que zero.");
        }
        this.elementos = new int[capacidade];
        this.topo = -1;
    }

    /**
     * Insere um elemento no topo da pilha.
     * Retorna false caso a pilha esteja cheia.
     */
    public boolean push(int valor) {
        if (isFull()) {
            return false;
        }

        topo++;
        elementos[topo] = valor;
        return true;
    }

    /**
     * Remove e retorna o elemento do topo.
     * Retorna null se a pilha estiver vazia.
     */
    public Integer pop() {
        if (isEmpty()) {
            return null;
        }

        int valorRemovido = elementos[topo];
        topo--;
        return valorRemovido;
    }

    /**
     * Retorna o elemento atual do topo sem remover.
     */
    public Integer peek() {
        if (isEmpty()) {
            return null;
        }
        return elementos[topo];
    }

    /**
     * Verifica se nao ha elementos armazenados.
     */
    public boolean isEmpty() {
        return topo == -1;
    }

    /**
     * Verifica se o topo chegou ao ultimo indice do array.
     */
    public boolean isFull() {
        return topo == elementos.length - 1;
    }

    /**
     * Quantidade atual de elementos na pilha.
     */
    public int size() {
        return topo + 1;
    }

    /**
     * Limpa a pilha reiniciando o topo.
     */
    public void clear() {
        topo = -1;
    }

    /**
     * Exibe os elementos da pilha do topo para a base.
     */
    public void display() {
        if (isEmpty()) {
            System.out.println("Pilha vazia.");
            return;
        }

        System.out.println("Elementos da pilha (topo -> base):");
        for (int i = topo; i >= 0; i--) {
            System.out.println("[" + i + "] " + elementos[i]);
        }
    }
}
