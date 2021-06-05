/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author noob1402
 */
import carro.Carro;
import concessionaria.Concessionaria;
import funcionarios.Funcionario;

public class Main {
    public static void main(String[] args){
        Carro car1 = new Carro("voiage", 25000);
        Carro car2 = new Carro("corola", 90000);
        Carro car3 = new Carro("brugle", 80000);
        
        Funcionario func1 = new Funcionario("1234567894-00","Josineide Soares","Secretária",'F',"988234567","Rua da ponte","RH",2500);
        Funcionario func2 = new Funcionario("1234567894-01","Pedro Soares","Vendedor",'M',"9882f4567","Rua da fiação","Vendas",2800);
        
        Concessionaria loja = new Concessionaria("Prexus");
        loja.add_car(car1);
        loja.add_car(car2);
        loja.add_car(car3);
        loja.add_funcionario(func1);
        loja.add_funcionario(func2);
        
        loja.exibir_carros();
        loja.exibir_funcionarios();
    }
    
}
