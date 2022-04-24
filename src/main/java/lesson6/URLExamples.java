package lesson6;

import java.net.MalformedURLException;
import java.net.URL;

public class URLExamples {
    public static void main(String[] args) throws MalformedURLException { //на случай, если передала неправильный адрес
        URL url = new URL("https://smirnov:password@geekbrains.ru:80/courses?type=qa&level=super#1");
        //указываем хост и номер порта , если это адресная строка то чреез двоеточие, можно указать раздел,  к которому нужно подключится
        //перед хостом, можно указать логин и пароль

        System.out.println(url.getProtocol());
        System.out.println(url.getAuthority());
        System.out.println(url.getHost());
        System.out.println(url.getPort());
        System.out.println(url.getPath());
        System.out.println(url.getQuery()); //параметры

        URL url1 = new URL("https", "geekbrains.ru", 443, "/courses");

    }
}
