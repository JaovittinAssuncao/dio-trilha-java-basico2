// CaixaEletronico.java
public class CaixaEletronico {
    public static void main(String[] args) {

       double saldo = 25.0;
       double valorSolicitado = 26.0;

       if(valorSolicitado < saldo)
        saldo = saldo - valorSolicitado;
        else
        System.out.println("Saque Indispoviel seu saldo é" );

        System.out.println(saldo);

    }
}