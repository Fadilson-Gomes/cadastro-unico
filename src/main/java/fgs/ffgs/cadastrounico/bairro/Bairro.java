package fgs.ffgs.cadastrounico.bairro;

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
@Table(name = "Bairro_pxj")
public class Bairro implements Serializable {
	
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int idBairro;
	
	@Column(length = 120, nullable = false, unique = true)
	private String nomeBairro;
	
	@OneToMany(mappedBy = "bairro")
	private List<Endereco> endereco;
	
	public Bairro() {}

	public Bairro(String nomeBairro, List<Endereco> endereco) {
		
		this.nomeBairro = nomeBairro;
		this.endereco = endereco;
		
	}
	
	public Bairro(String nomeBairro ) {
		
		this.nomeBairro = nomeBairro;
		
	}

	public int getIdBairro() {
		return idBairro;
	}

	protected void setIdBairro(int idBairro) {
		this.idBairro = idBairro;
	}

	public String getNomeBairro() {
		return nomeBairro;
	}

	public void setNomeBairro(String nomeBairro) {
		this.nomeBairro = nomeBairro;
	}

	public List<Endereco> getEndereco() {
		return endereco;
	}

	public void setEndereco(List<Endereco> endereco) {
		this.endereco = endereco;
	}

	@Override
	public int hashCode() {
		return Objects.hash(idBairro);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Bairro other = (Bairro) obj;
		return idBairro == other.idBairro;
	}


	
	
	
}

