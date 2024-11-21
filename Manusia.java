// Kelas Manusia yang merupakan subclass dari MakhlukHidup
class Manusia extends MakhlukHidup {
    private String jenisKaki;

    // Constructor untuk kelas Manusia
    public Manusia(String jenisKaki) {
        this.jenisKaki = jenisKaki;
    }

    @Override
    public void berdiri() {
        System.out.println("Manusia berdiri dengan " + jenisKaki);
    }

    @Override
    public void oksigen() {
        System.out.println("Manusia membutuhkan oksigen untuk bernapas.");
    }
}
