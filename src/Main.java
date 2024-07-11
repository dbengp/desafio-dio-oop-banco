
public class Main {

	public static void main(String[] args) {

		Banco banco = Banco.getInstance();
		banco.setNome("VB Financeira");

		Cliente venilton = new Cliente();
		venilton.setNome("Venilton");
		venilton.setScore(900);

		ContratoDeEmprestimo cdc = new ContratoDeEmprestimo();
		List<ContratoDeEmprestimo> contratos = new ArrayList<>();

		Conta cc = new ContaCorrente(venilton);
		Conta poupanca = new ContaPoupanca(venilton);

		List<Conta> contas = new ArrayList<Contas>();
		contas.add(cc);
		contas.add(poupanca);

		banco.setContas(contas);

		cc.depositar(100);
		cc.transferir(100, poupanca);
		
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();

        cdc.emprestar(venilton,10000,24);

		contratos.add(cdc);
		
		banco.setAtivos(contratos);
	}

}
