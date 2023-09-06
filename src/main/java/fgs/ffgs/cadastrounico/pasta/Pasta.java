package fgs.ffgs.cadastrounico.pasta;

import java.io.Serializable;
import java.util.List;
import java.util.Objects;

import fgs.ffgs.cadastrounico.pessoa.Pessoa;
import fgs.ffgs.cadastrounico.pratileira.Pratileira;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "Pasta_pxj	")
public class Pasta implements Serializable{
	
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy= GenerationType.AUTO)
	private int idPasta;
	
	@Column(length = 80, nullable = false, unique = true)
	private String nomePasta;
	
	
	@ManyToOne
	@JoinColumn(name = "pratileira_id")
	private Pratileira pratileira;
	
	@OneToMany(mappedBy = "pasts")
	private List<Pessoa> pessoa;
	
	public Pasta() {}

	public Pasta(String nomePasta, Pratileira pratileira, List<Pessoa> pessoa) {
		
		this.nomePasta = nomePasta;
		this.pratileira = pratileira;
		this.pessoa = pessoa;
	}
	
	public Pasta(String nomePasta, Pratileira pratileira) {
		
		this.nomePasta = nomePasta;
		this.pratileira = pratileira;
		
	}

	public int getIdPasta() {
		return idPasta;
	}

	protected void setIdPasta(int idPasta) {
		this.idPasta = idPasta;
	}

	public String getNomePasta() {
		return nomePasta;
	}

	public void setNomePasta(String nomePasta) {
		this.nomePasta = nomePasta;
	}

	public Pratileira getPratileira() {
		return pratileira;
	}

	public void setPratileira(Pratileira pratileira) {
		this.pratileira = pratileira;
	}

	public List<Pessoa> getPessoa() {
		return pessoa;
	}

	public void setPessoa(List<Pessoa> pessoa) {
		this.pessoa = pessoa;
	}

	@Override
	public int hashCode() {
		return Objects.hash(idPasta);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Pasta other = (Pasta) obj;
		return idPasta == other.idPasta;
	}
	
	
	
	
	
}
