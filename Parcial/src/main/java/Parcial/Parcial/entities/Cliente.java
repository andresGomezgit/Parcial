package Parcial.Parcial.entities;


import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity
@Table(name="Cliente")
public class Cliente {
	
	@Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id_cliente; 
	
	private String nombreUsuario;
	private String nombreCliente;
	private String telefonoCliente;
	private String correoCliente;
	
	@ManyToMany (fetch=FetchType.LAZY, mappedBy="id_contrato")
    private Set<Contratos> posts = new HashSet<Contratos> (0);
	
	@ManyToMany (fetch=FetchType.LAZY, mappedBy="id_consultor")
    private Set<Consultor> posts2 = new HashSet<Consultor> (0);

	public Long getId_cliente() {
		return id_cliente;
	}

	public void setId_cliente(Long id_cliente) {
		this.id_cliente = id_cliente;
	}

	public String getNombreUsuario() {
		return nombreUsuario;
	}

	public void setNombreUsuario(String nombreUsuario) {
		this.nombreUsuario = nombreUsuario;
	}

	public String getNombreCliente() {
		return nombreCliente;
	}

	public void setNombreCliente(String nombreCliente) {
		this.nombreCliente = nombreCliente;
	}

	public String getTelefonoCliente() {
		return telefonoCliente;
	}

	public void setTelefonoCliente(String telefonoCliente) {
		this.telefonoCliente = telefonoCliente;
	}

	public String getCorreoCliente() {
		return correoCliente;
	}

	public void setCorreoCliente(String correoCliente) {
		this.correoCliente = correoCliente;
	}

	public Set<Contratos> getPosts() {
		return posts;
	}

	public void setPosts(Set<Contratos> posts) {
		this.posts = posts;
	}

	public Set<Consultor> getPosts2() {
		return posts2;
	}

	public void setPosts2(Set<Consultor> posts2) {
		this.posts2 = posts2;
	}
	
	
	
}

