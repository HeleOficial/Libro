/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author estudiante103
 */
public class Libro {
    
    private String autor;
    private String titulo;
    private Double N_Ejemplares;
    private Double N_Ejemplares_Prestados;

    public Libro(String autor, String titulo, Double Numero_Ejemplares, Double N_Ejemplares_Prestados) {
        this.autor = autor;
        this.titulo = titulo;
        this.N_Ejemplares = Numero_Ejemplares;
        this.N_Ejemplares_Prestados = N_Ejemplares_Prestados;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Double getNumero_Ejemplares() {
        return N_Ejemplares;
    }

    public void setNumero_Ejemplares(Double Numero_Ejemplares) {
        this.N_Ejemplares = Numero_Ejemplares;
    }

    public Double getN_Ejemplares_Prestados() {
        return N_Ejemplares_Prestados;
    }

    public void setN_Ejemplares_Prestados(Double N_Ejemplares_Prestados) {
        this.N_Ejemplares_Prestados = N_Ejemplares_Prestados;
    }
    
    public boolean prestamo() {
        if (N_Ejemplares_Prestados < N_Ejemplares) {
            N_Ejemplares_Prestados++;
            return true;
        
        } else {
            
            return false;
            
        }
        
    }

    public boolean devolucion() {
        if (N_Ejemplares_Prestados > 0) {
            N_Ejemplares_Prestados--;
            return true;
            
        } else {
            
            return false;
        }
        
    }
    
    public void imprimirLibro() {
        System.out.println("Autor: " + autor);
        System.out.println("Título: " + titulo);
        System.out.println("Número de ejemplares: " + N_Ejemplares);
        System.out.println("Número de ejemplares prestados: " + N_Ejemplares_Prestados);
    }
    
}