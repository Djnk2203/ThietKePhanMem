package builder.computer;

public class MainComputer {
    public static void main(String[] args) {
        Computer c = new Computer.Builder()
                .builderCPU("Intel Arrow")
                .builderRam("64GB")
                .builderStorage("2TB SSD Samsung Revo")
                .builderScreen("LG 24 inch 4K")
                .build();

    }
}
