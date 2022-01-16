
public abstract class Funcionario {

	
	private String nome;
	private String codigoDeIndentificao;
	private String numeroDeRegistro;

	
	
	public String getNome() {
		 return nome;
	 }
	 
	 public void setNome(String nome) {
		 this.nome = nome;
		 
	 } 
	 
	 public String getCodId() {
		 return codigoDeIndentificao;
	 } 
	 
	 public void setCodId(String codId) {
		 this.codigoDeIndentificao = codId;
	 }
	 public String  getNumeroDeRegistro() {
	 		return numeroDeRegistro;
	 		
	 } 
	 public void setNumeroDeRegistro(String numeroDeRegistro) {
	 		this.numeroDeRegistro = numeroDeRegistro;
	 }

}

