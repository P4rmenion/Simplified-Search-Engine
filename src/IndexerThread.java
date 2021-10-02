package backpack;

public class IndexerThread implements Runnable {
    Indexer bookkeeper;
    String mode;

    public IndexerThread(Indexer bookkeeper, String mode) {
        this.bookkeeper = bookkeeper;
        this.mode = mode;
    }

    public void run() {
        try {
            if (mode.equals("index"))
                bookkeeper.index();
            else if (mode.equals("idf")) {
                bookkeeper.calculateIDF();
            } else {
                bookkeeper.vectorize();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
