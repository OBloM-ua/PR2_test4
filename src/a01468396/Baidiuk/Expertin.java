package a01468396.Baidiuk;

import java.util.Arrays;
import java.util.Set;

public class Expertin extends Person {
    private static final Fertigkeit[] spezial = new Fertigkeit[3];

    public Expertin(String vorname, String nachname, int alter, int groesse, double gewicht, Set<Fertigkeit> set,  Set<Fertigkeit> spez) {
        super(vorname, nachname, alter, groesse, gewicht, set);
        int i = 0;
        for(Fertigkeit s : spez) spezial[i++] = s;
    }
    public Expertin(String vorname, String nachname, Set<Fertigkeit> set, Set<Fertigkeit> spez) {
        super(vorname, nachname, set);
        int i = 0;
        for(Fertigkeit s : spez) spezial[i++] = s;
    }


    @Override
    public boolean trainieren (Fertigkeit f) {
        if(Arrays.asList(spezial).contains(f)) {
            super.trainieren(f);
            super.trainieren(f);
        }
        super.trainieren(f);
        return true;
    }
}
