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
import br.com.ibk.v1.ebo.BancoType;

public class BancoServiceImpl {

	@GET
	@Path("/all")
	@Produces(MediaType.APPLICATION_JSON)
	public BancoType[] listarBanco() {
		Collection<BancoType> bancos = InMemoryDataSource.queryAll(BancoType.class);
		return bancos.toArray(new BancoType[]{});
	}
	
	@GET
	@Path("/{id}")
	@Produces(MediaType.APPLICATION_JSON)
	public BancoType listarBancoPorId(@PathParam("id") Integer id) {
		BancoType banco = InMemoryDataSource.queryById(BancoType.class, id);
		return banco;
	}

	@PUT
	@Path("/")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Response alterarBanco(BancoType banco) {
		InMemoryDataSource.update(BancoType.class, banco.getCodigo(), banco);
		return Response.ok("{\"result\":\"ok\"}").build();
	}

	@DELETE
	@Path("/{id}")
	@Produces(MediaType.APPLICATION_JSON)
	public Response removerBanco(@PathParam("id") Integer id) {
		InMemoryDataSource.delete(BancoType.class, id);
		return Response.ok("{\"result\":\"ok\"}").build();
	}

	@POST
	@Path("/")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Response inserirBanco(BancoType banco) {
		InMemoryDataSource.add(BancoType.class, banco.getCodigo(), banco);
		return Response.ok("{\"result\":\"ok\"}").build();
	}

}
