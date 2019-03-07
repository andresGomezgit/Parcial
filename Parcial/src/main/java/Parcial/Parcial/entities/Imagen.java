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
@Table(name="Imagen")
public class Imagen {
	
	@Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id_imagen; 
	
	private String nombreImagen;
	private String pathImagen;
	
	@ManyToMany (fetch=FetchType.LAZY, mappedBy="id_servicio")
    private Set<ServicioConsultoria> posts = new HashSet<ServicioConsultoria> (0);

	public Long getId_imagen() {
		return id_imagen;
	}

	public void setId_imagen(Long id_imagen) {
		this.id_imagen = id_imagen;
	}

	public String getNombreImagen() {
		return nombreImagen;
	}

	public void setNombreImagen(String nombreImagen) {
		this.nombreImagen = nombreImagen;
	}

	public String getPathImagen() {
		return pathImagen;
	}

	public void setPathImagen(String pathImagen) {
		this.pathImagen = pathImagen;
	}

	public Set<ServicioConsultoria> getPosts() {
		return posts;
	}

	public void setPosts(Set<ServicioConsultoria> posts) {
		this.posts = posts;
	} 
	
	
}

