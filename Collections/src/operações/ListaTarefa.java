package operações;

import java.util.ArrayList;
import java.util.List;

public class ListaTarefa {
	// Atributo para armazenar uma lista de objetos da classe Tarefa
	private List<Tarefa> tarefaList;

	// Construtor da classe ListaTarefa
	public ListaTarefa() {
		this.tarefaList = new ArrayList<>(); // Inicialização da lista de tarefas como uma ArrayList vazia
	}

	// Método para adicionar uma nova tarefa à lista
	public void adcionarTarefa(String descricao) {
		tarefaList.add(new Tarefa(descricao)); // Método para adicionar uma nova tarefa à lista
	}

	// Método para remover uma tarefa da lista com base em sua descrição
	public void removerTarefa(String descricao) {
		List<Tarefa> tarefaParaRemover = new ArrayList<Tarefa>(); // Cria uma nova lista para armazenar temporariamente
																	// as tarefas a serem removidas
		for (Tarefa t : tarefaList) { // Itera sobre todas as tarefas na lista
			if (t.getDescricao().equalsIgnoreCase(descricao)) { // Verifica se a descrição da tarefa corresponde à
																// descrição fornecida (ignorando maiúsculas e
																// minúsculas)
			
				tarefaParaRemover.add(t); // Adiciona a tarefa à lista de tarefas a serem removidas
			}

		}
		tarefaList.removeAll(tarefaParaRemover); // Remove todas as tarefas armazenadas na lista temporária da lista
													// principal de tarefas
	}

	// Método para obter o número total de tarefas na lista
	public int obterNumeroTotalTarefas(int descricao) {
		return tarefaList.size(); // size retorna a quantidade de elementos dentro da List
	}

	// Método para imprimir todas as descrições das tarefas na list
	public void obterDescricoesTarefas() {
		System.out.println(tarefaList); // Imprime a lista de tarefas, que chama o método toString() de cada objeto
										// Tarefa na lista
	}

}