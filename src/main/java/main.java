import java.io.IOException;
import java.util.Scanner;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.jsoup.Jsoup;
import FilesWork.FilesWorker;

import static java.lang.System.*;

public class main {
    public static void main(String[] args) throws IOException {
        Document doc = Jsoup.connect("https://ru.investing.com/news/").get();
        Element newsList = doc.select("article.js-article-item img").first();

        FilesWorker.checkLastNews("new dollars");
    }
}
