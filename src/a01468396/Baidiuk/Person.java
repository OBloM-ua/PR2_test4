package a01468396.Baidiuk;

import java.util.*;


public class Person implements Comparable<Person>{
    private String vorname;
    private String nachname;
    private int alter;
    private int groesse;
    private double gewicht;
    private Map<Fertigkeit, Integer> map = new HashMap<Fertigkeit, Integer>();
    ///MIN/MAX
    private static final int MIN_AGE = 10;
    private static final int MAX_AGE = 100;
    private static final int MIN_GROESSE = 100;
    private static final int MAX_GROESSE = 250;
    private static final int MIN_GEWICHT = 20;
    private static final int MAX_GEWICHT = 300;

    public Person(String vorname, String nachname, int alter, int groesse, double gewicht, Set<Fertigkeit> set) {
        this.vorname = vorname;
        this.nachname = nachname;
        setAlter(alter);
        setGroesse(groesse);
        setGewicht(gewicht);
        for (Fertigkeit f : set) map.put(f, 0);
    }

    public Person(String vorname, String nachname,  Set<Fertigkeit> set) {
        this.vorname = vorname;
        this.nachname = nachname;
        this.alter = 25;
        this.groesse = 170;
        this.gewicht = 70;
        for (Fertigkeit f : set) map.put(f, 0);
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

    public Map<Fertigkeit, Integer> getMap() {
        return map;
    }

    boolean aelterAls(Person p) {return this.alter>p.alter;}
    boolean groesserAls(Person p){return this.groesse>p.groesse;}
    boolean schwererAls(Person p){return this.gewicht>p.gewicht;}

    // shuller lehrer Fertigkeit
    boolean lernen(Person p, Fertigkeit f) {
        if (!p.getMap().containsKey(f)) return false;
        else if (this.map.containsKey(f)) return false;
        else {
            this.map.put(f, 0);
            return true;
        }
    }

    boolean trainieren(Fertigkeit f) {
        if (map.containsKey(f)) {
            map.put(f, map.get(f) + 1);
            return true;
        }else {
            System.out.println(nachname + " beherrscht " + f.toString() + " nicht!");
            return false;
        }
    }


    @Override
    public String toString() {
        return "Person{" +
                "vorname='" + vorname + '\'' +
                ", nachname='" + nachname + '\'' +
                ", alter=" + alter +
                ", groesse=" + groesse +
                ", gewicht=" + gewicht +
                ", map=" + map +
                '}';
    }

    @Override
    public int compareTo(Person o) {
        return this.getGroesse() - o.getGroesse();
    }
}
