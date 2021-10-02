package backpack;

public class CrawlerThread implements Runnable {
    Crawler spider;

    public CrawlerThread(Crawler spider) {
        this.spider = spider;
    }

    public void run() {
        spider.crawl();
    }
}
