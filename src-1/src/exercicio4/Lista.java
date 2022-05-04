package exercicio4;

public class Lista {
	No inicio;
	No fim;
	
	// método para inserir um elemento na lista.
	// a inserção deve manter a lista ordenada (ordem crescente)
	public void inserir(int dado) {
		No aux = new No(dado);
		No auz = inicio;

		if(inicio == null){ // sem elemento
			inicio = aux;
			fim = aux;
		} else { // > 1 elemento
			if(aux.dado < inicio.dado){ // maior ou igual que o ultimo
				inicio.esq = aux;
				aux.dir = inicio;
				inicio = aux;
			} else if (aux.dado >= fim.dado) { // menor que o primeiro
				fim.dir = aux;
				aux.esq = fim;
				fim = aux;
			} else {
				while(auz != null){ // entre 2 elementos
					if (aux.dado >= auz.dado && aux.dado <= auz.dir.dado){
						aux.esq = auz;
						auz.dir.esq = aux;
						aux.dir = auz.dir;
						auz.dir = aux;
						
						break;
					}
					auz = auz.dir;
				}
				
			}
		}
	}
	
	// método para imprimir os elementos da lista
	public void imprimir() {
		No aux = inicio;
		while(aux != null) {
			System.out.println(aux.dado);
			aux = aux.dir;
		}
	}
}
