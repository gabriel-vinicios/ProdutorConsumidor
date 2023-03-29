public class Produtor implements Runnable {
    private Compartilhado x;
    private int tempo;

    public Produtor(Compartilhado x) {
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
                x.produzir();
            } catch (InterruptedException e) {
            }
            
        }
    }
}
