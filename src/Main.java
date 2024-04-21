public class Main {

    public static void main(String[] args) {
        BmiService service = new BmiService();
        int weight_KG =98;
        double height_M = 1.87;
        double metersX2 = height_M * 2;
        int bmi = (int) service.calculate(weight_KG, metersX2);
        System.out.println(bmi);

    }








}

