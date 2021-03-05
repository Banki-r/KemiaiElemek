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
        
        //3as feladat
        
        System.out.println("Elemek száma: "+elemek.size());
        
        //4es feladat
        
        int okori=0;
        for (int i = 0; i < elemek.size(); i++) {
            if (elemek.get(i).getEv().equals("Ókor")) {
                okori++;
            }
        }
        System.out.println("Felfedezések száma az ókorban: "+okori);
        //7es feladat
        int i=0;
        while(elemek.get(i).getEv().equals("Ókor")){
            i++;
        }
        int hossz=0;
        for (int j=i;j<elemek.size()-1;j++) {
            if(hossz<Integer.parseInt(elemek.get(j+1).getEv())-Integer.parseInt(elemek.get(j).getEv())){
                hossz=Integer.parseInt(elemek.get(j+1).getEv())-Integer.parseInt(elemek.get(j).getEv());
            }
        }
        System.out.println(hossz+" év volt a leghosszabb időszak két elem felfedezése között");
        //8as feladat
        System.out.println("8. feladat: Statisztika");
        int darab=0;
        for (int j=i;j<elemek.size()-1;j++) {
            if(elemek.get(j).getEv().equals(elemek.get(j+1).getEv())){
                darab++;
            }
            else{
                if(darab>=3){
                    System.out.println("\t"+Integer.parseInt(elemek.get(j).getEv())+" "+ (darab+1)+" db");
                }
                darab=0;
            }
        }
        
        
    }
    
}
