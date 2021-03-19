package co.edu.poli.estudaintes.servicios.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.edu.poli.estudaintes.DTO.EstudiantesDTO;
import co.edu.poli.estudaintes.entidades.Estudiantes;
import co.edu.poli.estudaintes.repositorios.EstudiantesRepository;
import co.edu.poli.estudaintes.servicios.EstudiantesService;

@Service
public class EstudiantesServiceImpl implements EstudiantesService {

	@Autowired
	private EstudiantesRepository repo;
	@Override
	public List<EstudiantesDTO> findAll() {
		// TODO Auto-generated method stub
		List<EstudiantesDTO> LstEstudiantes = new ArrayList<EstudiantesDTO>();
		EstudiantesDTO Estu;
		List<Estudiantes> LstTemp = (List<Estudiantes>)repo.findAll();
		
		for(Estudiantes es: LstTemp) {
			Estu = new EstudiantesDTO();
			Estu.setIdentificacion(es.getIdentificaion());
			Estu.setNombres(es.getNombres());
			Estu.setApellidos(es.getApellidos());
			Estu.setCorreo(es.getCorreo());
			
			LstEstudiantes.add(Estu);
		}
		
		return LstEstudiantes;
	}

}

