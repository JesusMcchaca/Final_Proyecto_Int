package edu.pe.utp.TrabajoFinal.serviceimpl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import edu.pe.utp.TrabajoFinal.entity.Trabajador;
import edu.pe.utp.TrabajoFinal.repository.TrabajadorRepository;
import edu.pe.utp.TrabajoFinal.service.TrabajadorService;

@Service
public class TrabajadorServiceImpl implements TrabajadorService {
	@Autowired
	private TrabajadorRepository TrabajadorRepository;

	@Override
	public JpaRepository<Trabajador, Integer> getJpaRepository() {

		return TrabajadorRepository;
	}

	

}
