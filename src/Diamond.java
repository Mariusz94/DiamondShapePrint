public class Diamond {
    public static String print(int n) {
        if (n < 0 || n % 2 == 0) return null;
        int aster = 1;
        int spa = (n / 2);
        char space = ' ';
        char asterisk = '*';
        StringBuilder diamond = new StringBuilder();

        for (int i = 0; i < (n / 2) + 1; i++, spa--, aster +=2) {

            for (int i1 = 0; i1 < spa; i1++) {
                diamond.append(space);
            }

            for (int i1 = 0; i1 < aster; i1++) {
                diamond.append(asterisk);
            }

            diamond.append("\n");

        }

        spa += 2;
        aster -= 4;

        for (int i = 0; i < (n / 2); i++, spa++, aster -=2) {

            for (int i1 = 0; i1 < spa; i1++) {
                diamond.append(space);
            }

            for (int i1 = 0; i1 < aster; i1++) {
                diamond.append(asterisk);
            }

            diamond.append("\n");

        }
        return diamond.toString();
    }
}