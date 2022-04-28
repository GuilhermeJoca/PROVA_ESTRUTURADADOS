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
		No auxInv = lista.inicio;
		No aut;
		
		while(auxInv != null) {
			if(auxInv == lista.inicio){
					auxInv.esq = auxInv.dir;
					auxInv.dir = null;
					auxInv = auxInv.esq; 
			} else if(auxInv != lista.fim){
					aut = auxInv.esq;
					auxInv.esq = auxInv.dir;
					auxInv.dir = aut;
					auxInv = auxInv.esq;
			} else {
					auxInv.dir = auxInv.esq;
					auxInv.esq = null;
						
				break;
			}
		}
		aut = lista.inicio;
		lista.inicio = lista.fim;
		lista.fim = aut;
	}
}
