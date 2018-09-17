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
public class Floyd {

    /**
     * @param args the command line arguments
     */
       
    public static void main(String[] args) {
        ways t= new ways();
        t.floydWarshall(M);
    }
   static int[][] M = {{0, 9, 3, 4, 99999, 99999},
    {99999, 0, 99999, 7, 99999, 99999},
    {99999, 99999, 0, 99999, 2, 99999},
    {99999, 99999, 4, 0, 99999, 99999},
    {5, 99999, 99999, 1, 0, 99999},
    {3,8,99999,2,99999,0}};

}
