package com.asandrob.util.io;


import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class Util {
	
	List<String> retorno = new ArrayList<>();
	
	public List<String> listaArquivos(String root, String extensao) throws IllegalArgumentException {
		File diretorioRaiz = new File(root);
		if (diretorioRaiz.exists() || diretorioRaiz.isDirectory()) {
			pegaArquivo(diretorioRaiz, extensao);
		} else {
			throw new IllegalArgumentException("parametro root não é um diretório");
		}
		return retorno;
	}

	private void pegaArquivo(File no, String extensao) {
		if (no.isDirectory()) {
			String[] subNote = no.list();
			for (String filename : subNote) {
				pegaArquivo(new File(no, filename), extensao);
			}
		}
		if (no.getAbsolutePath().toLowerCase().endsWith(extensao.toLowerCase()) &&
			!new File(no.getAbsolutePath()).isDirectory())
			retorno.add(no.getAbsolutePath());
	}
}