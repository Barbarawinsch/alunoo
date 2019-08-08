/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;
import dao.DaoAlunoo;
import javax.swing.JOptionPane;
import modelo.Alunoo;
import tela.manutencao.ManutencaoAlunoo;
import tela.manutencao.ManutencaoAlunoo;
/**
 *
 * @author Administrador
 */
public class ControladorAluno {

    public static void inserir(ManutencaoAlunoo man){
        Alunoo objeto = new Alunoo();
        objeto.setSobrenome(man.jtfSobrenome.getText());
        objeto.setNome(man.jtfNome.getText());
        
        boolean resultado = DaoAlunoo.inserir(objeto);
        if (resultado) {
            JOptionPane.showMessageDialog(null, "Inserido com sucesso!");
        } else {
            JOptionPane.showMessageDialog(null, "Erro!");
        }
}

    public static void alterar(ManutencaoAlunoo man){
        Alunoo objeto = new Alunoo();
        //definir todos os atributos
        objeto.setCodigo(Integer.parseInt(man.jtfCodigo.getText()));
        objeto.setNome(man.jtfNome.getText());
        objeto.setSobrenome(man.jtfSobrenome.getText());
        
        boolean resultado = DaoAlunoo.alterar(objeto);
        if (resultado) {
            JOptionPane.showMessageDialog(null, "Alterado com sucesso!");
        } else {
            JOptionPane.showMessageDialog(null, "Erro!");
        }
    }
     public static void excluir(ManutencaoAlunoo man){
        Alunoo objeto = new Alunoo();
        objeto.setCodigo(Integer.parseInt(man.jtfCodigo.getText())); //só precisa definir a chave primeira
        
        boolean resultado = DaoAlunoo.excluir(objeto);
        if (resultado) {
            JOptionPane.showMessageDialog(null, "Excluído com sucesso!");
        } else {
            JOptionPane.showMessageDialog(null, "Erro!");
        }
    }
    }
    

