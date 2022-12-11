public class PruebaMetodos {

    public static void main(String[] args) {
        Cuenta  cuentaArturo  = new Cuenta();

        cuentaArturo.depositar(500);
      System.out.println(cuentaArturo.getSaldo());


        cuentaArturo.retirar(300);
       System.out.println(cuentaArturo.getSaldo());

        Cuenta cuentaJosue  = new Cuenta();
        cuentaJosue.depositar(500);
        boolean puedeTransferir  = cuentaJosue.transferir(400,cuentaArturo);//Este metodo aplica a ser un booleano ya que debo de trabajar con el valor retornado. (Retornar el valor de transferenacia exitosa)

        if (puedeTransferir){
            System.out.println("La transferencia fue exitosa");
        }
        else {
            System.out.println("No es posible");
        }
        System.out.println(cuentaJosue.getSaldo());
        System.out.println(cuentaArturo.getSaldo());


    }

}
