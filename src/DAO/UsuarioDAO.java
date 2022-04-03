
package DAO;

import DTO.UsuarioDTO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;


public class UsuarioDAO {
   
    Connection conn;
    
    public ResultSet autenticacaousuario(UsuarioDTO objusuariodto){
        conn = new Conexao().connectaBD();
         
        try {
            String sql = "select * from usuario where cpf_usuario = ? and username = ? and senha = ? and nome_aluno = ? and turma = ? and escola = ? and turno = ?";
            PreparedStatement pstm = conn.prepareStatement(sql);
            pstm.setString(1, objusuariodto.getCpf_usuario());
            pstm.setString(2, objusuariodto.getUsername());
            pstm.setString(3, objusuariodto.getSenha());
            pstm.setString(4, objusuariodto.getNome_aluno());
            pstm.setString(5, objusuariodto.getTurma());
            pstm.setString(6, objusuariodto.getEscola());
            pstm.setString(7, objusuariodto.getTurno());
            
            ResultSet rs = pstm.executeQuery();
            return rs;
            
            
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null,"UsuarioDAO: "+ e);
            return null;
        }
   }
}
