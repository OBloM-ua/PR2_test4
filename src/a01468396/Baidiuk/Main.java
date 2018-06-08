package a01468396.Baidiuk;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Set<Fertigkeit> lukeSkywalkerSkills = new HashSet<>();
        lukeSkywalkerSkills.add(Fertigkeit.SPORT);
        Person lukeSkywalker  = new Person("Luke", "Skywalker", 19, 183, 75, lukeSkywalkerSkills);

        Set<Fertigkeit> hanSoloSkills = new HashSet<>();
        hanSoloSkills.add(Fertigkeit.GEOGRAFIE);
        Person hanSolo  = new Person("Han", "Solo", 29, 185, 79, hanSoloSkills);

        Set<Fertigkeit> leiaOrganaSkills = new HashSet<>();
        leiaOrganaSkills.add(Fertigkeit.SPORT);
        leiaOrganaSkills.add(Fertigkeit.PROGRAMMIEREN);
        Person leiaOrgana  = new Expertin("Leia", "Organa", 19, 165, 55, leiaOrganaSkills, leiaOrganaSkills);


        leiaOrgana.trainieren(Fertigkeit.SPORT);
        hanSolo.trainieren(Fertigkeit.GEOGRAFIE);
        lukeSkywalker.trainieren(Fertigkeit.GEOGRAFIE);



        hanSolo.lernen(lukeSkywalker, Fertigkeit.SPORT);
        leiaOrgana.lernen(hanSolo, Fertigkeit.SPORT);

        leiaOrgana.trainieren(Fertigkeit.SPORT);
        lukeSkywalker.trainieren(Fertigkeit.GEOGRAFIE);

//        System.out.println(leiaOrgana);
//        System.out.println(hanSolo);
//        System.out.println(lukeSkywalker);

        Set<Person> personSetList = new HashSet<>();

//        personSetList.add(hanSolo);
//        personSetList.add(leiaOrgana);
        personSetList.add(lukeSkywalker);
        personSetList.add(lukeSkywalker);
        personSetList.add(lukeSkywalker);


        System.out.println(personSetList);





    }

    public static double avg(ArrayList<Person> p){
        double gewicht = 0;
        for (int i = 0; i < p.size(); i++) {
            gewicht += p.get(i).getGewicht();
        }
        return gewicht/p.size();
    }

}