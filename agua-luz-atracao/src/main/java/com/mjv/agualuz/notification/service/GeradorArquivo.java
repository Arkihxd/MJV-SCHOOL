package com.mjv.agualuz.notification.service;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

import com.mjv.agualuz.notification.model.Cadastro;
import com.mjv.agualuz.notification.model.Contrato;

public class GeradorArquivo {
	
	public void csv(List<Contrato> contratos) {
		StringBuilder sb = new StringBuilder();
		
		for(Contrato c: contratos) {
			Cadastro cad = c.getCliente();
			
			sb.append(cad.getCpf() + ";");
			sb.append(cad.getRg() + ";");
			sb.append(cad.getNome() + ";");
		}
		
		escreverArquivo(sb.toString(), "agua-luz-contratos.csv");
		System.out.println(sb.toString());
		
		
	}
	
	public void txt(List<Contrato> contratos) {
		StringBuilder sb = new StringBuilder();
		
		for(Contrato c: contratos) {
			Cadastro cad = c.getCliente();
			//formatar os campos
			sb.append(cad.getCpf());
			sb.append(cad.getRg());
			sb.append(cad.getNome());
		}
		
		escreverArquivo(sb.toString(), "agua-luz-contratos.txt");
		System.out.println(sb.toString());
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
