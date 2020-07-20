package polimorfismo;

public class Car extends Land{
    private boolean useGas;

    public Car(String name, int price, boolean hasMotor, boolean useGas) {
        super(name, price, hasMotor);
        this.useGas = useGas;
    }

    public boolean isUseGas() {
        return useGas;
    }


    @Override
    public String displayData() {
        return ", useGas = "+String.valueOf(isUseGas());
    }
}
