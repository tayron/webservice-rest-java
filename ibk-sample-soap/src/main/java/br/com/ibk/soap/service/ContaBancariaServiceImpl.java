package br.com.ibk.soap.service;

import java.util.Collection;

import br.com.ibk.ds.memory.InMemoryDataSource;
import br.com.ibk.v1.contabancaria.AlterarContaBancariaInputType;
import br.com.ibk.v1.contabancaria.AlterarContaBancariaOutputType;
import br.com.ibk.v1.contabancaria.ContaBancariaPortType;
import br.com.ibk.v1.contabancaria.ContabancariaFault;
import br.com.ibk.v1.contabancaria.InserirContaBancariaInputType;
import br.com.ibk.v1.contabancaria.InserirContaBancariaOutputType;
import br.com.ibk.v1.contabancaria.ListarContaBancariaOutputType;
import br.com.ibk.v1.contabancaria.ListarContaBancariaPorIdInputType;
import br.com.ibk.v1.contabancaria.ListarContaBancariaPorIdOutputType;
import br.com.ibk.v1.contabancaria.RemoverContaBancariaInputType;
import br.com.ibk.v1.contabancaria.RemoverContaBancariaOutputType;
import br.com.ibk.v1.ebo.BancoType;
import br.com.ibk.v1.ebo.ClienteType;
import br.com.ibk.v1.ebo.ContaBancariaType;
import br.com.ibk.v1.ebo.ContaBancariaTypeArrayOf;

public class ContaBancariaServiceImpl implements ContaBancariaPortType{

	public ListarContaBancariaOutputType listarContaBancaria() throws ContabancariaFault {
		ListarContaBancariaOutputType out = new ListarContaBancariaOutputType();
		
		ContaBancariaTypeArrayOf arrayOf = new ContaBancariaTypeArrayOf();
		
		Collection<ContaBancariaType> contas = InMemoryDataSource.queryAll(ContaBancariaType.class);
		
		for (ContaBancariaType conta: contas) {
			removerReferencias(conta);
		}
		
		arrayOf.getContaBancaria().addAll(contas);
		
		out.setListaContabancaria(arrayOf);
		return out;
	}

	public AlterarContaBancariaOutputType alterarContaBancaria(AlterarContaBancariaInputType input) throws ContabancariaFault {
		AlterarContaBancariaOutputType out = new AlterarContaBancariaOutputType();
		InMemoryDataSource.update(ContaBancariaType.class, input.getContabancaria().getCodigo(), input.getContabancaria());
		out.setResultado(true);
		return out;
	}

	public RemoverContaBancariaOutputType removerContaBancaria(RemoverContaBancariaInputType input) throws ContabancariaFault {
		RemoverContaBancariaOutputType out = new RemoverContaBancariaOutputType();
		InMemoryDataSource.delete(ContaBancariaType.class, input.getId().intValue());
		out.setResultado(true);
		return out;
	}

	public InserirContaBancariaOutputType inserirContaBancaria(InserirContaBancariaInputType input) throws ContabancariaFault {
		InserirContaBancariaOutputType out = new InserirContaBancariaOutputType();
		InMemoryDataSource.add(ContaBancariaType.class, input.getContabancaria().getCodigo(), input.getContabancaria());
		out.setResultado(true);
		return out;
	}

	public ListarContaBancariaPorIdOutputType listarContaBancariaPorId(ListarContaBancariaPorIdInputType input) throws ContabancariaFault {
		ListarContaBancariaPorIdOutputType out = new ListarContaBancariaPorIdOutputType();
		
		ContaBancariaType conta = InMemoryDataSource.queryById(ContaBancariaType.class, input.getId().intValue());

		removerReferencias(conta);
		
		out.setContabancaria(conta);
		
		return out;
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
