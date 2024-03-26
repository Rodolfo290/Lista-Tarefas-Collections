package aplicação;

import operações.ListaTarefa;

public class Main {

	public static void main(String[] args) {
	
		// Cria uma instância da classe ListaTarefa
		ListaTarefa listaTarefa = new ListaTarefa();
	
		// Exibe o número total de elementos na lista (deve ser 0 inicialmente)
		System.out.printf("O número total de elementos na lista é: %d%n", listaTarefa.obterNumeroTotalTarefas(0));
		
		
		// Adiciona algumas tarefas à lista
		listaTarefa.adcionarTarefa("tarefa 1");
		listaTarefa.adcionarTarefa("tarefa 2");
		listaTarefa.adcionarTarefa("tarefa 2");
		
		  // Remove uma tarefa da lista
		System.out.printf("O número total de elementos na lista é: %d%n", listaTarefa.obterNumeroTotalTarefas(0));

		  // Remove uma tarefa da lista
		listaTarefa.removerTarefa("Tarefa 1");
		
		// Exibe o número total de elementos na lista após remover uma tarefa
		System.out.printf("O número total de elementos na lista é: %d%n", listaTarefa.obterNumeroTotalTarefas(0));

		// Exibe as descrições das tarefas na lista
		listaTarefa.obterDescricoesTarefas();
		
	
	
	
	}

	
}
