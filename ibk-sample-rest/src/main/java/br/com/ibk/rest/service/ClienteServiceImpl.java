package br.com.ibk.rest.service;

import java.util.Collection;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import br.com.ibk.ds.memory.InMemoryDataSource;
import br.com.ibk.v1.ebo.ClienteType;
import br.com.ibk.v1.ebo.EnderecoType;

public class ClienteServiceImpl {

	@GET
	@Path("/all")
	@Produces(MediaType.APPLICATION_JSON)
	public ClienteType[] listarCliente() {
		Collection<ClienteType> clientes = InMemoryDataSource.queryAll(ClienteType.class);
		
		for (ClienteType cliente: clientes) {
			removerReferencias(cliente);
		}
		
		return clientes.toArray(new ClienteType[]{});
	}
	
	@GET
	@Path("/{id}")
	@Produces(MediaType.APPLICATION_JSON)
	public ClienteType listarClientePorId(@PathParam("id") Integer id) {
		ClienteType cliente = InMemoryDataSource.queryById(ClienteType.class, id);
		
		removerReferencias(cliente);
		return cliente;
	}

	@PUT
	@Path("/")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Response alterarCliente(ClienteType cliente) {
		InMemoryDataSource.update(ClienteType.class, cliente.getCodigo(), cliente);
		return Response.ok("{\"result\":\"ok\"}").build();
	}

	@DELETE
	@Path("/{id}")
	@Produces(MediaType.APPLICATION_JSON)
	public Response removerCliente(@PathParam("id") Integer id) {
		InMemoryDataSource.delete(ClienteType.class, id);
		return Response.ok("{\"result\":\"ok\"}").build();
	}

	@POST
	@Path("/")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Response inserirCliente(ClienteType cliente) {
		InMemoryDataSource.add(ClienteType.class, cliente.getCodigo(), cliente);
		return Response.ok("{\"result\":\"ok\"}").build();
	}

	private void removerReferencias(ClienteType cliente) {
		int codigoEndereco = cliente.getEndereco().getCodigo();
		EnderecoType newEndereco = new EnderecoType();
		newEndereco.setCodigo(codigoEndereco);
		cliente.setEndereco(newEndereco);
	}

}
