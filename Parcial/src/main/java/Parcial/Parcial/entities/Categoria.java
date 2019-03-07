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
@Table(name="Categoria")
public class Categoria {
	
	@Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id_categoria; 
	
	private String nombreCategoria;
	private String descripcionCategoria;
	
	@ManyToMany (fetch=FetchType.LAZY, mappedBy="id_servicio")
    private Set<ServicioConsultoria> posts = new HashSet<ServicioConsultoria> (0);

	public Long getId_categoria() {
		return id_categoria;
	}

	public void setId_categoria(Long id_categoria) {
		this.id_categoria = id_categoria;
	}

	public String getNombreCategoria() {
		return nombreCategoria;
	}

	public void setNombreCategoria(String nombreCategoria) {
		this.nombreCategoria = nombreCategoria;
	}

	public String getDescripcionCategoria() {
		return descripcionCategoria;
	}

	public void setDescripcionCategoria(String descripcionCategoria) {
		this.descripcionCategoria = descripcionCategoria;
	}

	public Set<ServicioConsultoria> getPosts() {
		return posts;
	}

	public void setPosts(Set<ServicioConsultoria> posts) {
		this.posts = posts;
	} 
	
	
}

