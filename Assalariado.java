package folhaPagamento;

public class Assalariado extends Funcionario {
	int salFixo;
	
	public Assalariado (String nome, String setor, String dataAdm, int salFixo) {
		super(nome, setor, dataAdm);
		this.salFixo = salFixo;		
	}

	@Override
	public String getNome() {
		return nome;
	}

	@Override
	public void setNome(String nome) {
		this.nome = nome;
	}

	@Override
	public String getSetor() {
		return setor;
	}

	@Override
	public void setSetor(String setor) {
		this.setor = setor;
	}

	@Override
	public String getDataAdm() {
		return dataAdm;
	}

	@Override
	public void setDataAdm(String dataAdm) {
		this.dataAdm = dataAdm;
	}
	
	public int getSalFixo() {
		return salFixo;
	}

	public void setSalFixo(int salFixo) {
		this.salFixo = salFixo;
	}
	
	
}
