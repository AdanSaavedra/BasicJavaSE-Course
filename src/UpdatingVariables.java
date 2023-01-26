public class UpdatingVariables {
    public static void main(String[] args) {
        int salary = 1000;

        salary+= 200;
        System.out.println(salary);

        salary-= 50;
        System.out.println(salary);

        salary+=(30*2)-45;
        System.out.println(salary);

        String employeeName = "Adan Saavedra";
        employeeName+= " Salgado de la Vega";
        System.out.println(employeeName);

        employeeName= "Irene " +employeeName;
        System.out.println("Tu nombre es: " + employeeName);
    }
}
