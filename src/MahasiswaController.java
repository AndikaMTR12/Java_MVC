public class MahasiswaController {

    private MahasiswaModel model;
    private MahasiswaView view;

    public MahasiswaController(MahasiswaModel model, MahasiswaView view) {
        this.model = model;
        this.view = view;
    }

    public void setMahasiswaNama(String nama) {
        model.setNama(nama);
    }

    public String getMahasiswaNama() {
        return model.getNama();
    }

    public void setMahasiswaNim(String nim) {
        model.setNim(nim);
    }

    public String getMahasiswaNim() {
        return model.getNim();
    }

    public void setMahasiswaProdi(String prodi) {
        model.setProdi(prodi);
    }

    public String getMahasiswaProdi() {
        return model.getProdi();
    }

    public void updateView() {
        view.printMahasiswaDetails(model.getNama(), model.getNim(), model.getProdi());
    }
}
