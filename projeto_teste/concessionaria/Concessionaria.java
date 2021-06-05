/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package concessionaria;
import carro.Carro;
import java.util.ArrayList;
import funcionarios.Funcionario;

/**
 *
 * @author noob1402
 */
public class Concessionaria {
    private String nome;
    private ArrayList<Carro> carros = new ArrayList<Carro>();
    private ArrayList<Funcionario> funcionarios = new ArrayList<Funcionario>();
    
    public Concessionaria(String nome){
        this.nome = nome;
    }
    
    public boolean add_car(Carro carro){
        carros.add(carro);
        return true;
    }
    
    public boolean add_funcionario(Funcionario funcionario){
        funcionarios.add(funcionario);
        return true;
    }
    
     public void linha(){
       System.out.printf("\n|________|_________|____________|________|\n");
   }
   
  public void cabecalho(){
    System.out.printf("\n__________________________________________\n");
    System.out.printf("-----------------%s-------------------\n",nome.toUpperCase());
    System.out.printf("__________________________________________\n");
  }
  
   public void exibir_carros(){
       cabecalho();
       System.out.printf("\n################ Carros ##################");
       System.out.printf("\n_________________________________________\n");
       System.out.print("|  Nome  |  Preço  | Velocidade | Portas |");
       linha();
       for(int i = 0; i < carros.size();i++){
           System.out.printf("| %s |%.2f |  %d Km    | %d      |", carros.get(i).get_nome(),carros.get(i).get_preco(),carros.get(i).get_velocidade(),carros.get(i).get_portas());
           linha();
       }
   }
   
   public void exibir_funcionarios() {
       System.out.printf("\n############## Funcionários ################");
       System.out.printf("\n_________________________________________\n");
       System.out.print("|  Nome  |  Cargo  | Salario | Sexo |");
       linha();
       for(int i = 0; i < funcionarios.size();i++){
           System.out.printf("| %s |%s |  %.2f Km    | %s      |", funcionarios.get(i).get_nome(),funcionarios.get(i).get_cargo(),funcionarios.get(i).get_salario(),funcionarios.get(i).get_sexo());
           linha();
       }
   }
}


