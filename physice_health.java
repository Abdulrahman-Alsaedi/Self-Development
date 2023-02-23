import java.util.ArrayList;

public class physice_health extends Self_development implements Type {

    public physice_health(double weight, double height, int age) {
        super(weight, height, age);

    }

    public void calculateBMI() {
        double bmi = weight / (height * height);
        if (bmi < 15) {
            System.out.println("very bad less");
        } else if (bmi > 15 && bmi <= 18.5) {
            System.out.println("bad less");
        } else if (bmi > 18.5 && bmi <= 25) {
            System.out.println("normal");
        } else if (bmi > 25 && bmi < 35) {
            System.out.println("fat");
        } else {
            System.out.println("very fat");
        }
    }

    public String type() {
        return "      the physice_health is very good for Being physically active can improve your brain health, help manage weight, reduce the risk of disease, strengthen bones and muscles, and improve your ability to do everyday activities.        ";

    }

    @Override
    public String toString() {
        return super.toString();

    }

}