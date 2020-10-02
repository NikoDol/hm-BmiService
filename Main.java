public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        int weight = 85;
        // Рост указываем в сантиметрах.
        int height = 1_75;
        int index = service.calculate(weight, height);
        System.out.println(index);
    }
}