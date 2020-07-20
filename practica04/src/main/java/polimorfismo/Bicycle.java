package polimorfismo;

public class Bicycle extends Land {

    private boolean exerciseBike;

    public Bicycle(String name, int price, boolean hasMotor, boolean exerciseBike) {
        super(name, price, hasMotor);
        this.exerciseBike = exerciseBike;
    }

    public boolean isExerciseBike() {
        return exerciseBike;
    }

    public String displayData(){
        return ", exercise = "+ String.valueOf(isExerciseBike());
    }
}
