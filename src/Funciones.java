public class Funciones {

    public static void main(String[] args) {
        double y =3;
        //Area de un circulo Pi * r2
        System.out.println(Math.PI * Math.pow(y,2));
        double area = circleArea(y);
        System.out.println(area);
        System.out.println(circleArea(3));

        //Area de una esfera 4*pi*r2
        System.out.println(4 * Math.PI * Math.pow(y,2));
        System.out.println(sphereArea(y));

        //volumen de una esfera (4/3)*pi*r3
        System.out.println((4/3) * Math.PI * Math.pow(y,3));
        System.out.println(sphereVolume(y));

        System.out.println("Pesos a Dolares: " + convertToDolar(1000, "COP"));

    }

    /**
     * Descripcion: Funcion para calcular el area de un circulo
     *
     * @param r Radio del circulo
     * @return Devuelve el area del circulo
     * */
    public static double circleArea(double r){
        return Math.PI * Math.pow(r,2);
    }

    /**
     * Descripcion: Funcion que calcula el area de una esfera
     *
     * @param r Radio de la esfera
     * @return Devuelve el area de la esfera
     * */
    public static double sphereArea(double r){
        return 4 * Math.PI * Math.pow(r,2);
    }

    /**
     * Descripcion: Funcion que calcula el volumen de una esfera con el radio
     *
     * @param r Radio de la esfera
     * @return Devuelve el volumen de la esfera
     * */
    public static double sphereVolume(double r){
        return (4/3) * Math.PI * Math.pow(r,3);
    }


    /**
     * Descripción: Función que especificando su moneda convierte una cantidad de dinero a dolares
     *
     * @param quantity Cantidad de dinero
     * @param currency  Tipo de moneda: solo acepta MXN o Cop
     * @return quantity Deveulve la cantidad actualizada en dolares
     * */
    public  static  double convertToDolar(double quantity, String currency){
        switch (currency){
            case "MXN":
                quantity *= 0.053;
                break;
            case "COP":
                quantity *= 0.00022;
                break;
        }
        return quantity;
    }

}
