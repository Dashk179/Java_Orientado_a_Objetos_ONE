public class TestReferencia {
    public static void main(String[] args) {
        Cuenta primeracuenta = new Cuenta(55);
        primeracuenta.depositar(200) ;

         Cuenta segundaCuenta = primeracuenta;
         segundaCuenta.depositar(100) ;

        System.out.println("Saldo primera cuenta " +primeracuenta.getSaldo());
        System.out.println("Saldo segunda cuenta " +segundaCuenta.getSaldo());

        segundaCuenta.depositar(400) ;
        System.out.println("Saldo de primera cuenta" + primeracuenta.getSaldo());

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
