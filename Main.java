public class Main {

    public static void main(String[] args) {
        BmiService service = new BmiService();
        double weight = 38;
        double height = 1.51;
        double total = service.calculate(weight, height);
        System.out.printf("Индекс массы тела %.2f", total);
    }
}