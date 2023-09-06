package fgs.ffgs.cadastrounico.rua;

import java.io.Serializable;
import java.util.List;
import java.util.Objects;

import fgs.ffgs.cadastrounico.endereco.Endereco;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "Rua_pxj")
public class Rua implements Serializable {
	
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int idRua;
	
	@Column(length = 120, nullable = false, unique = true )
	private String nomeRua;
	
	@OneToMany(mappedBy = "rua")
	private List<Endereco> endereco;
	
	public Rua() {}

	public Rua(String nomeRua, List<Endereco> endereco) {
		
		this.nomeRua = nomeRua;
		this.endereco = endereco;
		
	}
	
	public Rua(String nomeRua) {
		
		this.nomeRua = nomeRua;
		
	}

	public int getIdRua() {
		return idRua;
	}

	protected void setIdRua(int idRua) {
		this.idRua = idRua;
	}

	public String getNomeRua() {
		return nomeRua;
	}

	public void setNomeRua(String nomeRua) {
		this.nomeRua = nomeRua;
	}

	public List<Endereco> getEndereco() {
		return endereco;
	}

	public void setEndereco(List<Endereco> endereco) {
		this.endereco = endereco;
	}

	@Override
	public int hashCode() {
		return Objects.hash(idRua);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Rua other = (Rua) obj;
		return idRua == other.idRua;
	}
	
	
	
	
}
