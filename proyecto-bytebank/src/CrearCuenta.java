public class CrearCuenta {

    public static void main(String[] args) {

        Cuenta primeracuenta  = new Cuenta();
        primeracuenta.saldo = 50;
        System.out.println(primeracuenta.saldo);

        Cuenta segundaCuenta = new Cuenta();
        segundaCuenta.saldo = 50;
        System.out.println(segundaCuenta.saldo);


        System.out.println(primeracuenta);
        System.out.println(segundaCuenta);

        if (primeracuenta == segundaCuenta){
            System.out.println("son el mismo el objeto");
        }
        else {
            System.out.println("No son el mismo objeto");
        }
    }
}
