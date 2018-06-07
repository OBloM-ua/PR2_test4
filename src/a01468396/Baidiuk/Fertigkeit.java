package a01468396.Baidiuk;

public enum Fertigkeit {
    MATHEMATIK(30), GEOGRAFIE(10),
    GESCHICHTE(), ENGLISCH(),
    FRANZOESISCH, LITERATUR, SPORT(10),
    PROGRAMMIEREN(40), JAPANISCH(40);

    public final int gw; // Grundwert

    private Fertigkeit() { this.gw = 20; }

    private Fertigkeit(int gw) { this.gw = gw; }

    public int getBonus(int stufe) { return gw + stufe * 100; }

    @Override
    public  String toString() {
        return name();
    }
}
