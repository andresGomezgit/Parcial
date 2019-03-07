package Parcial.Parcial.entities;


import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity
@Table(name="ServicioConsultoria")
public class ServicioConsultoria {
	
	@Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id_servicio; 
	
	private String nombreServicio;	
	private String descripcionServicio;
	
	@ManyToMany (fetch=FetchType.LAZY, mappedBy="id_contrato")
    private Set<Contratos> posts = new HashSet<Contratos> (0); 
	
	@ManyToMany (fetch=FetchType.LAZY, mappedBy="id_categoria")
    private Set<Categoria> posts2 = new HashSet<Categoria> (0); 
	
	@ManyToOne 
    private Consultor posts3 ; 
	
	@ManyToMany 
    private Categoria posts4 ;
	
	@ManyToMany (fetch=FetchType.LAZY, mappedBy="id_imagen")
    private Set<Imagen> posts5 = new HashSet<Imagen> (0); 
	
	@ManyToMany (fetch=FetchType.LAZY, mappedBy="id_cotizacion")
    private Set<Cotizacion> posts6 = new HashSet<Cotizacion> (0);

	public Long getId_servicio() {
		return id_servicio;
	}

	public void setId_servicio(Long id_servicio) {
		this.id_servicio = id_servicio;
	}

	public String getNombreServicio() {
		return nombreServicio;
	}

	public void setNombreServicio(String nombreServicio) {
		this.nombreServicio = nombreServicio;
	}

	public String getDescripcionServicio() {
		return descripcionServicio;
	}

	public void setDescripcionServicio(String descripcionServicio) {
		this.descripcionServicio = descripcionServicio;
	}

	public Set<Contratos> getPosts() {
		return posts;
	}

	public void setPosts(Set<Contratos> posts) {
		this.posts = posts;
	}

	public Set<Categoria> getPosts2() {
		return posts2;
	}

	public void setPosts2(Set<Categoria> posts2) {
		this.posts2 = posts2;
	}

	public Consultor getPosts3() {
		return posts3;
	}

	public void setPosts3(Consultor posts3) {
		this.posts3 = posts3;
	}

	public Categoria getPosts4() {
		return posts4;
	}

	public void setPosts4(Categoria posts4) {
		this.posts4 = posts4;
	}

	public Set<Imagen> getPosts5() {
		return posts5;
	}

	public void setPosts5(Set<Imagen> posts5) {
		this.posts5 = posts5;
	}

	public Set<Cotizacion> getPosts6() {
		return posts6;
	}

	public void setPosts6(Set<Cotizacion> posts6) {
		this.posts6 = posts6;
	} 
	
}

