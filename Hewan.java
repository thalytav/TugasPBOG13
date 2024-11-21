// Kelas Hewan yang merupakan subclass dari MakhlukHidup
class Hewan extends MakhlukHidup {
    private String kakiDepan;
    private String kakiBelakang;

    // Constructor untuk kelas Hewan
    public Hewan(String kakiDepan, String kakiBelakang) {
        this.kakiDepan = kakiDepan;
        this.kakiBelakang = kakiBelakang;
    }

    @Override
    public void berdiri() {
        System.out.println("Hewan berdiri dengan " + kakiDepan + " di depan dan " + kakiBelakang + " di belakang.");
    }

    @Override
    public void oksigen() {
        System.out.println("Hewan membutuhkan oksigen untuk bernapas.");
    }
}
