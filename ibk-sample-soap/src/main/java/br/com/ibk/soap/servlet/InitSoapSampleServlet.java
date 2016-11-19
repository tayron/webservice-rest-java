package br.com.ibk.soap.servlet;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;

import br.com.ibk.ds.memory.InMemoryDataSource;
import br.com.ibk.v1.ebo.BancoType;
import br.com.ibk.v1.ebo.ClienteType;
import br.com.ibk.v1.ebo.ContaBancariaType;
import br.com.ibk.v1.ebo.EnderecoType;
import br.com.ibk.v1.enumeration.EstadoCivilType;
import br.com.ibk.v1.enumeration.SexoEnumType;
import br.com.ibk.v1.enumeration.UfEnumType;

public class InitSoapSampleServlet extends HttpServlet{
	
	@Override
	public void init(ServletConfig config) throws ServletException {
		super.init(config);

		try {
			InMemoryDataSource.registerTable(BancoType.class);
			InMemoryDataSource.registerTable(ContaBancariaType.class);
			InMemoryDataSource.registerTable(ClienteType.class);
			InMemoryDataSource.registerTable(EnderecoType.class);

			createBanco();
			createEndereco();
			createCliente();
			createConta();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	private void createConta() {
		ContaBancariaType conta1 = new ContaBancariaType();
		conta1.setCodigo(1);
		conta1.setBanco(InMemoryDataSource.queryById(BancoType.class, 1));
		conta1.setNumeroConta("1234");
		conta1.setDigitoVerificadorConta("5");
		conta1.setNumeroAgencia("6789");
		conta1.setDigitoVerificadorAgencia("0");
		conta1.setCliente(InMemoryDataSource.queryById(ClienteType.class, 1));
		conta1.setSaldo(1000);
		
		ContaBancariaType conta2 = new ContaBancariaType();
		conta2.setCodigo(2);
		conta2.setBanco(InMemoryDataSource.queryById(BancoType.class, 33));
		conta2.setNumeroConta("0987");
		conta2.setDigitoVerificadorConta("6");
		conta2.setNumeroAgencia("54321");
		conta2.setDigitoVerificadorAgencia("0");
		conta2.setCliente(InMemoryDataSource.queryById(ClienteType.class, 2));
		conta2.setSaldo(9000);
		
		InMemoryDataSource.add(ContaBancariaType.class, conta1.getCodigo(), conta1);
		InMemoryDataSource.add(ContaBancariaType.class, conta2.getCodigo(), conta2);
		
	}
	
	private void createCliente() throws Exception{
		ClienteType cliente1 = new ClienteType();
		cliente1.setCodigo(1);
		cliente1.setCpf("12345678901");
		cliente1.setNome("Fulano da Silva");
		XMLGregorianCalendar date1 = DatatypeFactory.newInstance().newXMLGregorianCalendar(1970, 8, 15, 0, 0, 0, 0, 0);
		cliente1.setDataNascimento(date1);
		cliente1.setEmail("fulano@gmail.com");
		cliente1.setDocumentoIdentidade("30304040");
		cliente1.setEndereco(InMemoryDataSource.queryById(EnderecoType.class, 1));
		cliente1.setEstadoCivil(EstadoCivilType.SOLTEIRO);
		cliente1.setNacionalidade("Brasileiro");
		cliente1.setProfissao("Analista de Sistemas");
		cliente1.setSexo(SexoEnumType.MASCULINO);
		cliente1.setSiglaOrgaoExpedidor("SSP");
		
		ClienteType cliente2 = new ClienteType();
		cliente2.setCodigo(2);
		cliente2.setCpf("09876543211");
		cliente2.setNome("Maria Joaquina");
		XMLGregorianCalendar date2 = DatatypeFactory.newInstance().newXMLGregorianCalendar(1980, 10, 25, 0, 0, 0, 0, 0);
		cliente2.setDataNascimento(date2);
		cliente2.setEmail("mjoaquina@gmail.com");
		cliente2.setDocumentoIdentidade("50506060");
		cliente2.setEndereco(InMemoryDataSource.queryById(EnderecoType.class, 2));
		cliente2.setEstadoCivil(EstadoCivilType.CASADO);
		cliente2.setNacionalidade("Brasileiro");
		cliente2.setProfissao("Advigada");
		cliente2.setSexo(SexoEnumType.FEMININO);
		cliente2.setSiglaOrgaoExpedidor("SSP");
		
		InMemoryDataSource.add(ClienteType.class, cliente1.getCodigo(), cliente1);
		InMemoryDataSource.add(ClienteType.class, cliente2.getCodigo(), cliente2);
	}
	
	
	private void createEndereco() {
		EnderecoType end1 = new EnderecoType();
		end1.setCodigo(1);
		end1.setNomeLogradouro("Rua Sem Nome");
		end1.setNumeroLogradouro("173");
		end1.setUf(UfEnumType.MG);
		end1.setMunicipio("Belo Horizonte");
		end1.setCep("31403-403");
		
		EnderecoType end2 = new EnderecoType();
		end2.setCodigo(2);
		end2.setNomeLogradouro("Rua Fim dos Tempos ");
		end2.setNumeroLogradouro("689");
		end2.setUf(UfEnumType.MG);
		end2.setMunicipio("Belo Horizonte");
		end2.setCep("31172-172");
		
		InMemoryDataSource.add(EnderecoType.class, end1.getCodigo(), end1);
		InMemoryDataSource.add(EnderecoType.class, end2.getCodigo(), end2);
	}
	
	private void createBanco() {
		BancoType banco1 = new BancoType();
		banco1.setCodigo(1);
		banco1.setNome("Banco do Brasil");
		
		BancoType banco2 = new BancoType();
		banco2.setCodigo(33);
		banco2.setNome("Santander");
		
		InMemoryDataSource.add(BancoType.class, banco1.getCodigo(), banco1);
		InMemoryDataSource.add(BancoType.class, banco2.getCodigo(), banco2);
		
	}
	
	
}
