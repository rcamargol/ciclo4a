package co.edu.unbosque.microservicioclientes.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import co.edu.unbosque.microservicioclientes.model.Clientes;
import co.edu.unbosque.microservicioclientes.dao.ClienteDAO;

@RestController //esta es una clase REST
@RequestMapping("clientes")
public class ClientesAPI {
	@Autowired//inyecta la dependencia de todos los métodos del JPA para clienteDAO
	private ClienteDAO clienteDAO;
	
	@PostMapping("/guardar")
	public void guardar(@RequestBody Clientes cliente) {//Request convierte en un objeto Java desde un JSon
		clienteDAO.save(cliente);
	}
	
	@GetMapping("/listar")
	public List<Clientes> listar(){
		return clienteDAO.findAll();
	}
	
	@DeleteMapping("/eliminar/{id}")
	public void eliminar(@PathVariable("id") Integer id) {
		clienteDAO.deleteById(id);
	}
	
	@PutMapping("/actualizar")
	public void actualizar(@RequestBody Clientes cliente) {
		clienteDAO.save(cliente);
	}
	
}
