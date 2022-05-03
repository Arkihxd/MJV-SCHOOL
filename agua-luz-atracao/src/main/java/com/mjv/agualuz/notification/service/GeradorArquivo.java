package com.mjv.agualuz.notification.service;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.format.DateTimeFormatter;
import java.util.List;

import com.mjv.agualuz.notification.model.Cadastro;
import com.mjv.agualuz.notification.model.Contrato;
import com.mjv.agualuz.notification.util.FormatadorUtil;
import com.mjv.agualuz.notification.util.TextoUtil;

public class GeradorArquivo {
	
	public void csv(List<Contrato> contratos) {
		StringBuilder sb = new StringBuilder();
		
		for(Contrato c: contratos) {
			Cadastro cad = c.getCliente();
			
			sb.append(cad.getCpf() + ";");
			sb.append(cad.getRg() + ";");
			sb.append(cad.getNome() + ";");
			sb.append(cad.getCelular() + ";");
			sb.append(cad.getEndereco().getLogradouro() + ";");
			sb.append(cad.getEndereco().getNumero() + ";");
			sb.append(cad.getEndereco().getComplemento() + ";");
			sb.append(cad.getEndereco().getBairro() + ";");
			sb.append(cad.getEndereco().getCidade() + ";");
			sb.append(cad.getEndereco().getEstado() + ";");
			sb.append(cad.getEndereco().getCep() + ";");
			sb.append(c.getCliente().getPais().getSigla()+ ";");
			sb.append(c.getNumeroProtocolo()+ ";");
			sb.append(c.getDataHora().toString()+ ";");
			sb.append(c.getServico().getSigla() + ";");
			sb.append(c.getValor().toString() + ";");
		}
		
		escreverArquivo(sb.toString().toUpperCase(), "agua-luz-contratos.csv");
		System.out.println(sb.toString().toUpperCase());
		
		
	}
	
	public void txt(List<Contrato> contratos) {
		StringBuilder sb = new StringBuilder();
		
		for(Contrato c: contratos) {			
			sb.append(TextoUtil.removerCaracteresEspeciais(c.getCliente().getCpf()));
			sb.append(TextoUtil.ajustar(c.getCliente().getRg(), 10));
			sb.append(TextoUtil.ajustar(c.getCliente().getNome(), 30));
			sb.append(TextoUtil.removerCaracteresEspeciais(c.getCliente().getCelular()));
			sb.append(TextoUtil.ajustar(c.getCliente().getEndereco().getLogradouro(), 20));
			sb.append(TextoUtil.completarZeros(Integer.valueOf(c.getCliente().getEndereco().getNumero()), 6));
			sb.append(TextoUtil.ajustar(c.getCliente().getEndereco().getComplemento(), 10));
			sb.append(TextoUtil.ajustar(c.getCliente().getEndereco().getBairro(), 10));
			sb.append(TextoUtil.ajustar(c.getCliente().getEndereco().getCidade(), 30));
			sb.append(TextoUtil.ajustar(c.getCliente().getEndereco().getEstado(), 2));
			String cep = TextoUtil.removerCaracteresEspeciais(c.getCliente().getEndereco().getCep());
			sb.append(TextoUtil.ajustar(cep, 8));
			sb.append(c.getCliente().getPais().getSigla());
			sb.append(TextoUtil.completarZeros(c.getNumeroProtocolo(), 10));
			sb.append(TextoUtil.removerCaracteresEspeciais(c.getDataHora().toString()));
			sb.append(c.getServico().getSigla());
			String valor = TextoUtil.removerCaracteresEspeciais(c.getValor().toString());
			valor = TextoUtil.completarZeros(Long.valueOf(valor), 8);
			sb.append(valor);
		}
		
		escreverArquivo(sb.toString().toUpperCase(), "agua-luz-contratos.txt");
		System.out.println(sb.toString().toUpperCase());
	}
	
	private void escreverArquivo(String conteudo, String nomeArquivo) {
		File dir = new File("agua-luz-output");
		
		if(dir.exists())
			dir.mkdirs();
		
		Path path = Paths.get(dir.getAbsolutePath(), nomeArquivo);

		try {
			Files.write(path, conteudo.getBytes(StandardCharsets.UTF_8));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
