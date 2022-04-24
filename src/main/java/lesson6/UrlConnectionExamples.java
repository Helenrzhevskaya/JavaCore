package lesson6;

import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;

public class UrlConnectionExamples {
    public static void main(String[] args) throws IOException {
        URL url = new URL("https", "gb.ru", "/");

        InputStream in = url.openStream();
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(in));

        String line;
        while ((line = bufferedReader.readLine()) != null) {
            //System.out.println(line);

        }

        bufferedReader.close();

        URL url1 = new URL("https://restful-booker.herokupp.com/auth");
        HttpURLConnection httpURLConnection = (HttpURLConnection) url1.openConnection();


        httpURLConnection.setRequestProperty("Content-Type", "application/json");
        httpURLConnection.setRequestMethod("POST");
        httpURLConnection.setDoOutput(true);

        String requestBody = "{\n" +
                " \"username\" : \"admin\",\n" +
                " \"password\" : \"password123\"\n" +
                "}";

        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter
                (httpURLConnection.getOutputStream()));

        bufferedWriter.write(requestBody);

        BufferedReader bufferedReader1 = new BufferedReader(new InputStreamReader
                (httpURLConnection.getInputStream()));

        String temp;


        while ((temp = bufferedReader1.readLine()) != null) {
            System.out.println(temp);
        }






    }
}
