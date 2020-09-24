public class BmiService {
    public double calculate(double weight, double height) {
        double total = weight / (height * height);
    return total;
    }
}