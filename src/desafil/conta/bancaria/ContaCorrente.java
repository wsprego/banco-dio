
package desafil.conta.bancaria;

public class ContaCorrente extends Conta{
    
    @Override
    public void imprimirInformacaoConta() {
        
        System.out.println("------ Informacoes Conta Corrente ------");
        super.imprimirInfoConta();
        System.out.println("\n");
        
    }

}
