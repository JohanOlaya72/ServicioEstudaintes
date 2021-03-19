package co.edu.poli.estudaintes.restcontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import co.edu.poli.estudaintes.DTO.EstudiantesDTO;
import co.edu.poli.estudaintes.servicios.EstudiantesService;
@CrossOrigin(origins = {"http://localhost:4200"})
@RestController
@RequestMapping("/api")
public class EstudiantesRestController {
	@Autowired
	private EstudiantesService Service;
	@GetMapping("/estudiantes")
	public List<EstudiantesDTO> getEstudaintes(){
		return Service.findAll();
	}
	
}
