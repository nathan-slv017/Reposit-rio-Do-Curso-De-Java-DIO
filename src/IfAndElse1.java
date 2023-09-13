public class IfAndElse1 {

    public static void main(String[] args) {

        double saldo = 25.0;
        double valorSolicitado = 30;

        if (valorSolicitado < saldo) {

            saldo = saldo - valorSolicitado;
            System.out.println("Saldo Atual: " + saldo);

        } else if (valorSolicitado > saldo) {

            System.out.println("Saldo insuficiente");
            System.out.println("Saldo atual: " + saldo);

        }
    }

}