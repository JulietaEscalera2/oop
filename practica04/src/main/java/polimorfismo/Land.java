package polimorfismo;

public class Land extends Transport{

    private boolean hasMotor;

    public Land(String name, int price, boolean hasMotor) {
        super(name, price);
        this.hasMotor = hasMotor;
    }

    public boolean isHasMotor() {
        return hasMotor;
    }


    public String displayData() {
        return String.valueOf(isHasMotor());
    }
}
