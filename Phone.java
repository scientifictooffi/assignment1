public class Phone {//1
    private int number;
    private String model;
    private double weight;
    public Phone(int number, String model, double weight){//5
        this.number = number;
        this.model = model;
        this.weight = weight;
    }
    public void recieveCall(String name){//4
        System.out.print(name + " is ringing");

    }
    public void SetNumber(int number){//2
        this.number = number;
    }
    public void SetModel(String model){
        this.model = model;
    }
    public void SetWeight(double weight){
        this.weight = weight;
    }
    public String getModel(){
        return model;
    }
    public double getWeight(){
        return weight;
    }
    public int getNumber(){
        return number;
    }

    public Phone(int number, String model){//6
        this.number = number;
        this.model = model;
    }
    public Phone(){//7
    }
    public void recieveCall(String name, int number) {//9
        System.out.print("name of the caller:" + name + "number of the caller:" + number);
    }
    public void sendMessage(String length){//10
        System.out.print("This message was sended to " +length);

    }
}