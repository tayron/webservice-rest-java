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
import br.com.ibk.v1.ebo.EnderecoType;

public class EnderecoServiceImpl {

	@GET
	@Path("/all")
	@Produces(MediaType.APPLICATION_JSON)
	public EnderecoType[] listarEndereco() {
		Collection<EnderecoType> enderecos = InMemoryDataSource.queryAll(EnderecoType.class);
		return enderecos.toArray(new EnderecoType[]{});
	}
	
	@GET
	@Path("/{id}")
	@Produces(MediaType.APPLICATION_JSON)
	public EnderecoType listarEnderecoPorId(@PathParam("id") Integer id) {
		EnderecoType endereco = InMemoryDataSource.queryById(EnderecoType.class, id);
		return endereco;
	}

	@PUT
	@Path("/")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Response alterarEndereco(EnderecoType endereco) {
		InMemoryDataSource.update(EnderecoType.class, endereco.getCodigo(), endereco);
		return Response.ok("{\"result\":\"ok\"}").build();
	}

	@DELETE
	@Path("/{id}")
	@Produces(MediaType.APPLICATION_JSON)
	public Response removerEndereco(@PathParam("id") Integer id) {
		InMemoryDataSource.delete(EnderecoType.class, id);
		return Response.ok("{\"result\":\"ok\"}").build();
	}

	@POST
	@Path("/")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Response inserirEndereco(EnderecoType endereco) {
		InMemoryDataSource.add(EnderecoType.class, endereco.getCodigo(), endereco);
		return Response.ok("{\"result\":\"ok\"}").build();
	}

}
