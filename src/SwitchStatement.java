public class SwitchStatement {
    public static void main(String[] args) {

        String colorModeSelected = "Dark";

        switch (colorModeSelected){
            case "Light":
                System.out.println("Seleccionaste Light Mode");
                break;
            case  "Night":
                System.out.println("Seleccionaste Night Mode");
                break;
            case "Blue Dark":
                System.out.println("Seleccionaste Blue Dark mode");
                break;
            case "Dark":
                System.out.println("Seleccionaste Dark mode");
                break;
            default:
                System.out.println("Error");
        }

    }
}
