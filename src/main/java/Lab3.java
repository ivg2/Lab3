import java.io.IOException;
import java.net.URL;
import java.util.Scanner;
public class Lab3 {

    public static String urlToString(final String url) {
        Scanner urlScanner;
        try {
            urlScanner = new Scanner(new URL(url).openStream(), "UTF-8");
        } catch (IOException e) {
            return "";
        }
        String contents = urlScanner.useDelimiter("\\A").next();
        urlScanner.close();
        return contents;
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        String text = urlToString("http://erdani.com/tdpl/hamlet.txt");
        text = " " + text + " ";
        int count = 0;
        while (text.indexOf(" ") != -1)
        {
            int beginning = text.indexOf(" ");
            int end = text.indexOf(" ", beginning + 1);
            String word = text.substring(beginning + 1, end);
            if(word.equalsIgnoreCase("prince")) {
                count++;
            }
            text = text.substring(end +1);
        }
        System.out.print(count);
    }

}
