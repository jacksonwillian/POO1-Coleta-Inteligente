/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coletainteligentedao;

import coletainteligente.Coleta;
import conexao.ConexaoDB;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author thiag
 */
public class ColetaDAO {
    
    //Contrutor Vazio
    public ColetaDAO() {
        
    }
    
    public void insere(Coleta coleta){
        Connection con = ConexaoDB.getConexao();
        PreparedStatement stmt = null;

        try{
            stmt = con.prepareStatement("INSERT INTO coleta (cod_coletor, cod_lixeira, volume,hora_coleta, data_coleta) VALUES (?,?,?,?,?)");
            stmt.setInt(1, coleta.coletor.getCodigo());
            stmt.setInt(2, coleta.lixeira.getCodigo());
            stmt.setDouble(3, coleta.getVolume());
            
            stmt.setTime(4, coleta.getTime());
            stmt.setDate(5, coleta.getData1());
            
            stmt.executeUpdate();
            
            stmt = con.prepareStatement("UPDATE lixeira SET nivel_atual = 0 WHERE cod_lixeira=?");
            stmt.setInt(1, coleta.getLixeira().getCodigo());
            stmt.executeUpdate();
            
            ConexaoDB.closeConnection(con, stmt);
            
        } catch (SQLException ex) {
            Logger.getLogger(ColetaDAO.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Insert não deu certo!\n" + ex.getMessage()); 
        } finally {
            ConexaoDB.closeConnection(con, stmt);
        }
        
    }
    
    public void deleta(Coleta coleta) {
        
        Connection con = ConexaoDB.getConexao();
        PreparedStatement stmt = null;
        
        try {
            
            stmt = con.prepareStatement("DELETE FROM coleta WHERE data_coleta=?");
            stmt.setString(1, coleta.getStringData());
            
            stmt.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Exclusão realizado com sucesso");
            ConexaoDB.closeConnection(con, stmt);
            
        } catch (SQLException ex) {
            Logger.getLogger(ColetaDAO.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Exclusão não deu certo!\n" + ex.getMessage()); 
            
        } finally {
            ConexaoDB.closeConnection(con, stmt);   
        }         
    }
    
    public void genericSQL(String sql) {
        Connection con = ConexaoDB.getConexao();
        PreparedStatement stmt = null;
        
        try {        
            stmt = con.prepareStatement(sql);           
            stmt.executeUpdate();          
            JOptionPane.showMessageDialog(null, "Comando executado com sucesso");
            ConexaoDB.closeConnection(con, stmt);   
            
        } catch (SQLException ex) {
            Logger.getLogger(ColetaDAO.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Erro na instrução SQL!\n" + ex.getMessage());
            
        } finally {
            ConexaoDB.closeConnection(con, stmt);
        } 
    }
    
    
    public void updateLixeira(Coleta coleta) {
        Connection con = ConexaoDB.getConexao();
        PreparedStatement stmt = null;
        
        try {
            
            stmt = con.prepareStatement("UPDATE coleta SET cod_lixeira=?, cod_coletor=?, volume=?, hora_coleta=?, data_coleta=? WHERE data_coleta=?");
            stmt.setInt(1, coleta.getLixeira().getCodigo());
            stmt.setInt(2, coleta.getColetor().getCodigo());
            stmt.setDouble(3, coleta.getVolume());
            JOptionPane.showMessageDialog(null, coleta.getStringHora());
            stmt.setString(4, coleta.getStringHora());
            stmt.setString(5, coleta.getStringData());
            stmt.executeUpdate();
            

            JOptionPane.showMessageDialog(null, "Update realizado com sucesso");
            ConexaoDB.closeConnection(con, stmt);
            
        } catch (SQLException ex) {
            Logger.getLogger(LixeiraDAO.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Update não deu certo!\n" + ex.getMessage()); 
            
        } finally {
            ConexaoDB.closeConnection(con, stmt);   
        }   
    }
    
  
}
