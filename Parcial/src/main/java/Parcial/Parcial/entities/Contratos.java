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
@Table(name="Contratos")
public class Contratos {
	
	@Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id_contrato; 
	
	private String descripcionContrato;
		
	@ManyToMany (fetch=FetchType.LAZY, mappedBy="id_cliente")
    private Set<Cliente> posts = new HashSet<Cliente> (0); 
	
	@ManyToMany (fetch=FetchType.LAZY, mappedBy="id_consultor")
    private Set<ServicioConsultoria> posts2 = new HashSet<ServicioConsultoria> (0);

	public Long getId_contrato() {
		return id_contrato;
	}

	public void setId_contrato(Long id_contrato) {
		this.id_contrato = id_contrato;
	}

	public String getDescripcionContrato() {
		return descripcionContrato;
	}

	public void setDescripcionContrato(String descripcionContrato) {
		this.descripcionContrato = descripcionContrato;
	}

	public Set<Cliente> getPosts() {
		return posts;
	}

	public void setPosts(Set<Cliente> posts) {
		this.posts = posts;
	}

	public Set<ServicioConsultoria> getPosts2() {
		return posts2;
	}

	public void setPosts2(Set<ServicioConsultoria> posts2) {
		this.posts2 = posts2;
	} 
	
	
}

