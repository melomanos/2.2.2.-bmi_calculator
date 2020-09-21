public class BmiService {
    public float calculate(float weight, float height) {
        float bmi = weight / (height * height);
        bmi = Math.round(bmi);

        return bmi;
    }
}
