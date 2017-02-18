package br.projetoweb.aluno;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.sun.xml.internal.bind.v2.runtime.unmarshaller.XsiNilLoader.Array;

import br.projetoweb.conexao.Conexao;

public class RepositorioAluno implements IRepostorioAluno{

	public RepositorioAluno() {
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void cadastrar(Aluno aluno) {
		String sql = "insert into aluno (nome, idade, cpf, curso) values (?,?,?,?)";
		
		try {
			Connection con = Conexao.getConnection();
			
			PreparedStatement ps = con.prepareStatement(sql);
			
			ps.setString(1, aluno.getNome());
			ps.setInt(2, aluno.getIdade());
			ps.setString(3, aluno.getCpf());
			ps.setString(4, aluno.getCurso());
			
			ps.execute();
			
			ps.close();
			con.close();
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public Aluno procurar(Integer id) {
		String sql = "Select * from aluno where idAluno = ?";
		
		try {
			Connection con = Conexao.getConnection();
			
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1, id);
			ResultSet rs = ps.executeQuery();
			
			if(rs.next()){
				return new Aluno(rs.getInt(1), rs.getString(2), rs.getString(4), rs.getInt(3), rs.getString(5)); 
			}
			
			ps.close();
			rs.close();
			con.close();
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return null;
	}

	@Override
	public void atualizar(Aluno aluno) {
		String sql = "update aluno set nome = ?, idade = ?, cpf = ?, curso = ? where idAluno = ?";
		
		try {
			Connection con = Conexao.getConnection();
			
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, aluno.getNome());
			ps.setInt(2, aluno.getIdade());
			ps.setString(3, aluno.getCpf());
			ps.setString(4, aluno.getCurso());
			ps.setInt(5, aluno.getIdAluno());
			
			ps.executeUpdate();
			
			ps.close();
			con.close();
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	@Override
	public boolean remover(Integer id) {
		String sql = "delete from aluno where idAluno = ?";
		
		try {
			Connection con = Conexao.getConnection();
			
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1, id);
			ps.executeUpdate();
			
			ps.close();
			con.close();
			
			return true;
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return false;
	}

	@Override
	public ArrayList<Aluno> listar() {
		ArrayList<Aluno> lista = new ArrayList<>();
		
		String sql = "select * from aluno";
		
		try {
			Connection con = Conexao.getConnection();
			
			PreparedStatement ps = con.prepareStatement(sql);
			
			ResultSet rs = ps.executeQuery();
			
			while(rs.next()){
				Aluno aluno = new Aluno();
				
				aluno.setIdAluno(rs.getInt(1));
				aluno.setNome(rs.getString(2));
				aluno.setIdade(rs.getInt(3));
				aluno.setCpf(rs.getString(4));
				aluno.setCurso(rs.getString(4));
				
				lista.add(aluno);
			}
			
			ps.close();
			rs.close();
			con.close();
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

		return lista;
	}

}
