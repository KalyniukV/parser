package org.example.util;

import org.example.exception.LoadDataException;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.nio.charset.StandardCharsets;
import java.util.Optional;

public class LoadDataHelper {

    public static String loadData(String urlStr) throws LoadDataException {
        URLConnection urlConnection = getURLConnection(urlStr)
                .orElseThrow(() -> new LoadDataException("Error load data by url: " + urlStr));

        return dataResult(urlConnection)
                .orElseThrow(() -> new LoadDataException("Error read data from url: " + urlStr));
    }

    private static Optional<URLConnection> getURLConnection(String urlStr) {
        URLConnection urlConnection = null;
        try {
            URL url = new URL(urlStr);
            urlConnection = url.openConnection();
            urlConnection.setRequestProperty("Cookie", "ABTestSeed=59; ipfrom=176.32.0.66; x-app-language=ru_UA; theme=DARK; _ga=GA1.1.559474088.1666289937; firstTheme=DARK; adformfrpid=3183155680372694324; referer=https://leon.bet/ru/bets; qtag_rfrr=null-null; _sp_srt_id.1e54=ce3b2695-0e76-4a8c-9e73-5810a4052429.1666289937.6.1666354486.1666351387.e16782e7-b9ab-4d75-94ec-051aa7a50b87; _ga_JZZNGY93CC=GS1.1.1666354471.6.1.1666354485.0.0.0");
        } catch (IOException e) {
            e.printStackTrace();
        }
        return Optional.ofNullable(urlConnection);
    }

    private static Optional<String> dataResult(URLConnection urlConnection) {
        StringBuilder result;
        try (BufferedReader in = new BufferedReader(
                new InputStreamReader(urlConnection.getInputStream(), StandardCharsets.UTF_8)
        )) {
            String inputLine;
            result = new StringBuilder();
            while ((inputLine = in.readLine()) != null) {
                result.append(inputLine);
            }
        } catch (IOException e) {
            return Optional.empty();
        }

        return Optional.of(result.toString());
    }
}
