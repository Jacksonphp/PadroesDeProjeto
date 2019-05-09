package br.ifpi.especializacao.gof.padroes.Tes;

public class CriadorDeEmissorSync implements CriadorDeEmissor {

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
