package com.distribuida.principal;

import java.util.Date;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ditribuida.entities.Cliente;
import com.ditribuida.entities.Factura;
import com.ditribuida.entities.FacturaDetalle;
import com.ditribuida.entities.Producto;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		Cliente cliente = context.getBean("beanCliente", Cliente.class);
		Cliente cliente2 = context.getBean("beanCliente2", Cliente.class);
		Cliente cliente3 = context.getBean("beanCliente3", Cliente.class);
		
		Producto producto = context.getBean("beanProducto", Producto.class);
		Producto producto2 = context.getBean("beanProducto2", Producto.class);
		Producto producto3 = context.getBean("beanProducto3", Producto.class);
		Producto producto4 = context.getBean("beanProducto4", Producto.class);
		Producto producto5 = context.getBean("beanProducto5", Producto.class);
		
		Factura factura = context.getBean("beanFactura", Factura.class);
		Factura factura2 = context.getBean("beanFactura2", Factura.class);
		
		FacturaDetalle facturadetalle = context.getBean("beanFacturaDetalle", FacturaDetalle.class);
		FacturaDetalle facturadetalle2 = context.getBean("beanFacturaDetalle", FacturaDetalle.class);	
		
		//CLIENTES
		
		cliente.setIdCliente(1);
		cliente.setCedula("1754442620");
		cliente.setNombre("Alberto");
		cliente.setApellido("Saltos");
		cliente.setEdad(21);
		cliente.setFechaNacimiento(new Date());
		cliente.setDireccion("Quito");
		cliente.setTelefono("098129302");
		cliente.setCorreo("alberto@productos.com");
		
		cliente2.setIdCliente(2);
		cliente2.setCedula("1283712832");
		cliente2.setNombre("Luis");
		cliente2.setApellido("Sanchez");
		cliente2.setEdad(22);
		cliente2.setFechaNacimiento(new Date());
		cliente2.setDireccion("Manabi");
		cliente2.setTelefono("02983908123");
		cliente2.setCorreo("luis@productos.com");
		
		cliente3.setIdCliente(3);
		cliente3.setCedula("1321738213");
		cliente3.setNombre("Juan");
		cliente3.setApellido("Sanchez");
		cliente3.setEdad(22);
		cliente3.setFechaNacimiento(new Date());
		cliente3.setDireccion("Manabi");
		cliente3.setTelefono("02983908123");
		cliente3.setCorreo("juan@productos.com");
		
		factura.setIdFactura(1);
		factura.setNumFactura("FAC-001");
		factura.setFecha(new Date());
		factura.setTotalNeto(19.20);
		factura.setIva(0.12);
		factura.setTotal(20.25);
		
		factura2.setIdFactura(2);
		factura2.setNumFactura("FAC-002");
		factura2.setFecha(new Date());
		factura2.setTotalNeto(28.20);
		factura2.setIva(0.12);
		factura2.setTotal(30.15);
		
		producto.setIdProducto(1);
		producto.setNombre("Manzana");
		producto.setDescripcion("Caja de manzanas");
		producto.setPrecio(6.99);
		producto.setStock(100);
		
		producto2.setIdProducto(2);
		producto2.setNombre("Peras");
		producto2.setDescripcion("Caja de peras");
		producto2.setPrecio(9.99);
		producto2.setStock(100);
		
		producto3.setIdProducto(3);
		producto3.setNombre("Uvas");
		producto3.setDescripcion("Libra de Uvas");
		producto3.setPrecio(1.99);
		producto3.setStock(100);
		
		producto4.setIdProducto(4);
		producto4.setNombre("Tomate");
		producto4.setDescripcion("Caja de tomates");
		producto4.setPrecio(11.99);
		producto4.setStock(100);
		
		producto5.setIdProducto(5);
		producto5.setNombre("Mangos");
		producto5.setDescripcion("Caja de mangos");
		producto5.setPrecio(0.99);
		producto5.setStock(100);
		
		
		facturadetalle.setIdFacturaDetalle(1);
		facturadetalle.setCantidad(5);
		facturadetalle.setFactura(factura);
		
		facturadetalle2.setIdFacturaDetalle(2);
		facturadetalle2.setCantidad(10);
		facturadetalle2.setFactura(factura2);
	
		System.out.println(factura.toString());
		System.out.println(facturadetalle.toString());
		System.out.println(factura2.toString());
		System.out.println(facturadetalle2.toString());
		
					
		context.close();

	}

}
