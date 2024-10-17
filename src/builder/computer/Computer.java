package builder.computer;

public class Computer {
    String cpu, ram, storage, screen;

    protected Computer(Builder b){
        this.cpu = b.cpu;
        this.ram = b.ram;
        this.storage = b.storage;
        this.screen = b.screen;
    }
    public static class Builder{
        String cpu, ram, storage, screen;
        public Builder builderCPU(String cpu){
            this.cpu = cpu;
            return this;
        }
        public Builder builderRam(String ram){
            this.ram = ram;
            return this;
        }
        public Builder builderStorage(String storage){
            this.storage = storage;
            return this;
        }
        public Builder builderScreen(String screen){
            this.screen = screen;
            return this;
        }
        public Computer build(){
            return new Computer(Builder.this);
        }

    }
}
