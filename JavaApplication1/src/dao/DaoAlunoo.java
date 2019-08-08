/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import modelo.Alunoo;
/**
 *
 * @author Administrador
 */
public class DaoAlunoo {
     public static boolean inserir(Alunoo objeto) {
        String sql = "INSERT INTO alunoo (sobrenome, nome) VALUES (?, ?)";
        try {
            PreparedStatement ps = conexao.Conexao.getConexao().prepareStatement(sql);
            ps.setString(1, objeto.getSobrenome());
            ps.setString(2, objeto.getNome());
            ps.executeUpdate();
            return true;
        } catch (SQLException | ClassNotFoundException ex) {
            System.out.println(ex.getMessage());
            return false;
        }
    }
     public static void main(String[] args) {
        Alunoo objeto = new Alunoo();
        objeto.setSobrenome("Winsch");
        objeto.setNome("Barbara");
        
        boolean resultado = inserir(objeto);
        if (resultado) {
            JOptionPane.showMessageDialog(null, "Inserido com sucesso!");
        } else {
            JOptionPane.showMessageDialog(null, "Erro!");
        }
    }
       public static boolean alterar(Alunoo objeto) {
        String sql = "UPDATE alunoo SET nome = ?, sobrenome = ? WHERE codigo=?";
        try {
            PreparedStatement ps = conexao.Conexao.getConexao().prepareStatement(sql);
            ps.setString(1, objeto.getNome()); 
            ps.setString(2, objeto.getSobrenome());
            ps.setInt(3, objeto.getCodigo());
            ps.executeUpdate();
            return true;
        } catch (SQLException | ClassNotFoundException ex) {
            System.out.println(ex.getMessage());
            return false;
        }
    }
         public static boolean excluir(Alunoo objeto) {
        String sql = "DELETE FROM produto WHERE codigo=?";
        try {
            PreparedStatement ps = conexao.Conexao.getConexao().prepareStatement(sql);
            ps.setInt(1, objeto.getCodigo());
            ps.executeUpdate();
            return true;
        } catch (SQLException | ClassNotFoundException ex) {
            System.out.println(ex.getMessage());
            return false;
        }
    }
}
