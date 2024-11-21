// Kelas Tumbuhan yang merupakan subclass dari MakhlukHidup
class Tumbuhan extends MakhlukHidup {
    private String bagian;

    // Constructor untuk kelas Tumbuhan
    public Tumbuhan(String bagian) {
        this.bagian = bagian;
    }

    @Override
    public void berdiri() {
        System.out.println("Tumbuhan tumbuh dan berdiri dengan bagian " + bagian + ".");
    }

    @Override
    public void oksigen() {
        System.out.println("Tumbuhan menghasilkan oksigen melalui fotosintesis.");
    }
}
