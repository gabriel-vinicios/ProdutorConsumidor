/**
 * Classe que contém o buffer a ser compartilhado
 * entre o produto e o consumidor.
 */
public class Compartilhado {
    private int buffer;
    private int tamanhoBuffer;

    public Compartilhado() {
        this(0, 5);
    }

    public Compartilhado(int buffer, int tamanhoBuffer) {
    }
    // Gets e sets

    public void setBuffer(int buffer) {
        this.buffer = buffer;
    }

    public int getBuffer() {
        return buffer;
    }

    public void setTamanhoBuffer(int tamanhoBuffer) {
        this.tamanhoBuffer = tamanhoBuffer;
    }

    public int getTamanhoBuffer() {
        return tamanhoBuffer;
    }

    public synchronized void consumir() {
        setBuffer(getBuffer() - 1);
        if(buffer <= 0) {
            return;
        }
    }

    public synchronized void produzir() {
        setBuffer(getBuffer() + 1);
    }
}
