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
public class items implements IVisualizable {
    
    private String titulo;
    private String id;
    private String categoria;
    private int precio;
    private boolean alquiler;
    // talquiler = 0
    private String talquiler = "00m 00s";
    
    public items(){
            this.titulo = "";
            this.id = "";
            this.categoria = "";
            this.precio = 0;
            this.alquiler=false;
            this.talquiler = "00m 00s";       
    }
    
    public items (String titulo, String categoria){
            this.titulo = titulo;
            this.id = "";
            this.categoria =categoria;
            this.precio= 0;
            this.alquiler=false;
            this.talquiler = "00m 00s"; 
  
    }
    
     public items (String titulo, String id, String categoria, int precio ){
            this.titulo=titulo;
            this.id=id;
            this.categoria=categoria;
            this.precio=precio;
            this.alquiler=false;
            this.talquiler = "00m 00s"; 
  
    }

    public String getTitulo() {
        return titulo;
    }

    public String getGenero() {
        return id;
    }

    public String getCreador() {
        return categoria;
    }

    public int getDuracion() {
        return precio;
    }

    public boolean isVisto() {
        return alquiler;
    }

    public String getTvisto() {
        return talquiler;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setGenero(String genero) {
        this.id = id;
    }

    public void setCreador(String creador) {
        this.categoria = categoria;
    }

    public void setDuracion(int duracion) {
        this.precio = precio;
    }

    public void setVisto(boolean visto) {
        this.alquiler = alquiler;
    }
    
    @Override
    public String toString (){
         return "titulo: " + titulo + ",\nid: " + id + ",\ncategoria:" + 
                categoria + ",\nprecio: " + precio + ",\nalquiler: " + alquiler; 
    }
    
    public void marcarVisto(String tvisualizado){
    this.alquiler = true;
    this.talquiler = "Visualizado elalquiler: " + talquiler;
    }
   
    public boolean esAlquiler() {
    return this.alquiler;
    } 
    
    public String tiempoAlquiler() {
    return this.talquiler;
    }
    /**
     * @param args the command line arguments
     */
    
   
}
