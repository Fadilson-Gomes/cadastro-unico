package fgs.ffgs.cadastrounico.Armario;

import java.io.Serializable;
import java.util.List;
import java.util.Objects;

import fgs.ffgs.cadastrounico.pratileira.Pratileira;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "Armario_pxj")
public class Armario implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int idArmario;
	
	@Column(length = 80, nullable = false, unique = true)
	private String nomeArmario;
	
	@OneToMany(mappedBy = "armario")
	private List<Pratileira> pratileira;
	
	public Armario() {}
	
	public Armario(String nomeArmario, List<Pratileira> pratileira) {
		
		this.nomeArmario = nomeArmario;
		this.pratileira = pratileira;
		
	}
	
	public Armario(String nomeArmario) {
		this.nomeArmario = nomeArmario;
	}

	public int getIdArmario() {
		return idArmario;
	}

	protected void setIdArmario(int idArmario) {
		this.idArmario = idArmario;
	}

	public String getNomeArmario() {
		return nomeArmario;
	}

	public void setNomeArmario(String nomeArmario) {
		this.nomeArmario = nomeArmario;
	}

	public List<Pratileira> getPratileira() {
		return pratileira;
	}

	public void setPratileira(List<Pratileira> pratileira) {
		this.pratileira = pratileira;
	}

	@Override
	public int hashCode() {
		return Objects.hash(idArmario);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Armario other = (Armario) obj;
		return idArmario == other.idArmario;
	}
	
	
	
}
