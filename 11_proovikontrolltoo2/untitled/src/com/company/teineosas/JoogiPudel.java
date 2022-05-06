package untitled.src.com.company.teineosas;

public class JoogiPudel {
    double maht;
    String pudeliTuup;
    double mass;
    double taaraMaksumus;
    Jook jook;

    public JoogiPudel(double maht, String pudeliTuup, double mass, double taaraMaksumus) {
        this.maht = maht;
        this.pudeliTuup = pudeliTuup;
        this.mass = mass;
        this.taaraMaksumus = taaraMaksumus;
    }

    public double getMass() {
        if (jook == null) {
            return mass;
        } else {
            return mass + jook.erikaal;
        }
    }

    public double getKoguhind() {
        if (jook == null) {
            return taaraMaksumus;
        } else {
            return taaraMaksumus + jook.erikaal * jook.omahind;
        }
    }
}
