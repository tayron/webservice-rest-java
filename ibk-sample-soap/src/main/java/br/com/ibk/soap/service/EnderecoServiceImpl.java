package br.com.ibk.soap.service;

import br.com.ibk.ds.memory.InMemoryDataSource;
import br.com.ibk.v1.ebo.EnderecoType;
import br.com.ibk.v1.ebo.EnderecoTypeArrayOf;
import br.com.ibk.v1.endereco.AlterarEnderecoInputType;
import br.com.ibk.v1.endereco.AlterarEnderecoOutputType;
import br.com.ibk.v1.endereco.EnderecoFault;
import br.com.ibk.v1.endereco.EnderecoPortType;
import br.com.ibk.v1.endereco.InserirEnderecoInputType;
import br.com.ibk.v1.endereco.InserirEnderecoOutputType;
import br.com.ibk.v1.endereco.ListarEnderecoOutputType;
import br.com.ibk.v1.endereco.ListarEnderecoPorIdInputType;
import br.com.ibk.v1.endereco.ListarEnderecoPorIdOutputType;
import br.com.ibk.v1.endereco.RemoverEnderecoInputType;
import br.com.ibk.v1.endereco.RemoverEnderecoOutputType;

public class EnderecoServiceImpl implements EnderecoPortType{

	public ListarEnderecoOutputType listarEndereco() throws EnderecoFault {
		ListarEnderecoOutputType out = new ListarEnderecoOutputType();
		
		EnderecoTypeArrayOf arrayOf = new EnderecoTypeArrayOf();
		arrayOf.getEndereco().addAll(InMemoryDataSource.queryAll(EnderecoType.class));
		
		out.setListaEndereco(arrayOf);
		return out;
	}

	public AlterarEnderecoOutputType alterarEndereco(AlterarEnderecoInputType input) throws EnderecoFault {
		AlterarEnderecoOutputType out = new AlterarEnderecoOutputType();
		InMemoryDataSource.update(EnderecoType.class, input.getEndereco().getCodigo(), input.getEndereco());
		out.setResultado(true);
		return out;
	}

	public RemoverEnderecoOutputType removerEndereco(RemoverEnderecoInputType input) throws EnderecoFault {
		RemoverEnderecoOutputType out = new RemoverEnderecoOutputType();
		InMemoryDataSource.delete(EnderecoType.class, input.getId().intValue());
		out.setResultado(true);
		return out;
	}

	public InserirEnderecoOutputType inserirEndereco(InserirEnderecoInputType input) throws EnderecoFault {
		InserirEnderecoOutputType out = new InserirEnderecoOutputType();
		InMemoryDataSource.add(EnderecoType.class, input.getEndereco().getCodigo(), input.getEndereco());
		out.setResultado(true);
		return out;
	}

	public ListarEnderecoPorIdOutputType listarEnderecoPorId(ListarEnderecoPorIdInputType input) throws EnderecoFault {
		ListarEnderecoPorIdOutputType out = new ListarEnderecoPorIdOutputType();
		out.setEndereco(InMemoryDataSource.queryById(EnderecoType.class, input.getId().intValue()));
		return out;
	}
	
}
