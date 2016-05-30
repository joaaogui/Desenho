package decorator;

import model.EventModel;

public class AdicionalNoturnoAdministrativo extends EventDecorator{
	
	public AdicionalNoturnoAdministrativo(EventModel event){
		super(event);
		
		event.setNomeEvento(nomeEvento="Adicional Noturno Administrativo");
		event.setDataInicial(dataInicial);
		event.setDataFinal(dataFinal);
		event.setObservacao(observacao);
	}

}
