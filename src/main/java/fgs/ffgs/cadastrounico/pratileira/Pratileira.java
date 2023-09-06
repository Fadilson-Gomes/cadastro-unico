package fgs.ffgs.cadastrounico.pratileira;

import java.io.Serializable;
import java.util.List;
import java.util.Objects;

import fgs.ffgs.cadastrounico.Armario.Armario;
import fgs.ffgs.cadastrounico.pasta.Pasta;
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
@Table(name = "Pratileira_pxj")
public class Pratileira implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int idPratileira;
	
	@Column(length = 80, nullable = false, unique = true)
	private String nomePratileira;
	
	
	@ManyToOne
	@JoinColumn(name = "armario_id")
	private Armario armario;
	
	
	@OneToMany(mappedBy = "pratileira")
	private List<Pasta> pasta;
	
	public Pratileira() {}

	public Pratileira(String nomePratileira, Armario armario, List<Pasta> pasta) {
		
		this.nomePratileira = nomePratileira;
		this.armario = armario;
		this.pasta = pasta;
		
	}
	
	public Pratileira(String nomePratileira, Armario armario) {
		
		this.nomePratileira = nomePratileira;
		this.armario = armario;
		
	}

	public int getIdPratileira() {
		return idPratileira;
	}

	protected void setIdPratileira(int idPratileira) {
		this.idPratileira = idPratileira;
	}

	public String getNomePratileira() {
		return nomePratileira;
	}

	public void setNomePratileira(String nomePratileira) {
		this.nomePratileira = nomePratileira;
	}

	public Armario getArmario() {
		return armario;
	}

	public void setArmario(Armario armario) {
		this.armario = armario;
	}

	public List<Pasta> getPasta() {
		return pasta;
	}

	public void setPasta(List<Pasta> pasta) {
		this.pasta = pasta;
	}

	@Override
	public int hashCode() {
		return Objects.hash(idPratileira);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Pratileira other = (Pratileira) obj;
		return idPratileira == other.idPratileira;
	}

	
	
	
}
