public class ContratoDeEmprestimo implements ICredito{

    private Cliente cliente;
    private double montante;
    private static final double TAXA_MENSAL = 0.13;
    private int numeroDeParcelasMensais;

    public ContratoDeEmprestimo(){

    }

    private boolean verificarScore(Cliente cliente){
        if(cliente.getScore >= 900){
            return true;
        }
    }

    public ContratoDeEmprestimo emprestar(Cliente cliente, double valor, int numeroDeParcelasMensais){
        if(verificarScore(cliente)){
            
            ContratoDeEmprestimo contrato = new ContratoDeEmrpestimo(cliente);
            this.montante = valor * Math.pow(1 + TAXA_MENSAL, numeroDeParcelasMensais);
            this.numeroDeParcelasMensais = numeroDeParcelasMensais;

            return contrato;
        }else{
            return null;
        }
    }

    

}