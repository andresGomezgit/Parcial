package Parcial.Parcial.Servicios;

import java.util.Optional;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import Parcial.Parcial.entities.ServicioConsultoria;
import Parcial.Parcial.Repositories.*;


@RestController
public class ServicioController {
	
	@Autowired
	private ServicioRepository servicioRepositoryDAO;
	
	@RequestMapping("/getAllServices")
	public Iterable<ServicioConsultoria> getAllServices () {
		
		Iterable<ServicioConsultoria> findAll = servicioRepositoryDAO.findAll();
		
		return findAll;
		
	}
	
	@RequestMapping(path="/addServices", method=RequestMethod.POST) 
	public @ResponseBody String addNewServices 
	(@RequestParam String nombreServicio, @RequestParam String descripcionServicio) {
		
		ServicioConsultoria servicio = new ServicioConsultoria();
		servicio.setNombreServicio(nombreServicio);
		servicio.setDescripcionServicio(descripcionServicio);
		servicioRepositoryDAO.save(servicio);
		return "Usuario Guardado";
		
	}
	
	@RequestMapping ("/getBySer")
	public ServicioConsultoria getUserById (@RequestParam long ServicioId) {
		
		ServicioConsultoria find = servicioRepositoryDAO.findById(ServicioId);
		
		return find;
		
	}
}