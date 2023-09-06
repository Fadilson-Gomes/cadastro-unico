package fgs.ffgs.cadastrounico.usuario;

import java.io.Serializable;
import java.util.List;
import java.util.Objects;

import fgs.ffgs.cadastrounico.pessoa.Pessoa;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "Usuario_pxj")
public class Usuario implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int idUsuario;
	
	@Column(length = 120, nullable = false, unique = false)
	private String nomeUsuario;
	
	@Column(nullable=false, unique = false)
	private boolean statusExclusao;  // true para usuario execluso
	
	@Column(nullable = false, unique = true)
	private String email;
	
	@Column(nullable = false, unique = true)
	private String senha;
	
	@Column(nullable = false, unique = true)
	private char tipoUsuario; // A -> Administrador  ||  C -> comum
	
	@OneToMany(mappedBy = "usuario")
	private List<Pessoa> pessoa;
	
	public Usuario() {}

	public Usuario(String nomeUsuario,  String email, String senha, char tipoUsuario,
			List<Pessoa> pessoa) {
		
		this.nomeUsuario = nomeUsuario;
		this.statusExclusao = false;
		this.email = email;
		this.senha = senha;
		this.tipoUsuario = tipoUsuario;
		this.pessoa = pessoa;
	}
	
	
	
	public Usuario(String nomeUsuario, String email, String senha, char tipoUsuario) {
		
		this.nomeUsuario = nomeUsuario;
		this.statusExclusao = false;
		this.email = email;
		this.senha = senha;
		this.tipoUsuario = tipoUsuario;
	}

	public int getIdUsuario() {
		return idUsuario;
	}

	protected void setIdUsuario(int idUsuario) {
		this.idUsuario = idUsuario;
	}

	public String getNomeUsuario() {
		return nomeUsuario;
	}

	public void setNomeUsuario(String nomeUsuario) {
		this.nomeUsuario = nomeUsuario;
	}

	public boolean isStatusExclusao() {
		return statusExclusao;
	}

	public void setStatusExclusao(boolean statusExclusao) {
		this.statusExclusao = statusExclusao;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public char getTipoUsuario() {
		return tipoUsuario;
	}

	public void setTipoUsuario(char tipoUsuario) {
		this.tipoUsuario = tipoUsuario;
	}

	public List<Pessoa> getPessoa() {
		return pessoa;
	}

	public void setPessoa(List<Pessoa> pessoa) {
		this.pessoa = pessoa;
	}

	@Override
	public int hashCode() {
		return Objects.hash(idUsuario);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Usuario other = (Usuario) obj;
		return idUsuario == other.idUsuario;
	}
	
	
	
}
