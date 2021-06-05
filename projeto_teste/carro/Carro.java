/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carro;

/**
 *
 * @author noob1402
 */
public final class Carro {
    private String nome;
    private float preco;
    private int velocidade;
    private int portas;
    private int velocidades[] = {100,120,300,110,150};
    private String marcas[] = {"corsa","voiage","lamborguini","brugle","corola"};
    
    public Carro(String nome, float preco) {
        this.nome = nome;
        this.preco = preco;    
        add_velocidade();
        add_portas();
    }
    
    
    public String get_nome(){
        return this.nome;
    }
    
    public float get_preco(){
        return this.preco;
    }
    
   
   public int get_portas(){
     return portas;    
   }
   
   public int get_velocidade(){
       return velocidade;
   }
   
    public void add_velocidade(){
        boolean achou = false;
        for(int i = 0;i < marcas.length;i++){
            if (marcas[i].equalsIgnoreCase(this.nome)){
                velocidade = velocidades[i];
                achou = true;
            }    
        }
       if(!achou){
           velocidade = 100;
       }
    }
    
     public void add_portas(){
     if(velocidade > 100){
         portas = 4;
     }else{
         portas = 2;
     }
   }
     
 
    
}
