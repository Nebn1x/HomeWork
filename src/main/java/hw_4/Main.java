package hw_4;

public class Main {

    public static void main(String[] args) {

        GamingPC pc1 = new GamingPCBuilder()
                .setCpu("Ryzen 7")
                .setGpu("RTX 4080")
                .setRam(32)
                .setStorage(2000)
                .setCooling("Water Cooling")
                .build();

        GamingPC pc2 = new GamingPCBuilder()
                .setCpu("Intel i5")
                .setGpu("RTX 4060")
                .setRam(16)
                .setStorage(1000)
                .setCooling("Air Cooling")
                .build();

        System.out.println(pc1);
        System.out.println(pc2);
    }
}
