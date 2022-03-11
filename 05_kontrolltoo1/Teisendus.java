public class Teisendus {
    public static String kahends(int kumnends) {
        int rem;
        String kahend = "";
        char[] kahendchars = {'0','1'};
        while(kumnends > 0) {
            rem = kumnends % 2;
            kahend = kahendchars[rem] + kahend;
            kumnends = kumnends / 2;
        }
        return kahend;
    }


    public static String kaheksands(int kumnends) {
        int rem;
        String kaheksand = "";
        char[] kaheksandchars = {'0','1','2','3','4','5','6','7'};
        while(kumnends > 0) {
            rem = kumnends % 8;
            kaheksand = kaheksandchars[rem] + kaheksand;
            kumnends = kumnends / 8;
        }
        return kaheksand;
    }


    public static String kuueteistkums(int kumnends) {
        int rem;
        String kuueteist = "";
        char[] kuueteistchars = {'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
        while(kumnends > 0) {
            rem = kumnends % 16;
            kuueteist = kuueteistchars[rem] + kuueteist;
            kumnends = kumnends / 16;
        }
        return kuueteist;
    }


    public static int kahendkumnends(int kahend) {
        int kumnend = 0;
        int n = 0;
        while(true) {
            if(kahend == 0){
                break;
            } else {
                int rem = kahend % 10;
                kumnend = (int) (rem*Math.pow(2, n) + kumnend);
                kahend = kahend / 10;
                n++;
            }
        }
        return kumnend;
    }


    public static int kaheksandkumnends(int kaheksand) {
        int kumnend = 0;
        int n = 0;
        while(true) {
            if(kaheksand == 0){
                break;
            } else {
                int rem = kaheksand % 10;
                kumnend = (int) (rem*Math.pow(8, n) + kumnend);
                kaheksand = kaheksand / 10;
                n++;
            }
        }
        return kumnend;
    }


    public static int kuueteistkumnend(String kuueteist) {
        String andmed = "0123456789ABCDEF";
        kuueteist = kuueteist.toUpperCase();
        int kumnend = 0;
        for (int i = 0; i < kuueteist.length(); i++) {
            char c = kuueteist.charAt(i);
            int d = andmed.indexOf(c);
            kumnend = 16 * kumnend + d;
        }
        return kumnend;
    }


    public static String kahendkaheksands(int kahend) {
        int kahendnr = Integer.parseInt(String.valueOf(kahend), 2);
        return Integer.toOctalString(kahendnr);
    }

    public static String kahendkuueteists(int kahend) {
        int kahendnr = Integer.parseInt(String.valueOf(kahend), 2);
        return Integer.toHexString(kahendnr);
    }


    public static String kaheksandkahends(int kaheksand) {
        int kaheksandnr = Integer.parseInt(String.valueOf(kaheksand), 8);
        return Integer.toBinaryString(kaheksandnr);
    }

    public static String kaheksandkuueteists(int kaheksand) {
        int kaheksandnr = Integer.parseInt(String.valueOf(kaheksand), 8);
        return Integer.toHexString(kaheksandnr);
    }


    public static String kuueteistkahends(String kuueteist) {
        int kuueteistnr = Integer.parseInt(kuueteist, 16);
        return Integer.toBinaryString(kuueteistnr);
    }

    public static String kuueteistkaheksands(String kuueteist) {
        int kuueteistnr = Integer.parseInt(kuueteist, 16);
        return Integer.toOctalString(kuueteistnr);
    }


    public static void main(String[] args) {
        System.out.println(kahends(1000));
        System.out.println(kaheksands(10));
        System.out.println(kuueteistkums(36));

        System.out.println(kahendkumnends(1101010));
        System.out.println(kaheksandkumnends(175));
        System.out.println(kuueteistkumnend("20b"));

        System.out.println(kahendkaheksands(1001010110));
        System.out.println(kahendkuueteists(1001010110));

        System.out.println(kaheksandkahends(704));
        System.out.println(kaheksandkuueteists(704));

        System.out.println(kuueteistkahends("171"));
        System.out.println(kuueteistkaheksands("171"));
    }
}
