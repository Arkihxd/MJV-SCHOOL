package com.mjv.agualuz.notification.repository;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import com.mjv.agualuz.notification.model.Cadastro;
import com.mjv.agualuz.notification.model.Contrato;
import com.mjv.agualuz.notification.model.Endereco;
import com.mjv.agualuz.notification.model.Pais;
import com.mjv.agualuz.notification.model.Servico;

public class ContratoRepository {
	private List<Contrato> contratos = new ArrayList<Contrato>();
	
	public void insert(Contrato contrato) {
		contratos.add(contrato);
	}
	
	public List<Contrato> listar() {
		Contrato contrato = new Contrato();
		contrato.setDataHora(LocalDateTime.of(2022, 2, 21, 16, 0));
		contrato.setNumeroProtocolo(2022025687L);
		contrato.setServico(Servico.AGUA);
		
		Cadastro cliente = new Cadastro();
		cliente.setCpf("23476598727");
		cliente.setNome("Gleyson Sampaio");
		cliente.setRg("33765-5");
		cliente.setPais(Pais.BRASIL);

		contrato.setCliente(cliente);
		
		Endereco endereco = new Endereco();
		endereco.setLogradouro("Rua das Marias, 243");
		endereco.setComplemento("Ap 207, Bloco C");
		endereco.setBairro("Santo Antonio");
		endereco.setCidade("São Paulo / SP");
		endereco.setCep("27.310-657");
		cliente.setEndereco(endereco);
		
		contratos.add(contrato);
		return contratos;
	}
}
