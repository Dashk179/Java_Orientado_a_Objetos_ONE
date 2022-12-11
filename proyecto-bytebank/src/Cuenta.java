  class Cuenta {
   private double   saldo;
   private int agencia;
   private int    numero;
    private  Cliente titular = new Cliente();

   private static  int total; // la palabra static nos ayuda a que la variable no sea alterada por la instancia si no directamente por la clase

//Al momento de crear un nuevo objeto cuenta la logica del negocio nos dice que
// es necesario asignarle una agencia para cada cuenta por lo cual obligamos al
//sistema a signarle una agencia al objeto cuenta al momento de su creacion
    public Cuenta(int agencia){

        if (agencia <= 0){
            System.out.println("No se permiten 0");
            this.agencia = 1;
        }else{
           this.agencia = agencia;
           total++;
            System.out.println("Se van creando : "+ total +" cuentas");
        }
    }
      public void depositar(double valor){
        this.saldo  += valor;
    }

   public  boolean retirar(double valor){
        if (this.saldo >= valor){
           this.saldo -= valor;
           return  true;
        }
        return false;
    }

   public  boolean transferir(double valor,  Cuenta cuenta){
         if (this.saldo >= valor){
            this.saldo =  this.saldo -valor;
            cuenta.depositar(valor);
            return true;
         }
         return false;
    }

   public double getSaldo(){
          return  this.saldo;
    }


      public int getAgencia() {
          return agencia;
      }

      public void setTitular(Cliente titular) {
          this.titular = titular;
      }

      public Cliente getTitular() {
          return titular;
      }

      public static int getTotal() {
          return total;
      }
  }
