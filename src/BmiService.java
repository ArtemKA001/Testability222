public class BmiService {

    public int calculate(int weight_KG, double metersX2) {
        int result = (int) (weight_KG / metersX2);

        return result;

    }

}
