import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Vertice> conjuntoV = new ArrayList<>();
		ArrayList<Aresta> conjuntoE = new ArrayList<>();
		
		// /*
		int op = 0 ;
		 //Inserção de daods manual
		while(op!=2) {
			
			Vertice v = new Vertice();
			v.label = JOptionPane.showInputDialog("Insira o label do vertice:");
			v.distancia = 999999999;
			conjuntoV.add(v);
			
			op = Integer.parseInt(JOptionPane.showInputDialog("Deseja continuar inserindo vertices? \n1 - SIM \n2 - NÃO"));
			
		}
		
		op = 0;
		
		while(op!=2) {
			
			Aresta a = new Aresta();
			
			String verticeO = JOptionPane.showInputDialog("Insira o vertice origem:");
			String verticeD = JOptionPane.showInputDialog("Insira o vertice destino:");
			Vertice adjO = new Vertice();
			Vertice adjD = new Vertice();
			
			for(int i=0;i<conjuntoV.size();i++) {
				if(conjuntoV.get(i).label.equals(verticeO)) {
					a.origem = conjuntoV.get(i);
					adjD = conjuntoV.get(i);
					
				}else {
					if(conjuntoV.get(i).label.equals(verticeD)) {
						a.destino = conjuntoV.get(i);
						adjO = conjuntoV.get(i);
					}
				}
			}
			
			for(int i=0;i<conjuntoV.size();i++) {
				if(conjuntoV.get(i).label.equals(verticeO)) {
					conjuntoV.get(i).adj.add(adjO);
				}else {
					if(conjuntoV.get(i).label.equals(verticeD)) {
						conjuntoV.get(i).adj.add(adjD);
					}
				}
			}
				
			a.distancia = (Integer.parseInt(JOptionPane.showInputDialog("Insira a distância da aresta:")));
			
			conjuntoE.add(a);
			
			op = Integer.parseInt(JOptionPane.showInputDialog("Deseja continuar inserindo vertices? \n1 - SIM \n2 - NÃO"));
			
		}
		// */
		
		/* TESTE PARA O ALGORITMO - Dados já inseridos
		Vertice v1 = new Vertice();
		v1.label = "b";
		v1.distancia = 999999999;
		
		Vertice v2 = new Vertice();
		v2.label = "c";
		v2.distancia = 999999999;

		Vertice v3 = new Vertice();
		v3.label = "d";
		v3.distancia = 999999999;
		
		Vertice v4 = new Vertice();
		v4.label = "e";
		v4.distancia = 999999999;
		
		Vertice v5 = new Vertice();
		v5.label = "f";
		v5.distancia = 999999999;
		
		Vertice v6 = new Vertice();
		v6.label = "g";
		v6.distancia = 999999999;
		
		Vertice v7 = new Vertice();
		v7.label = "h";
		v7.distancia = 999999999;
		
		Vertice v8 = new Vertice();
		v8.label = "i";
		v8.distancia = 999999999;
		
		Vertice v0 = new Vertice();
		v0.label = "a";
		v0.distancia = 999999999;
		
		conjuntoV.add(v0);
		conjuntoV.add(v1);
		conjuntoV.add(v2);
		conjuntoV.add(v3);
		conjuntoV.add(v4);
		conjuntoV.add(v5);
		conjuntoV.add(v6);
		conjuntoV.add(v7);
		conjuntoV.add(v8);
		
		Aresta a1 = new Aresta();
		a1.origem = v0;
		a1.destino = v1;
		a1.distancia = 4;
		v0.adj.add(v1);
		v1.adj.add(v0);
		conjuntoE.add(a1);
		
		Aresta a2 = new Aresta();
		a2.origem = v0;
		a2.destino = v7;
		a2.distancia = 8;
		v0.adj.add(v7);
		v7.adj.add(v0);
		conjuntoE.add(a2);
		
		Aresta a3 = new Aresta();
		a3.origem = v1;
		a3.destino = v2;
		a3.distancia = 8;
		v1.adj.add(v2);
		v2.adj.add(v1);
		conjuntoE.add(a3);
		
		Aresta a4 = new Aresta();
		a4.origem = v1;
		a4.destino = v7;
		a4.distancia = 11;
		v1.adj.add(v7);
		v7.adj.add(v1);
		conjuntoE.add(a4);
		
		Aresta a5 = new Aresta();
		a5.origem = v2;
		a5.destino = v3;
		a5.distancia = 7;
		v2.adj.add(v3);
		v3.adj.add(v2);
		conjuntoE.add(a5);
		
		Aresta a6 = new Aresta();
		a6.origem = v2;
		a6.destino = v5;
		a6.distancia = 4;
		v2.adj.add(v5);
		v5.adj.add(v2);
		conjuntoE.add(a6);
		
		Aresta a7 = new Aresta();
		a7.origem = v2;
		a7.destino = v8;
		a7.distancia = 2;
		v2.adj.add(v8);
		v8.adj.add(v2);
		conjuntoE.add(a7);
		
		Aresta a8 = new Aresta();
		a8.origem = v3;
		a8.destino = v4;
		a8.distancia = 9;
		v3.adj.add(v4);
		v4.adj.add(v3);
		conjuntoE.add(a8);
		
		Aresta a9 = new Aresta();
		a9.origem = v3;
		a9.destino = v5;
		a9.distancia = 14;
		v3.adj.add(v5);
		v5.adj.add(v3);
		conjuntoE.add(a9);
		
		Aresta a10 = new Aresta();
		a10.origem = v4;
		a10.destino = v5;
		a10.distancia = 10;
		v4.adj.add(v5);
		v5.adj.add(v4);
		conjuntoE.add(a10);
		
		Aresta a11 = new Aresta();
		a11.origem = v5;
		a11.destino = v6;
		a11.distancia = 2;
		v5.adj.add(v6);
		v6.adj.add(v5);
		conjuntoE.add(a11);
		
		Aresta a13 = new Aresta();
		a13.origem = v6;
		a13.destino = v7;
		a13.distancia = 1;
		v6.adj.add(v7);
		v7.adj.add(v6);
		conjuntoE.add(a13);
		
		Aresta a14 = new Aresta();
		a14.origem = v6;
		a14.destino = v8;
		a14.distancia = 6;
		v6.adj.add(v8);
		v8.adj.add(v6);
		conjuntoE.add(a14);
		
		Aresta a15 = new Aresta();
		a15.origem = v7;
		a15.destino = v8;
		a15.distancia = 7;
		v7.adj.add(v8);
		v8.adj.add(v7);
		conjuntoE.add(a15);
		*/
		
		String verticeO = JOptionPane.showInputDialog("Insira o vertice origem para a montagem da árvore geradora:");
		
		for(int i=0;i<conjuntoV.size();i++) {
			if(conjuntoV.get(i).label.equals(verticeO)) {

				conjuntoV.get(i).distancia = 0;
			}
		}
		
		JOptionPane.showMessageDialog(null, prim_Jarnik(conjuntoV, conjuntoE));
	}
	
	
	static public String prim_Jarnik(ArrayList<Vertice> conjuntoV,ArrayList<Aresta> conjuntoE) {
		
		ArrayList<Vertice> verticesArvoreGeradora = new ArrayList<>();
		ArrayList<Vertice> aux = new ArrayList<>();
		//String arestasArvoreGeradora = "Arestas da árvore geradora - ";
		
		aux  = conjuntoV;
		int cont = conjuntoV.size();
		
		while(verticesArvoreGeradora.size()<cont) {
			
			Vertice u = new Vertice();
			u = menorValor(aux); // Pega o vertice de menor distância
			boolean verf = false;
			
			if(verticesArvoreGeradora.size() > 0) { //se a lista de vertices da árvore geradora NÃO estiver vazia
				
				for(int i=0;i<verticesArvoreGeradora.size();i++) { // verifica se o vertice já foi adicionado a árvore 
					if(u == verticesArvoreGeradora.get(i)) {
						verf = true;
					}
				}
				
				if(verf == false) { //Caso a lista da árvore geradora não esteja vazia e o vertice também não está inserido nela
					verticesArvoreGeradora.add(u); // adiciona o vertice a lista de vertices da arvore
				
					for(int i=0;i<u.adj.size();i++) {
						
						boolean verfADJ = false;
						
						for(int j=0;j<verticesArvoreGeradora.size();j++) { // Procura pelo vertice adjacente na árvore 
							if(u.adj.get(i)==verticesArvoreGeradora.get(j)) { // caso o vertice adjacente já esteja na árvore
								verfADJ = true;
							}
						}
					
						if(verfADJ == false) { // verifica se o vertice adjacente já foi adicionado a árvore 
							
							int dist_uv = dist_between(u, u.adj.get(i), conjuntoE); //distância da aresta entre (u,v)
						
							if(dist_uv < u.adj.get(i).distancia) { //se o valor da aresta for menor que o valor anterior de v
								u.adj.get(i).distancia = dist_uv;
							}
						}
					}
				}
			}else { //se a lista de vertices da árvore geradora ESTIVER VAZIA 
				if(verticesArvoreGeradora.size() == 0) {
					verticesArvoreGeradora.add(u); // não há necessidade de verificar se o vertice já existe na lista pois ela está vazia, apenas joga o vertice para a lista
				
					for(int i=0;i<u.adj.size();i++) { //procura pelos adjacentes na lista de adjacentes do vertice u
		
						int dist_uv = dist_between(u, u.adj.get(i), conjuntoE); //distância da aresta entre (u,v)
			
						if(dist_uv < u.adj.get(i).distancia) { //se o valor da aresta for menor que o valor anterior de v
							u.adj.get(i).distancia = dist_uv;
						}
					}
				}
			}
		}
		
		//Resultados de caminho e custo da árvore geradora
		
		String caminho = "Caminho - ";
		String distancias = "Distâncias - ";
		int custo = 0;
		
		for(int i=0; i<verticesArvoreGeradora.size();i++) {
			custo += verticesArvoreGeradora.get(i).distancia;
			caminho += verticesArvoreGeradora.get(i).label + " ";
			distancias += verticesArvoreGeradora.get(i).distancia + " ";
		}
		
		return "O custo da árvore é " + custo + " unidades\n" + caminho + "\n" + distancias;
	}

	static public Vertice menorValor(ArrayList<Vertice> conjuntoAux) { //retornar o vertice de menor distância
		
		Vertice menorV = new Vertice();
		int menor = 999999999;
		
		for(int i=0;i<conjuntoAux.size();i++) {
			if(conjuntoAux.get(i).distancia < menor) {
				menor = conjuntoAux.get(i).distancia;
				menorV = conjuntoAux.get(i);
			}
		}
		
		conjuntoAux.remove(menorV);
		
		return  menorV;
	}
	
	static public int dist_between(Vertice u, Vertice v, ArrayList<Aresta> conjuntoE) { //retornar a distancia entre os vertices (u,v)
		
		int distancia = 999999999;
		
		for(int i=0; i<conjuntoE.size();i++) { // verifica a distancia entre (u,v) ou (v,u), pois não é orientado  
			if((conjuntoE.get(i).origem == u && conjuntoE.get(i).destino == v) || (conjuntoE.get(i).destino == u && conjuntoE.get(i).origem == v)){ 
				distancia = conjuntoE.get(i).distancia;
			}
		}
		
		return distancia;
	}
}
