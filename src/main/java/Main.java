import ru.netology.JavaQaPackage.services.VocationMonthsService;

public class Main {
    public static void main(String[] args) {
        VocationMonthsService calculation = new VocationMonthsService();

        int months = calculation.calculate(100_000,3_000,20_000);
        System.out.println("Месяцев отдыха " + months);

    }
}
