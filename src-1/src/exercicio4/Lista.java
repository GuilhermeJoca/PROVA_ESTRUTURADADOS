package exercicio4;

public class Lista {
	No inicio;
	No fim;
	
	// método para inserir um elemento na lista.
	// a inserção deve manter a lista ordenada (ordem crescente)
	public void inserir(int dado) {
		No aux = new No(dado);
		No aux2 = inicio;

		if(inicio == null){//sem elemento
			inicio = aux;
			fim = aux;
		} else {//> 1 elemento
			if(aux.dado >= fim.dado){ //maior ou igual que o ultimo
				fim.dir = aux;
				aux.esq = fim;
				fim = aux;
			} else if (aux.dado < inicio.dado) {//menor que o primeiro
				inicio.esq = aux;
				aux.dir = inicio;
				inicio = aux;
			} else {
				while(aux2 != null){ //entre 2 elementos
					if (aux.dado <= aux2.dir.dado && aux.dado >= aux2.dado){
						aux.esq = aux2;
						aux2.dir.esq = aux;
						aux.dir = aux2.dir;
						aux2.dir = aux;
						break;
					}
					aux2 = aux2.dir;
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
