package hw_4;

public class GamingPC {
    private final String cpu;
    private final String gpu;
    private final int ram;
    private final int storage;
    private final String cooling;


    public GamingPC(String cpu, String gpu, int ram, int storage, String cooling) {
        this.cpu = cpu;
        this.gpu = gpu;
        this.ram = ram;
        this.storage = storage;
        this.cooling = cooling;
    }

    @Override
    public String toString() {
        return "GamingPC{" +
                "cpu='" + cpu + '\'' +
                ", gpu='" + gpu + '\'' +
                ", ram=" + ram +
                ", storage=" + storage +
                ", cooling='" + cooling + '\'' +
                '}';
    }
}