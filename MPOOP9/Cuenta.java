public class Cuenta{
  private double saldo;
  private int nRetiros=0;
  public Cuenta(){
  }

  public void depositar(double monto) throws MontoMaximoException{
    if(monto>20000)
      throw new MontoMaximoException();
    else{
      System.out.println("Depositando...");
      saldo+=monto;
    }
  }

  public void retirar(double monto) throws SaldoInsuficienteException, ArithmeticException,RetirosMaximosException{
    if(saldo<monto)
      throw new SaldoInsuficienteException();    
    else{
      if(nRetiros>3){
        throw new RetirosMaximosException();
      }
      else{ 
        nRetiros++;
        System.out.println("Retirando...");
        saldo-=monto;
      }
    }
  }

  public double consultaSaldo(){
    System.out.println("Tu saldo es: "+saldo);
    return saldo;
  }
}