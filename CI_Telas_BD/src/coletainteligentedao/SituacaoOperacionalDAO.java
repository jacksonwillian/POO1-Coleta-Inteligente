/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coletainteligentedao;

import coletainteligente.SituacaoOperacional;
import conexao.ConexaoDB;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author thiag
 */
public class SituacaoOperacionalDAO {
    
    public void insere(SituacaoOperacional so){
        
        Connection con = ConexaoDB.getConexao();
        PreparedStatement stmt = null;
        
        try {
            
            stmt = con.prepareStatement("INSERT INTO situacao_operacional (cod_lixeira, cod_coletor, cod_status, hora_status, data_status) VALUES (?,?,?,?,?);");
            stmt.setInt(1, so.lixeira.getCodigo());
            stmt.setInt(2, so.coletor.getCodigo());
            stmt.setInt(3, so.status.getCodigo());
            stmt.setTime(4, so.getTime());
            stmt.setDate(5, so.getDate());
            stmt.executeUpdate();
            
            System.out.print("Insert criado com sucesso");
            ConexaoDB.closeConnection(con, stmt);
            
        } catch (SQLException ex) {
            Logger.getLogger(SituacaoOperacionalDAO.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Insert não deu certo!\n" + ex.getMessage()); 
            
        } finally {
            ConexaoDB.closeConnection(con, stmt);  
        }
        
    }

    public int verificaUltimoStatus(int cod_lixeira) {
        Connection con = ConexaoDB.getConexao();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        int codStatus = 0;
        try {
            stmt = con.prepareStatement("SELECT cod_status FROM situacao_operacional WHERE cod_lixeira = ? ORDER BY data_status DESC, hora_status DESC LIMIT 1;");
            stmt.setInt(1, cod_lixeira);
            rs = stmt.executeQuery();
            if (rs.next()) {
                codStatus = rs.getInt("cod_status");
            }
        } catch (SQLException ex) {
            Logger.getLogger(StatusDAO.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, ex);
        } finally {
            ConexaoDB.closeConnection(con, stmt);
        }
        return codStatus;
    }

    
}
