public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        float weight = 85F;
        float height = 1.8F;
        float bmi = service.calculate(weight, height);

        System.out.printf("Индекс массы тела %.2f", bmi);
    }
}
