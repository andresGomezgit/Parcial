package Parcial.Parcial.Repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import Parcial.Parcial.entities.Cotizacion;

@Repository
public interface CotizacionRepository extends CrudRepository<Cotizacion, Long> {
	
	public Cotizacion findById(long id);
	
}
