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
import br.com.ibk.v1.ebo.ClienteType;
import br.com.ibk.v1.ebo.ContaBancariaType;

public class ContaBancariaServiceImpl {

	@GET
	@Path("/all")
	@Produces(MediaType.APPLICATION_JSON)
	public ContaBancariaType[] listarContaBancaria() {
		Collection<ContaBancariaType> contas = InMemoryDataSource.queryAll(ContaBancariaType.class);
		
		for (ContaBancariaType conta: contas) {
			removerReferencias(conta);
		}
		return contas.toArray(new ContaBancariaType[]{});
	}
	
	@GET
	@Path("/{id}")
	@Produces(MediaType.APPLICATION_JSON)
	public ContaBancariaType listarContaBancariaPorId(@PathParam("id") Integer id) {
		ContaBancariaType conta = InMemoryDataSource.queryById(ContaBancariaType.class, id);
		removerReferencias(conta);
		return conta;
	}

	@PUT
	@Path("/")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Response alterarContaBancaria(ContaBancariaType contabancaria) {
		InMemoryDataSource.update(ContaBancariaType.class, contabancaria.getCodigo(), contabancaria);
		return Response.ok("{\"result\":\"ok\"}").build();
	}

	@DELETE
	@Path("/{id}")
	@Produces(MediaType.APPLICATION_JSON)
	public Response removerContaBancaria(@PathParam("id") Integer id) {
		InMemoryDataSource.delete(ContaBancariaType.class, id);
		return Response.ok("{\"result\":\"ok\"}").build();
	}

	@POST
	@Path("/")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Response inserirContaBancaria(ContaBancariaType contabancaria) {
		InMemoryDataSource.add(ContaBancariaType.class, contabancaria.getCodigo(), contabancaria);
		return Response.ok("{\"result\":\"ok\"}").build();
	}
	
	private void removerReferencias(ContaBancariaType conta) {
		int codigoCliente = conta.getCliente().getCodigo();
		ClienteType newCliente = new ClienteType();
		newCliente.setCodigo(codigoCliente);
		conta.setCliente(newCliente);
		
		int codBanco = conta.getBanco().getCodigo();
		BancoType newBanco = new BancoType();
		newBanco.setCodigo(codBanco);
		conta.setBanco(newBanco);
		
	}

}
