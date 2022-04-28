package exercicio4;

public class Lista {
	No inicio;
	No fim;
	
	// método para inserir um elemento na lista.
	// a inserção deve manter a lista ordenada (ordem crescente)
	public void inserir(int dado) {
		No auxInserir = new No(dado);
		
		No aut = inicio;

		if(inicio == null){
			inicio = auxInserir;
			fim = auxInserir;
		} else if (inicio == fim){
			if(auxInserir.dado > fim.dado){ 
				fim.dir = auxInserir;
				auxInserir.esq = fim;
				fim = auxInserir;
			} else { 
				fim.esq = auxInserir;
				auxInserir.dir = fim;
				inicio = auxInserir;
			}
		} else {
			if(auxInserir.dado > fim.dado){ 
				fim.dir = auxInserir;
				auxInserir.esq = fim;
				fim = auxInserir;
			} else if (auxInserir.dado < inicio.dado) {
				inicio.esq = auxInserir;
				auxInserir.dir = inicio;
				inicio = auxInserir;
			} else {
				while(aut != null){
					if (auxInserir.dado <= aut.dir.dado && auxInserir.dado >= aut.dado){
						auxInserir.esq = aut;
						aut.dir.esq = auxInserir;
						auxInserir.dir = aut.dir;
						aut.dir = auxInserir;
						break;
					}
					aut = aut.dir;
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
