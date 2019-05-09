package br.ifpi.especializacao.gof.padroes.Tes;

public interface CriadorDeEmissor {
 
	 static final int SMS = 0;
	 static final int EMAIL = 1;
	 static final int JMS = 2;
	 
	 public Emissor criar(int emissorTipo);
	
}
