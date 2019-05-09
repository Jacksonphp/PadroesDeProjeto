package br.ifpi.especializacao.gof.padroes.Tes;

public class EmissorEmail implements Emissor {

	@Override
	public void enviar(String mensagem) {
		System.out.println("Enviado por email a menssagem:" + mensagem);
	}
 
}
