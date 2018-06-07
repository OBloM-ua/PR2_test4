package a01468396.Baidiuk;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        ArrayList<Fertigkeit> arrOleh = new ArrayList<>();
        arrOleh.add(Fertigkeit.ENGLISCH);
        arrOleh.add(Fertigkeit.MATHEMATIK);

        ArrayList<Fertigkeit> arrYevgen = new ArrayList<>();
        arrYevgen.add(Fertigkeit.PROGRAMMIEREN);

//        Map<Fertigkeit, Integer> olehFertigkeit = new HashMap<>();
//        olehFertigkeit.put(Fertigkeit.ENGLISCH, 0);

        Person oleh = new Person("Oleh", "Baidiuk", 25, 184, 80, arrOleh);
        Person yevgen = new Person("Yevgen", "Baidiuk");
        yevgen.setFertigkeit(arrYevgen);

//        System.out.println(oleh);
        System.out.println(yevgen+"\n\n");

        Fertigkeit.PROGRAMMIEREN.getBonus(5);

        System.out.println(Fertigkeit.PROGRAMMIEREN.getBonus(5));







    }
}
