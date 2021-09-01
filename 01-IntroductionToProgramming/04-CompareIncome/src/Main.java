public class Main {
    public static void main(String[] args) {
        float dd = 18.2f;
        int mm = 11;

        float last_year_dd = dd*12;
        int last_year_mm = mm*12;

        float this_year_dd = last_year_dd*1.01f;
        float this_year_mm = last_year_mm*1.31f;

        boolean ddBigermm = this_year_dd > this_year_mm;

        if(ddBigermm) {
            System.out.println("The father has more income this year than the mother !!!");
        }
    }
}
