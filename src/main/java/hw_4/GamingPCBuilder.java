package hw_4;

public class GamingPCBuilder {
        private String cpu;
        private String gpu;
        private int ram;
        private int storage;
        private String cooling;

        public GamingPCBuilder setCpu(String cpu) {
            this.cpu = cpu;
            return this;
        }

        public GamingPCBuilder setGpu(String gpu) {
            this.gpu = gpu;
            return this;
        }

        public GamingPCBuilder setRam(int ram) {
            this.ram = ram;
            return this;
        }

        public GamingPCBuilder setStorage(int storage) {
            this.storage = storage;
            return this;
        }

        public GamingPCBuilder setCooling(String cooling) {
            this.cooling = cooling;
            return this;
        }

        public GamingPC build() {
            return new GamingPC(
                    cpu,
                    gpu,
                    ram,
                    storage,
                    cooling
            );
        }
}