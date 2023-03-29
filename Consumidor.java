public class Consumidor implements Runnable {
    private Compartilhado x;
    private int tempo;

    public Consumidor(Compartilhado x) {
        this.x = x;
    }
    // Gets e sets
    public int getTempo() {
        return tempo;
    }

    public void setTempo(int tempo) {
        this.tempo = tempo;
    }

    @Override
    public void run() {
        while (true) {
            try {
                Thread.sleep((int) (Math.random() * getTempo()));
                x.consumir();
            } catch (InterruptedException e) {
            }

        }
    }
}
