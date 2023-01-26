public class NamingJava {
    public static void main(String[] args) {
        int cellphone = 33337777;
        int celPhone = 55566661;
        System.out.println(cellphone);
        System.out.println(celPhone);

        String $countryName = "Spain";
        String _bgColor = "Green";

        String bg_color = "Blue";
        String currency$ = "USD";

        int POSITION = -5;
        int MAX_WIDTH = 9999;
        int MIN_WIDTH = 1;

        String fullName = "Adan Saavedra";
        int sizeInCentimenters = 26;
        long nL = 12345678901234212L;

        double nD = 123.456;
        float nF = 123.456f;

        var salary = 1000;
        var pension = salary * 0.03;
        var totalSalary = salary - pension;
        System.out.println(salary);
        System.out.println(pension);
        System.out.println(totalSalary);

        var employeeName = "Anahi salgado";
        System.out.println("Employee: " + employeeName + " Salary: "+totalSalary);
    }
}
