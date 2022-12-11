public class TestReferencia2 {
    public static void main(String[] args) {
        Cliente diego = new Cliente();
        diego.setNombre("Diego");;
        diego.setDocumento("3123123");
        diego.setTelefono( "9999912");

        Cuenta cuentaDiego = new Cuenta();
        cuentaDiego.setTitular(diego);

        System.out.println(cuentaDiego.getTitular().getDocumento());
    }
}
