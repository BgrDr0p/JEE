package domain;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

public class DAOContact {
	private final static String RESOURCE_JDBC = "java:comp/env/jdbc/jee";

	public String addContact(final String nom, final String prenom, final String email, final String numTel,
			final String rue, final String ville, final String pays) {
		try 
		{
			final Context lContext = new InitialContext();
			final DataSource lDataSource = (DataSource) lContext.lookup(RESOURCE_JDBC);
			final Connection lConnection = lDataSource.getConnection();
			// adding a new contact
			final PreparedStatement lPreparedStatementCreation = lConnection.prepareStatement(
					"INSERT INTO contact (id, nom, prenom, email, numTel, rue, ville, pays) VALUES (NULL, ?, ?, ?, ?, ?, ?, ?);");

			lPreparedStatementCreation.setString(1, nom);
			lPreparedStatementCreation.setString(2, prenom);
			lPreparedStatementCreation.setString(3, email);
			lPreparedStatementCreation.setString(4, numTel);
			lPreparedStatementCreation.setString(5, rue);
			lPreparedStatementCreation.setString(6, ville);
			lPreparedStatementCreation.setString(7, pays);

			lPreparedStatementCreation.executeUpdate();

			return null;
		}

		catch (NamingException e) {
			return "NamingException : " + e.getMessage();
		} catch (SQLException e) {
			return "SQLException : " + e.getMessage();
		}
	}

	public List<Contact> AfficheContact() {
		try {
			List<Contact> lesContacts = new ArrayList<Contact>();

			final Context lContext = new InitialContext();
			final DataSource lDataSource = (DataSource) lContext.lookup(RESOURCE_JDBC);
			final Connection lConnection = lDataSource.getConnection();
			final String requete = "SELECT * FROM CONTACT";
			final PreparedStatement stmt = lConnection.prepareStatement(requete);
			ResultSet rs = stmt.executeQuery(requete);
			while (rs.next()) {
				int id = rs.getInt("id");
				String nom = rs.getString("nom");
				String prenom = rs.getString("prenom");
				String email = rs.getString("email");
				String numTel = rs.getString("numTel");
				String rue = rs.getString("rue");
				String ville = rs.getString("ville");
				String pays = rs.getString("pays");
				lesContacts.add(new Contact(id, nom, prenom, email, numTel, rue, ville, pays));
				System.out.println(lesContacts.toString());
			}
			return lesContacts;

		} catch (SQLException e) {
				e.getMessage();
		} catch (NamingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;

	}
	
	
	public String SupprimerContact(final String nom, final String prenom, final String email, final String numTel, final String rue, final String ville, final String pays) {
		try 
		{
			final Context lContext = new InitialContext();
			final DataSource lDataSource = (DataSource) lContext.lookup(RESOURCE_JDBC);
			final Connection lConnection = lDataSource.getConnection();
			// adding a new contact
			final PreparedStatement lPreparedStatementCreation = lConnection.prepareStatement(
					"DELETE FROM contact where nom = ? and prenom = ? and email = ? and numTel = ? and rue = ? and ville = ? and pays = ?;");

			lPreparedStatementCreation.setString(1, nom);
			lPreparedStatementCreation.setString(2, prenom);
			lPreparedStatementCreation.setString(3, email);
			lPreparedStatementCreation.setString(4, numTel);
			lPreparedStatementCreation.setString(5, rue);
			lPreparedStatementCreation.setString(6, ville);
			lPreparedStatementCreation.setString(7, pays);

			lPreparedStatementCreation.executeUpdate();

			return null;

	}
		catch (NamingException e) 
		{
			return "NamingException : " + e.getMessage();
		} catch (SQLException e) 
		{
			return "SQLException : " + e.getMessage();
		}
	}
}
