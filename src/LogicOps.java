public class LogicOps {
    public static void main(String[] args) {
        int a = 8;
        int b = 5;

        System.out.println("a es igual a b?: " + (a == b));
        System.out.println("a es diferente a b?: " + (a != b));

        System.out.println("a es mayor a b?: " + (a > b));
        System.out.println("a es menor a b?: " + (a < b));
        System.out.println("a es mayoro igual a b?: " + (a >= b));
        System.out.println("a es menor o igual a b?: " + (a <= b));

        if(a==b){
            System.out.println("A es igual a b");
        }else if (a !=b){
            System.out.println("A es diferente a b");
        }
        else if (a > b){
            System.out.println("A es mayor a b");
        }
        else if (a < b){
            System.out.println("A es menor a b");
        }
        else if (a >= b){
            System.out.println("A es mayor igual a b");
        }
        else if (a <= b){
            System.out.println("A es menor o igual a b");
        }
    }
}
