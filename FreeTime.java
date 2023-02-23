import java.util.ArrayList;
import java.util.Scanner;

public class FreeTime {

    ArrayList<String> documentaries = new ArrayList<String>();
    ArrayList<String> comedyMovies = new ArrayList<String>();

    public void adddocumentaries(String d) {
        documentaries.add(d);
    }

    public void addcomedyMovies(String c) {
        comedyMovies.add(c);
    }

    public String docveiw() {
        String s = "";
        for (int i = 0; i < documentaries.size(); i++) {
            s = s + documentaries.get(i) + " , ";
        }
        return s;
    }

    public String comveiw() {
        String s = "";
        for (int i = 0; i < comedyMovies.size(); i++) {
            s = s + comedyMovies.get(i) + " , ";
        }
        return s;
    }
}