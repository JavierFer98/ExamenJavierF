package ExamenJavierF;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;

public class AccesoBBDD {
	private static Connection conexion;
	private static PreparedStatement prepstate;
	private static String USR="root";
	private static String pwd = "";
	private static String urlbbdd ="jdbc:mysql://localhost:3306/tranporte?serverTimezone=UTC";
	public static void accesoBBDD() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conexion = DriverManager.getConnection(urlbbdd,USR, pwd);
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}public static void insertarValores(ArrayList<Transporte> lista) {
		accesoBBDD();
		try {
			prepstate = conexion.prepareStatement("INSERT INTO trans VALUES(?,?,?)");
			for (Transporte transporte : lista) {
				prepstate.setString(1, transporte.getLabel());
				prepstate.setString(2, transporte.getNameA());
				prepstate.setString(3, transporte.getNameB());
				prepstate.executeUpdate();
			}
			conexion.close();
			prepstate.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	public static void selectLineas() {
		Scanner sc = new Scanner(System.in);
		accesoBBDD();
		String linea = sc.next();
		try {
			prepstate = conexion.prepareStatement("SELECT * FROM trans WHERE namea LIKE '%"+linea+"%' OR nameb LIKE '%"+linea+"%'");
			ResultSet selectt = prepstate.executeQuery();
				while (selectt.next()) {
					System.out.println(selectt.getString(1)+","+selectt.getString(2)+","+selectt.getString(3));
				}
				conexion.close();
				prepstate.close();
				
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	} 
	}

