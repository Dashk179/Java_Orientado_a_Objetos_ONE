public class PruebraConstructor {
    public static void main(String[] args) {
        Cuenta cuenta1  = new Cuenta(551);
        Cuenta cuenta2 = new Cuenta(552);
        Cuenta cuenta3  = new Cuenta(553);

        //Creamos la variable private y static de total para que no se pueda acceder a ella
        //y asi protegerla para que ella  viva dentro de la clase
        //y no depende de la instancia.
        System.out.println(Cuenta.getTotal());
    }
}
