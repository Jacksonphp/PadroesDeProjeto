package br.ifpi.especializacao.gof.padroes.Tes;

public class EmissorSMS implements Emissor {

	@Override
	public void enviar(String mensagem) {
		System.out.println("Enviado por SMS a menssagem:" + mensagem);
	}

}
