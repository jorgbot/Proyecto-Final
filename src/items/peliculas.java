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
public class peliculas extends items implements IVisulizable {
    private int numero_idiomas;
    private int formato;
    
    public peliculas() {
        super();
        this.numero_idiomas=1;
        this.formato=1;
    }
public peliculas (String titulo, String id){
     super(titulo, id);  
    this.numero_idiomas=1; 
    this.formato=1;
    }
    
     public peliculas (String titulo, String id, String categoria, int precio, int numero_idiomas, int formaro ){
       super(titulo, id, categoria, precio);
         this.numero_idiomas = 1;
         this.formato = 1;
    }

    public int getNumero_idiomas() {
        return numero_idiomas;
    }
    public int getFormato() {
        return formato;
    }

    public void setNumero_idiomas(int numero_idiomas) {
        this.numero_idiomas = numero_idiomas;
    }

    public void setFormato(int formato) {
        this.formato = formato;
    }
    
    @Override
     public String toString(){
         return super.toString() + ",\nnumero_idiomas: " + numero_idiomas + ",\nformato: " + formato;
     }
}