package Parcial.Parcial.entities;


import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity
@Table(name="Consultor")
public class Consultor {
	
	@Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id_consultor; 
	
	private String nombreConsultor;
	private String telefonoConsultor;
	private String correoConsultor;
	
	@OneToMany (fetch=FetchType.LAZY, mappedBy="id_servicio")
    private Set<ServicioConsultoria> posts = new HashSet<ServicioConsultoria>(0);
	
	@OneToMany (fetch=FetchType.LAZY, mappedBy="id_cotizacion")
    private Set<Cotizacion> posts2 = new HashSet<Cotizacion>(0);

	
	public Long getId_consultor() {
		return id_consultor;
	}

	public void setId_consultor(Long id_consultor) {
		this.id_consultor = id_consultor;
	}

	public String getNombreConsultor() {
		return nombreConsultor;
	}

	public void setNombreConsultor(String nombreConsultor) {
		this.nombreConsultor = nombreConsultor;
	}

	public String getTelefonoConsultor() {
		return telefonoConsultor;
	}

	public void setTelefonoConsultor(String telefonoConsultor) {
		this.telefonoConsultor = telefonoConsultor;
	}

	public String getCorreoConsultor() {
		return correoConsultor;
	}

	public void setCorreoConsultor(String correoConsultor) {
		this.correoConsultor = correoConsultor;
	}

	public Set<ServicioConsultoria> getPosts() {
		return posts;
	}

	public void setPosts(Set<ServicioConsultoria> posts) {
		this.posts = posts;
	} 
	public Set<Cotizacion> getPosts2() {
		return posts2;
	}

	public void setPosts2(Set<Cotizacion> posts2) {
		this.posts2 = posts2;
	} 
	
}

