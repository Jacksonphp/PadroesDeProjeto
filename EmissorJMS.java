package br.ifpi.especializacao.gof.padroes.Tes;

public class EmissorJMS implements Emissor {

	@Override
	public void enviar(String mensagem) {
		System.out.println("Enviado por JMS a menssagem:" + mensagem);
	}
  
}
