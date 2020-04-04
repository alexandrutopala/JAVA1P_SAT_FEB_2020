package builder;

public class Casa {
    private String adresa;
    private int suprafata;
    private int usi;
    private int etaje;

    public Casa(String adresa, int suprafata, int usi, int etaje) {
        this.adresa = adresa;
        this.suprafata = suprafata;
        this.usi = usi;
        this.etaje = etaje;
    }

    public Casa() {
    }

    public static class Builder {
        private Casa casa = new Casa();

        public Builder setUsi(int usi) {
            casa.usi = usi;

            return this;
        }

        public Builder setEtaje(int etaje) {
            casa.etaje = etaje;

            return this;
        }
        // builder.setUsi(2)
        //        .setEtaje(1)

        // builder.setUsi(2);
        // builder.setEtaje(1);

        public Builder setAdresa(String adresa) {
            casa.adresa = adresa;

            return this;
        }

        public Builder setSuprafata(int suprafata) {
            casa.suprafata = suprafata;

            return this;
        }

        public Casa build() {
            return casa;
        }
    }

    @Override
    public String toString() {
        return "Casa{" +
                "adresa='" + adresa + '\'' +
                ", suprafata=" + suprafata +
                ", usi=" + usi +
                ", etaje=" + etaje +
                '}';
    }
}
