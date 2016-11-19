package br.com.ibk.soap.service;

import br.com.ibk.ds.memory.InMemoryDataSource;
import br.com.ibk.v1.banco.AlterarBancoInputType;
import br.com.ibk.v1.banco.AlterarBancoOutputType;
import br.com.ibk.v1.banco.BancoFault;
import br.com.ibk.v1.banco.BancoPortType;
import br.com.ibk.v1.banco.InserirBancoInputType;
import br.com.ibk.v1.banco.InserirBancoOutputType;
import br.com.ibk.v1.banco.ListarBancoOutputType;
import br.com.ibk.v1.banco.ListarBancoPorIdInputType;
import br.com.ibk.v1.banco.ListarBancoPorIdOutputType;
import br.com.ibk.v1.banco.RemoverBancoInputType;
import br.com.ibk.v1.banco.RemoverBancoOutputType;
import br.com.ibk.v1.ebo.BancoType;
import br.com.ibk.v1.ebo.BancoTypeArrayOf;

public class BancoServiceImpl implements BancoPortType{

	public ListarBancoOutputType listarBanco() throws BancoFault {
		ListarBancoOutputType out = new ListarBancoOutputType();
		
		BancoTypeArrayOf arrayOf = new BancoTypeArrayOf();
		arrayOf.getBanco().addAll(InMemoryDataSource.queryAll(BancoType.class));
		
		out.setListaBanco(arrayOf);
		return out;
	}

	public AlterarBancoOutputType alterarBanco(AlterarBancoInputType input) throws BancoFault {
		AlterarBancoOutputType out = new AlterarBancoOutputType();
		InMemoryDataSource.update(BancoType.class, input.getBanco().getCodigo(), input.getBanco());
		out.setResultado(true);
		return out;
	}

	public RemoverBancoOutputType removerBanco(RemoverBancoInputType input) throws BancoFault {
		RemoverBancoOutputType out = new RemoverBancoOutputType();
		InMemoryDataSource.delete(BancoType.class, input.getId().intValue());
		out.setResultado(true);
		return out;
	}

	public InserirBancoOutputType inserirBanco(InserirBancoInputType input) throws BancoFault {
		InserirBancoOutputType out = new InserirBancoOutputType();
		InMemoryDataSource.add(BancoType.class, input.getBanco().getCodigo(), input.getBanco());
		out.setResultado(true);
		return out;
	}

	public ListarBancoPorIdOutputType listarBancoPorId(ListarBancoPorIdInputType input) throws BancoFault {
		ListarBancoPorIdOutputType out = new ListarBancoPorIdOutputType();
		out.setBanco(InMemoryDataSource.queryById(BancoType.class, input.getId().intValue()));
		return out;
	}
	
}
