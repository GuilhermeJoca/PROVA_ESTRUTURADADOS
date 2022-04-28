package exercicio3;

public class Main {
	public static void main(String[] args) {
		
		Lista lista = new Lista();
		
		// inserção dos elementos na lista
		lista.inserir(1);
		lista.inserir(2);
		lista.inserir(3);
		lista.inserir(4);
		lista.inserir(5);
		
		// inverte os elementos da lista
		inverter(lista);
		
		// imprime os elementos da lista
		lista.imprimir();
	}
	
	public static void inverter(Lista lista) {
		No aux = lista.inicio;
		No aut;
		
		while(aux != null) {
			if(aux == lista.inicio){
				aux.esq = aux.dir;
				aux.dir = null;
				aux = aux.esq; 
			} else if(aux != lista.fim){
				aut = aux.esq;
				aux.esq = aux.dir;
				aux.dir = aut;
				aux = aux.esq;
			} else {
				aux.dir = aux.esq;
				aux.esq = null;
				break;
			}
		}
		aut = lista.inicio;
		lista.inicio = lista.fim;
		lista.fim = aut;
	}
}
