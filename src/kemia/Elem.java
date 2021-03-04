package kemia;

public class Elem {
    private String ev;
    private String nev;
    private String vjel;
    private int rszam;
    private String felfedezo;

    public Elem(String sor) {
        String[] s=sor.split("\\;");
        this.ev = s[0];
        this.nev = s[1];
        this.vjel = s[2];
        this.rszam = Integer.parseInt(s[3]);
        this.felfedezo = s[4];
    }
    
    
}
