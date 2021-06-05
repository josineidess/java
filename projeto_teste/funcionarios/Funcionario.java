/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package funcionarios;

/**
 *
 * @author noob1402
 */
public class Funcionario {
    private String cpf;
    private String nome;
    private String cargo;
    private char sexo;
    private String telefone;
    private String endereco;
    private String setor;
    private double salario;
    
    public Funcionario(String cpf,String nome,String cargo,char sexo,String telefone, String endereco, String setor, double salario){
      this.cpf = cpf;
      this.nome = nome;
      this.cargo = cargo;
      this.sexo = sexo;
      this.telefone = telefone;
      this.endereco = endereco;
      this.setor = setor;
      this.salario = salario;
    }
    
    public String get_cpf(){
        return cpf;
    }
    
    public String get_nome(){
        return nome;
    }
    
    public String get_cargo(){
        return cargo;
    }
    
    public char get_sexo(){
        return sexo;
    }
    
    public String get_telefone(){
        return telefone;
    }
    
    public String get_endereco(){
        return endereco;
    }
    
    public String get_setor(){
        return setor;
    }
    
    public double get_salario(){
        return salario;
    }
}
