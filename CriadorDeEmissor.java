package br.ifpi.especializacao.gof.padroes;

public class CriadorDeEmissor {
	
	protected static final int SMS = 0;
	protected static final int EMAIL = 1;
	protected static final int JMS = 2;
	
	public Emissor criar(int emissorTipo){
		switch (emissorTipo) {
		case CriadorDeEmissor.SMS:
			return new EmissorSMS();
		case CriadorDeEmissor.EMAIL:
			return new EmissorEmail();
		case CriadorDeEmissor.JMS:
			return new EmissorJMS();
				default:
		throw new IllegalArgumentException("Tipo de emissor não suportado!");
		}		
	}

}
