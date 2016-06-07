package decorator;

import model.EventModel;

public class AbonoAnual extends EventDecorator{
	
	public AbonoAnual(EventModel event){
		super(event);
		
		event.setNomeEvento(nomeEvento="Abono Inicial");
		event.setDataInicial(dataInicial);
		//dataFinal.add(dataInicial.DAY_OF_MONTH, 1);
		event.setDataFinal(dataFinal);
		event.setObservacao(observacao);
	}

}
