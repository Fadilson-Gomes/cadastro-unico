package fgs.ffgs.cadastrounico.endereco;

import java.io.Serializable;
import java.util.Objects;
import java.util.UUID;

import fgs.ffgs.cadastrounico.bairro.Bairro;
import fgs.ffgs.cadastrounico.pessoa.Pessoa;
import fgs.ffgs.cadastrounico.rua.Rua;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "Endereco_pxj")
public class Endereco implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private UUID idEndereco;
	
	@Column(length = 30, nullable = false, unique = false)
	private String numero;
	
	@Column(nullable = true, unique = false)
	private String complemento;
	
	@ManyToOne
	@JoinColumn(name = "bairro_id")
	private Bairro bairro;
	
	@ManyToOne
	@JoinColumn(name = "rua_id")
	private Rua rua;
	
	@OneToOne
	@JoinColumn(name = "pessoa_id")
	private Pessoa pessoa;
	
	
	public Endereco() {}

	public Endereco(String numero, String complemento, Bairro bairro, Rua rua, Pessoa pessoa) {
		
		this.numero = numero;
		this.complemento = complemento;
		this.bairro = bairro;
		this.rua = rua;
		this.pessoa = pessoa;
	}

	public UUID getIdEndereco() {
		return idEndereco;
	}

	protected void setIdEndereco(UUID idEndereco) {
		this.idEndereco = idEndereco;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getComplemento() {
		return complemento;
	}

	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}

	public Bairro getBairro() {
		return bairro;
	}

	public void setBairro(Bairro bairro) {
		this.bairro = bairro;
	}

	public Rua getRua() {
		return rua;
	}

	public void setRua(Rua rua) {
		this.rua = rua;
	}

	public Pessoa getPessoa() {
		return pessoa;
	}

	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}

	@Override
	public int hashCode() {
		return Objects.hash(idEndereco);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Endereco other = (Endereco) obj;
		return Objects.equals(idEndereco, other.idEndereco);
	}
	
	
	
}
