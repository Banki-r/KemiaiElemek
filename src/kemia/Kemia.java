package kemia;
// <>
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Kemia {

    public static void main(String[] args) throws IOException {
        List<String> beolvasott=Files.readAllLines(Paths.get("felfedezesek.csv"));
        
        ArrayList<Elem> elemek= new ArrayList<>();
        for (int i = 1; i < beolvasott.size(); i++) {
            elemek.add(new Elem(beolvasott.get(i)));
        }
        
    }
    
}
