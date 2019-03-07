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
@Table(name="Cotizacion")
public class Cotizacion {
	
	@Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id_cotizacion; 
	
	private String descripcionCotizacion;
	private String vigenciaCotizacion;
	
	@ManyToMany (fetch=FetchType.LAZY, mappedBy="id_consultor")
    private Set<Consultor> posts = new HashSet<Consultor> (0); 
	
	@ManyToMany (fetch=FetchType.LAZY, mappedBy="id_servicio")
    private Set<ServicioConsultoria> posts2 = new HashSet<ServicioConsultoria> (0);

	public Long getId_cotizacion() {
		return id_cotizacion;
	}

	public void setId_cotizacion(Long id_cotizacion) {
		this.id_cotizacion = id_cotizacion;
	}

	public String getDescripcionCotizacion() {
		return descripcionCotizacion;
	}

	public void setDescripcionCotizacion(String descripcionCotizacion) {
		this.descripcionCotizacion = descripcionCotizacion;
	}

	public String getVigenciaCotizacion() {
		return vigenciaCotizacion;
	}

	public void setVigenciaCotizacion(String vigenciaCotizacion) {
		this.vigenciaCotizacion = vigenciaCotizacion;
	}

	public Set<Consultor> getPosts() {
		return posts;
	}

	public void setPosts(Set<Consultor> posts) {
		this.posts = posts;
	}

	public Set<ServicioConsultoria> getPosts2() {
		return posts2;
	}

	public void setPosts2(Set<ServicioConsultoria> posts2) {
		this.posts2 = posts2;
	} 
	
	
}

