package a01468396.Baidiuk;
public enum  Fertigkeit {

    MATHEMATIK(30), GEOGRAFIE(10), GESCHICHTE(),
    ENGLISCH(), FRANZOESISCH, LITERATUR,
    SPORT(10), PROGRAMMIEREN(40), JAPANISCH(40);

    public final int gw;

    private Fertigkeit() {
        gw = 20;
    }

    private Fertigkeit(int i) {
        gw = i;
    }

    public int getBonus(int stufe) {
        if(this.equals(Fertigkeit.PROGRAMMIEREN)) {
            return gw + stufe * 100;
        }
        return gw*stufe;
    }

    public String toString() {
        return name();
    }
}
