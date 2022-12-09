public class TestReferencia {
    public static void main(String[] args) {
        Cuenta primeracuenta = new Cuenta();
        primeracuenta.saldo = 200;

         Cuenta segundaCuenta = primeracuenta;
         segundaCuenta.saldo = 100;

        System.out.println("Saldo primera cuenta " +primeracuenta.saldo);
        System.out.println("Saldo segunda cuenta " +segundaCuenta.saldo);

        segundaCuenta.saldo += 400;
        System.out.println("Saldo de primera cuenta" + primeracuenta.saldo);

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
