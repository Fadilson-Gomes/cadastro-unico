package fgs.ffgs.cadastrounico.documentacao;

import java.io.Serializable;
import java.util.Objects;
import java.util.UUID;

import fgs.ffgs.cadastrounico.pessoa.Pessoa;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "Documentacao_pxj")
public class Documentacao implements Serializable{
	
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private UUID idDocumentacao;
	
	@Column(length = 20, nullable = false, unique = true)
	private String indentidade;
	
	@Column(length = 20, nullable = false, unique = true)
	private String nis;
	
	@Column(length = 20, nullable = false, unique = true) 
	private String cpf;
	
	@OneToOne
	@JoinColumn(name = "pessoa_id")
	private Pessoa pessoa;
	
	public Documentacao() {}

	public Documentacao(String indentidade, String nis, String cpf, Pessoa pessoa) {
		
		this.indentidade = indentidade;
		this.nis = nis;
		this.cpf = cpf;
		this.pessoa = pessoa;
		
	}

	public UUID getIdDocumentacao() {
		return idDocumentacao;
	}

	protected void setIdDocumentacao(UUID idDocumentacao) {
		this.idDocumentacao = idDocumentacao;
	}

	public String getIndentidade() {
		return indentidade;
	}

	public void setIndentidade(String indentidade) {
		this.indentidade = indentidade;
	}

	public String getNis() {
		return nis;
	}

	public void setNis(String nis) {
		this.nis = nis;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public Pessoa getPessoa() {
		return pessoa;
	}

	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}

	@Override
	public int hashCode() {
		return Objects.hash(idDocumentacao);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Documentacao other = (Documentacao) obj;
		return Objects.equals(idDocumentacao, other.idDocumentacao);
	}
	
	
	
	
	
	
}
