
package desafil.conta.bancaria;

public class ContaPopanca extends Conta{
    
    @Override
    public void imprimirInformacaoConta() {
        System.out.println("------ Informacoes Conta Popanca ------");
        super.imprimirInfoConta();
        System.out.println("\n");
    }
}
