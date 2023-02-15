public class Main {
    public static void main(String[] args) {

        int shit = 100;
        int adds = 1100;
        int bonus;
        if (adds > 999) {
            bonus = adds / 100;
        } else {
            bonus = 0;
        }

        int itog = shit + adds + bonus;
        System.out.println("На Вашем счёте " + itog + " руб");
    }
}