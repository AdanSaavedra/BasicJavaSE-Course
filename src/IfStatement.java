public class IfStatement {
    public static void main(String[] args) {
        boolean isBtEnabled = true;
        int fileSended = 3;

        if(isBtEnabled){
            fileSended++;
            System.out.println("Archivo enviado");
        }else{
            System.out.println("Por favor enciende tu BT");
        }

        System.out.println(isBtEnabled);
        System.out.println(fileSended);
    }
}
