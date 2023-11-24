import java.io.*;
import java.net.*;

public class ReadCSV {
    public static void main(String[] args) {
        URI uri;
        URL url;

        try {
            uri = new URI("https://users.metropolia.fi/~jarkkov/temploki.csv");
            url = uri.toURL();
        }
        catch (URISyntaxException e) {
            System.out.println(e);
            return;
        }
        catch (MalformedURLException e) {
            System.out.println(e);
            return;
        }

        try {
            InputStream iStream = url.openStream();
            InputStreamReader iStreamReader = new InputStreamReader(iStream);
            BufferedReader reader = new BufferedReader(iStreamReader);

            boolean header = true;
            String line;
            String[] columnHeader = new String[0];
            String[] column = new String[0];
            
            double temp = 0;
            double tempCount = 0;

            while ((line = reader.readLine()) != null) {
                if (header) {
                    columnHeader = line.split(";");
                    header = false;
                }
                else {
                    column = line.split(";");

                    if (!column[0].substring(0, 5).equals("01.01")) {
                        break;
                    }

                    System.out.println(columnHeader[0] + ": " + column[0] + ", " + columnHeader[1] + ": " + column[1]);
                    
                    String columnClone = column[1];
                    temp += Double.parseDouble(columnClone.replace(",", "."));
                    tempCount++;
                }
            }

            System.out.println("Average temperature of 01.01.2023: " + String.format("%.1f", (temp / tempCount)));

            reader.close();
        }
        catch(MalformedURLException e) {
            System.out.println(e);
            return;
        }
        catch (IOException e) {
            System.out.println(e);
            return;
        }
    }
}
