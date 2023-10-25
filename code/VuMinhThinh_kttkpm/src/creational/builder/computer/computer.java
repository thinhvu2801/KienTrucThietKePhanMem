package creational.builder.computer;
//B1: khai báo lớp
public class computer {
    //B2: khai báo biến
    String CPU, RAM, Storage, Screen;

    //B4:
    public computer(Builder builder) {
        this.CPU = CPU;
        this.RAM = RAM;
        this.Storage = Storage;
        this.Screen = Screen;
    }
    @Override
    public String toString(){
        return "CPU" + this.CPU +"/nRAM" + this.RAM +"/nStorage" + this.Storage+ "/nScreen"+ this.Screen;
    }
    //B3: xây dựng thành phần
    public  static class Builder{
        String CPU, RAM, storage, screen;
        Builder addCPU(String cpu){
            this.CPU=cpu;
            return this;
        }
        Builder addRAM(String ram){
            this.RAM=ram;
            return this;
        }
        Builder addStorage(String Storage){
            this.storage=Storage;
            return this;
        }
        Builder addScreen(String Screen){
            this.screen=Screen;
            return this;
        }
        public computer Build(){
            return new computer(this);
        }
    }
}
