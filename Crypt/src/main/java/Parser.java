import java.io.IOException;
import java.net.URL;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;



public class Parser {

    private static Document getPage() throws IOException {
        String url="https://minfin.com.ua/currency/";
        Document page=Jsoup.parse(new URL(url),3000);
        return page;
    }

    public static void main(String[] args) throws IOException {
        System.out.println("КУРС К ГРИВНЕ    Средний курс в банках     НБУ        Черный Рынок");
    }
}
