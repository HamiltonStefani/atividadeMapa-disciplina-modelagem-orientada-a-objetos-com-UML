/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package atividademapa;

/**
 *
 * @author hamil
 */
public class AtividadeMapa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Funcionario f[] = new Funcionario[4];
        f[0] = new Funcionario(220, "José Oliveira", "Ribeirão Preto", "SP");
        f[1] = new Funcionario(221, "João Paulo", "Franca", "SP");
        f[2] = new Funcionario(222, "Marília Pera", "Guaxupé", "MG");
        f[3] = new Funcionario(223, "Tamires Souza", "São Miguel", "PI");
        
        
        f[0].incluir();
        f[1].incluir();
        f[2].incluir();
        f[3].incluir();
        
        f[1].alterar();
        f[0].excluir();
        f[2].recuperar();
        f[3].validar();
        
        
        
    }
    
}
