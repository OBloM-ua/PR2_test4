package a01468396.Baidiuk;

import java.util.*;

public class Person implements Comparable<Person> {
    private String vorname;
    private String nachname;
    private int alter;
    private int groesse;
    private double gewicht;

    protected Map<Fertigkeit, Integer> map;

    private static final int MIN_AGE = 10;
    private static final int MAX_AGE = 100;
    private static final int MIN_GROESSE = 100;
    private static final int MAX_GROESSE = 250;
    private static final int MIN_GEWICHT = 20;
    private static final int MAX_GEWICHT = 300;

    public Person(String vorname, String nachname, int alter, int groesse, double gewicht, ArrayList<Fertigkeit> arr) {
        this.vorname = vorname;
        this.nachname = nachname;
        setAlter(alter);
        setGroesse(groesse);
        setGewicht(gewicht);
        setFertigkeit(arr);
    }

    public Person(String vorname, String nachname) {
        this.vorname = vorname;
        this.nachname = nachname;
        this.alter = 25;
        this.groesse = 170;
        this.gewicht = 70;
    }

    public String getVorname() {
        return vorname;
    }

    public void setVorname(String vorname) {
        this.vorname = vorname;
    }

    public String getNachname() {
        return nachname;
    }

    public void setNachname(String nachname) {
        this.nachname = nachname;
    }

    public int getAlter() {
        return alter;
    }

    public void setAlter(int alter) {
        if (alter < MIN_AGE || alter > MAX_AGE) throw new IllegalArgumentException("Alter ist falsh");
        this.alter = alter;
    }

    public int getGroesse() {
        return groesse;
    }

    public void setGroesse(int groesse) {
        if (groesse < MIN_GROESSE || groesse > MAX_GROESSE) throw new IllegalArgumentException("Groesse ist falsh");
        this.groesse = groesse;
    }

    public double getGewicht() {
        return gewicht;
    }

    public void setGewicht(double gewicht) {
        if (gewicht < MIN_GEWICHT || gewicht > MAX_GEWICHT) throw new IllegalArgumentException("Gewicht ist falsh");
        this.gewicht = gewicht;
    }

    public boolean aelterAls(Person p) {
        if (p.getAlter() < this.getAlter()) return true;
        else return false;
    }

    public boolean groesserAls(Person p) {
        if (p.getGroesse() < this.getGroesse()) return true;
        else return false;
    }

    public boolean schwererAls(Person p) {
        if (p.getGewicht() < this.getGewicht()) return true;
        else return false;
    }

    public Map<Fertigkeit, Integer> getFertigkeit() {
        return map;
    }

    public void setFertigkeit(ArrayList<Fertigkeit> arr) {
        map = new HashMap<Fertigkeit, Integer>();
        Fertigkeit[] f = arr.toArray(new Fertigkeit[arr.size()]);
        for (int i = 0; i < f.length; i++)
            map.put(f[i], 0);
    }

    public boolean lernen(Person p, Fertigkeit f) { //this учень, p учитель
        if (map.containsKey(f)) return false; //якщо this вже вміє це тоді false

        if (p.getFertigkeit().containsKey(f)) { //якщо учитель має цей скіл тоді true
            map.put(f, 0);
            return true;
        } else return false;

    }
    boolean trainieren(Fertigkeit f){
        if (map.containsKey(f)){
            map.put(f, map.get(f) + 1);
            return true;
        }else return false;
    }


    @Override
    public String toString() {
        return "Person [" + vorname + " " + nachname + ", alter=" + alter + ", groesse=" + groesse + "cm, gewicht="
                + gewicht + "kg, Fertigkeit=" + map + "]";
    }

    @Override
    public int compareTo(Person o) {
        // TODO Auto-generated method stub
        return 0;
    }

}
