package com.mjv.agualuz.notification.service;

import com.mjv.agualuz.notification.model.Cadastro;
import com.mjv.agualuz.notification.model.Contrato;
import com.mjv.agualuz.notification.model.Endereco;
import com.mjv.agualuz.notification.util.FormatadorUtil;

public class GeradorMensagem {
	public void gerar(Contrato contrato) {
		StringBuilder sb = new StringBuilder();
		Cadastro cliente = contrato.getCliente();
		
		String cpfFormatado = FormatadorUtil.formatarCpf(cliente.getCpf());
		
		//sb.append("Senhor(a) "+ cliente.getNome() + " cpf de número "+ cpfFormatado);.
		sb.append(String.format("Senhor(a) %s cpf de número %s, ", cliente.getNome(), cpfFormatado));
		sb.append(String.format("Informamos que conforme contrato com protocolo de número %d ", contrato.getNumeroProtocolo()));
		
		String data = FormatadorUtil.formatadorData(contrato.getDataHora());
		String hora = FormatadorUtil.formatadorHora(contrato.getDataHora());
		
		sb.append(String.format("está agendado para a data\\hora %s %sh ", data, hora));
		sb.append(String.format("a instalação do serviço de %s com taxa de valor R$ %.2f em sua residência localizada no endereço abaixo:\n", contrato.getServico(), contrato.getValor()));
		
		Endereco endereco = cliente.getEndereco();
		
		sb.append(String.format("Logradouro: %s\n", endereco.getLogradouro()));
		sb.append(String.format("Complemento: %s\n", endereco.getComplemento()));
		sb.append(String.format("Bairro: %s\n", endereco.getBairro()));
		sb.append(String.format("Cidade: %s\n", endereco.getCidade()));
		sb.append(String.format("Cep: %s\n", endereco.getCep()));
		
		System.out.println(sb.toString());
	}

}
