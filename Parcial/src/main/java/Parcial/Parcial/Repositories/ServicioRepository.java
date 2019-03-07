package Parcial.Parcial.Repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import Parcial.Parcial.entities.Cotizacion;
import Parcial.Parcial.entities.ServicioConsultoria;

@Repository
public interface ServicioRepository extends CrudRepository<ServicioConsultoria, Long> {
	
	public ServicioConsultoria findById(long id);
	public List<ServicioConsultoria> findByposts2(long id);
}
