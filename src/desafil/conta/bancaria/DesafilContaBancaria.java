
package desafil.conta.bancaria;

public class DesafilContaBancaria {

    public static void main(String[] args) {

        Conta cc = new ContaCorrente();
        Conta cp = new ContaPopanca();
        
        cc.imprimirInformacaoConta();
        cp.imprimirInformacaoConta();
        
    }
    
}
