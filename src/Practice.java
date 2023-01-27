public class Practice {
    String name = "Maria Sofia";
    int age = 32;
    String color = "White";
    boolean woman = true;

    public void print(){
        System.out.println("Nombre: "+ name);
        System.out.println("Age: "+ age);
        System.out.println("Color: "+ color);
        System.out.println("Woman: "+ woman);
    }
    public static void main(String[] args) {
        //        Variables Ejercicio 1.
//        Ponte creativo y preséntanos a tu familia con
//        variables, utiliza todos los tipos y cantidad
//        de variables que puedas, no olvides las convenciones
//        de nombres Camel Case.
        Practice object = new Practice();
        object.print();


//        Casting Ejercicio 2
//        Usando los dos tipos de casting que aprendiste
//        (implícito y explícito), resuelve los siguientes
//        casteos indicando qué tipo es y si se está calculando
//        estimación o exactitud.
        char c = 'z';
        int cI = (int) c;
        System.out.println((int)cI);

        int i = 250;
        System.out.println((long) i);
        System.out.println((short)i);

        double d = 301.067;
        double dL = (long) d;
        System.out.println((long) dL);

        int f = 100;
        float fx = (float) (f + 5000.66);
        System.out.println(fx);

        int g = 737;
        System.out.println((byte)g *100);

        double l = 298.638;
        l/=25;
        System.out.println((long) l);
    }
}

