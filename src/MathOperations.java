public class MathOperations {
    public static void main(String[] args) {
        double x = 2.1;
        double y = 3;

        //Devuelve un entero hacia arriba
        System.out.println(Math.ceil(x));

        //Devuelve un entero hacia abajo
        System.out.println(Math.floor(x));
        
        //Devuelve numero elevado a otro
        System.out.println(Math.pow(x,y));

        //Devuelve el numero mayor
        System.out.println(Math.max(x,y));

        //Devuelve la raiz cuadrada
        System.out.println(Math.sqrt(y));

        //Area de un circulo Pi * r2
        System.out.println(Math.PI * Math.pow(y,2));

        //Area de una esfera 4*pi*r2
        System.out.println(4 * Math.PI * Math.pow(y,2));

        //volumen de una esfera (4/3)*pi*r3
        System.out.println((4/3) * Math.PI * Math.pow(y,3));
    }
}
