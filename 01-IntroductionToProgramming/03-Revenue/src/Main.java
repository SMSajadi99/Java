public class Main {
    public static void main(String[] args) {
        float dd = 18.5f;
        float mm = 9.6f;
        int Taxation = 3;

        float result_dd = 12*(dd-Taxation);
        float result_mm = 12*(mm-Taxation);

        System.out.println(result_dd);
        System.out.println(result_mm);
    }
}
