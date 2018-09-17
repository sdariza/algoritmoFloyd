/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package floyd;

/**
 *
 * @author USUARIO
 */
public class ways {
    int V=Floyd.M.length;
    int s;
    
    void floydWarshall(int matriz[][]) {
        int camino[][] = new int[V][V];
        for (int i = 0; i < V; i++) {
            for (int j = 0; j < V; j++) {
                camino[i][j] = s;
                s=s+1;
            }
            s=0;
        }
        for (int k = 0; k < V; k++) {
            for (int i = 0; i < V; i++) {
                for (int j = 0; j < V; j++) {
                    if (Floyd.M[i][k] + Floyd.M[k][j] < Floyd.M[i][j]) {
                        Floyd.M[i][j] = Floyd.M[i][k] + Floyd.M[k][j];
                        camino[i][j]=k;
                    }
                }
            }
        }
        System.out.println("Matriz de caminos");
        imprimir(camino);
        System.out.println("Matriz de mínimos costos: ");
        imprimir(Floyd.M);
    }
    void imprimir(int dist[][]) {
        for (int i = 0; i < V; ++i) {
            for (int j = 0; j < V; ++j) {
                if (dist[i][j] == 99999) {
                    System.out.print("INF ");
                } else {
                    System.out.print(dist[i][j] + " ");
                }
            }
            System.out.println();
        }
    }

}
