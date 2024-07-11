public interface ICredito {
	
	boolean verificarScore(Cliente cliente);

    ContratoDeEmprestimo emprestar(Cliente cliente, double valor, int numeroDeParcelasMensais);
}
