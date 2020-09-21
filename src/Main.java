public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        float weight = (float) 85;
        float height = (float) 1.8;
        float bmi = service.calculate(weight, height);

        System.out.println(bmi);
    }
}
