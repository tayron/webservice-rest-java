package br.com.ibk.soap.service;

import java.util.Collection;

import br.com.ibk.ds.memory.InMemoryDataSource;
import br.com.ibk.v1.cliente.AlterarClienteInputType;
import br.com.ibk.v1.cliente.AlterarClienteOutputType;
import br.com.ibk.v1.cliente.ClienteFault;
import br.com.ibk.v1.cliente.ClientePortType;
import br.com.ibk.v1.cliente.InserirClienteInputType;
import br.com.ibk.v1.cliente.InserirClienteOutputType;
import br.com.ibk.v1.cliente.ListarClienteOutputType;
import br.com.ibk.v1.cliente.ListarClientePorIdInputType;
import br.com.ibk.v1.cliente.ListarClientePorIdOutputType;
import br.com.ibk.v1.cliente.RemoverClienteInputType;
import br.com.ibk.v1.cliente.RemoverClienteOutputType;
import br.com.ibk.v1.ebo.ClienteType;
import br.com.ibk.v1.ebo.ClienteTypeArrayOf;
import br.com.ibk.v1.ebo.EnderecoType;

public class ClienteServiceImpl implements ClientePortType{

	public ListarClienteOutputType listarCliente() throws ClienteFault {
		ListarClienteOutputType out = new ListarClienteOutputType();
		
		ClienteTypeArrayOf arrayOf = new ClienteTypeArrayOf();
		
		Collection<ClienteType> clientes = InMemoryDataSource.queryAll(ClienteType.class);
		
		for (ClienteType cliente: clientes) {
			removerReferencias(cliente);
		}
		
		arrayOf.getCliente().addAll(clientes);
		
		out.setListaCliente(arrayOf);
		return out;
	}

	public AlterarClienteOutputType alterarCliente(AlterarClienteInputType input) throws ClienteFault {
		AlterarClienteOutputType out = new AlterarClienteOutputType();
		InMemoryDataSource.update(ClienteType.class, input.getCliente().getCodigo(), input.getCliente());
		out.setResultado(true);
		return out;
	}

	public RemoverClienteOutputType removerCliente(RemoverClienteInputType input) throws ClienteFault {
		RemoverClienteOutputType out = new RemoverClienteOutputType();
		InMemoryDataSource.delete(ClienteType.class, input.getId().intValue());
		out.setResultado(true);
		return out;
	}

	public InserirClienteOutputType inserirCliente(InserirClienteInputType input) throws ClienteFault {
		InserirClienteOutputType out = new InserirClienteOutputType();
		InMemoryDataSource.add(ClienteType.class, input.getCliente().getCodigo(), input.getCliente());
		out.setResultado(true);
		return out;
	}

	public ListarClientePorIdOutputType listarClientePorId(ListarClientePorIdInputType input) throws ClienteFault {
		ListarClientePorIdOutputType out = new ListarClientePorIdOutputType();
		
		ClienteType cliente = InMemoryDataSource.queryById(ClienteType.class, input.getId().intValue());
		
		removerReferencias(cliente);
		
		out.setCliente(cliente);
		return out;
	}
	

	private void removerReferencias(ClienteType cliente) {
		int codigoEndereco = cliente.getEndereco().getCodigo();
		EnderecoType newEndereco = new EnderecoType();
		newEndereco.setCodigo(codigoEndereco);
		cliente.setEndereco(newEndereco);
	}
}
