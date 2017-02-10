/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package items;

/**
 *
 * @author SENA
 */
public class juegos extends items implements IVisulizable {
    private int consola;
    private int n_jugadores;
    
    public juegos() {
        super();
        this.consola=1;
        this.n_jugadores=1;
    }
public juegos (String titulo, String id){
     super(titulo, id);  
     this.consola=1;
    this.n_jugadores=1; 
    }
    
     public juegos (String titulo, String id, String categoria, int precio,
             int consola, int n_jugadores ){
       super(titulo, id, categoria, precio);
         this.consola = consola;
         this.n_jugadores = n_jugadores; 
    }

    public int getConsola() {
        return consola;
    }

    public int getN_jugadores() {
        return n_jugadores;
    }

    public void setConsola(int consola) {
        this.consola = consola;
    }

    public void setN_jugadores(int n_jugadores) {
        this.n_jugadores = n_jugadores;
    }


    @Override
     public String toString(){
         return super.toString() + ",\nconsola: " + consola + ",\nn_jugadores " + n_jugadores;
     }
    
}
