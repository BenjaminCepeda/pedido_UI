package pedido_UI;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Date;
import java.util.List;

import org.junit.jupiter.api.Test;

import com.uisrael.pedidoUI.controller.CabeceraPedidoController;
import com.uisrael.pedidoUI.controller.ClienteController;
import com.uisrael.pedidoUI.controller.EmpleadoController;
import com.uisrael.pedidoUI.controller.impl.CabeceraPedidoControllerImpl;
import com.uisrael.pedidoUI.controller.impl.ClienteControllerImpl;
import com.uisrael.pedidoUI.controller.impl.EmpleadoControllerImpl;
import com.uisrael.pedidoUI.model.entity.CabeceraPedido;
import com.uisrael.pedidoUI.model.entity.Cliente;
import com.uisrael.pedidoUI.model.entity.Empleado;

class PruebasPedido {
	private  ClienteController clienteController= new ClienteControllerImpl();
	private  EmpleadoController empleadoController= new EmpleadoControllerImpl();
	private  CabeceraPedidoController cabeceraPedidoController= new CabeceraPedidoControllerImpl();
	@Test
	void test() {
		
		Cliente cliente = new Cliente();
		cliente.setNombres("Juan");
		cliente.setApellidos("Logroño");
		cliente.setDireccion("Figueroa");
		cliente.setIdentificacion("2222222222");
		cliente.setTelefono("0988888888");
		cliente.setEstadoRegistro(1);		
		clienteController.insertar(cliente);
		
		
		cliente = new Cliente();
		cliente.setNombres("Benjamin");
		cliente.setApellidos("Cepeda");
		cliente.setDireccion("Av. Occidental");
		cliente.setIdentificacion("1111111111");
		cliente.setTelefono("0999999999");
		cliente.setEstadoRegistro(1);		
		clienteController.insertar(cliente);

		Empleado empleado = new Empleado();
		empleado.setNombres("Juan");
		empleado.setApellidos("Perez");
		empleado.setCedula("2222222222");
		empleado.setFechaNacimiento(new Date());
		empleado.setTelefono("09999999999");
		empleado.setEstadoRegistro(1);
		empleadoController.insertar(empleado);
		
		CabeceraPedido cabeceraPedido = new CabeceraPedido();
		cabeceraPedido.setFechaPedido(new Date());
		cabeceraPedido.setFkCliente(cliente);
		cabeceraPedido.setFkEmpleado(empleado);
		cabeceraPedido.setFormaPago("Efectivo");
		cabeceraPedido.setObservacion("Inserción de prueba");
		cabeceraPedido.setEstadoRegistro(1);
		cabeceraPedidoController.insertar(cabeceraPedido);

		System.out.println("-------------------- Listado con CB ---------------");
		List<Cliente> listadoClientes = clienteController.listar();
		for (Cliente clienteActual : listadoClientes) {
			System.out.println(clienteActual);
		}
		System.out.println("-------------------- Listado con TQ ---------------");
		List<Cliente> listadoClientesTQ = clienteController.listarTQ();
		for (Cliente clienteActual : listadoClientesTQ) {
			System.out.println(clienteActual);
		}
	}

}
