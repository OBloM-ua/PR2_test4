package a01468396.Baidiuk;

import java.util.ArrayList;
import java.util.Map;

public class ExpertIn extends Person {


    public ExpertIn(String vorname, String nachname, int alter, int groesse, double gewicht, ArrayList<Fertigkeit> arr) {
        super(vorname, nachname, alter, groesse, gewicht, arr);
    }

    @Override
    public boolean trainieren(Fertigkeit f) {
        if (map.containsKey(f)) {
            map.put(f, map.get(f) + 3);
            return true;
        } else return false;
    }
}
