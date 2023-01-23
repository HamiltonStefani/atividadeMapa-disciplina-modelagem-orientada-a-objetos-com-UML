/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package atividademapa;

/**
 *
 * @author hamil
 */
public class Funcionario implements ModeloCrud {
    //Atributos
    private int id;
    private String nome;
    private String cidade;
    private String uf;
    
    //Metodos especiais

    public Funcionario(int id, String nome, String cidade, String uf) {
        this.id = id;
        this.nome = nome;
        this.cidade = cidade;
        this.uf = uf;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }
    
        //Metodos Abstratos

    @Override
    public void incluir() {
        System.out.println("*Incluir funcionário; ");
        System.out.println("Inserir código do funcionario: " + this.getId());
        System.out.println("Inserir nome do funcionário: " + this.getNome());
        System.out.println("Inserir cidade do funcionário: " + this.getCidade());
        System.out.println("Inserir Estado do funcionário: " + this.getUf());
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
        System.out.println("__________________________________________");
    }

    @Override
    public void alterar() {
        System.out.println("*Alterar funcionario");
        System.out.println("Altere o código do funcionario: " + this.getId());
        System.out.println("Altere o nome do funcionário: " + this.getNome());
        System.out.println("Altere a cidade do funcionário: " + this.getCidade());
        System.out.println("Altere o Estado do funcionário: " + this.getUf());
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
        System.out.println("__________________________________________");
    }

    @Override
    public void excluir() {
        System.out.println("*Excluir funcionario"); 
        System.out.println("Excluindo o funcionario -  código do funcionario: " + this.getId());
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
        System.out.println("__________________________________________");
       
    }

    @Override
    public void recuperar() {
        System.out.println("*Recuperar funcionário excluido");
        System.out.println("recuperar o funcionario - código do funcionario: " + this.getId());
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
        System.out.println("__________________________________________");
    }

    @Override
    public void validar() {
        System.out.println("*Validar funcionário");
            if(id >= 0 && id < 280){
                System.out.println("Funcionário validado com sucesso!");
            }else{
                System.out.println("Não validado");
                System.out.println("Critério: só funcionários com códigos entre números de 0 a 280");
            }
         System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>"); 
         System.out.println("__________________________________________");
      
    }
    
    
    
    
}
