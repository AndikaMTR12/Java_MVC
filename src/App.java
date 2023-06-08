public class App {
    public static void main(String[] args) throws Exception {
        MahasiswaModel model = retriveMahasiswaModelFromDatabase();

        MahasiswaView view = new MahasiswaView();

        MahasiswaController controller = new MahasiswaController(model, view);

        controller.updateView();

        controller.setMahasiswaNama("Andika");
        System.out.println("\n Mahasiswa Details Setelah Update");

        controller.updateView();
    }

    private static MahasiswaModel retriveMahasiswaModelFromDatabase() {
        MahasiswaModel Mahasiswa = new MahasiswaModel();
        Mahasiswa.setNama("ACO");
        Mahasiswa.setNim("F1G118011");
        Mahasiswa.setProdi("Ilmu Komputer");
        return Mahasiswa;
    }
}
