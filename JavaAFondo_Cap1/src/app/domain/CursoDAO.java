/**
 * 
 */
package app.domain;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import app.util.UConnection;

/**
 * @author sergio
 *
 *         Class Data Acces Object for entity curso.
 */
public class CursoDAO {

	public List<CursoDTO> getCursos() {
		String sql = "SELECT id_curso, descripcion, precio FROM inscripciones.curso";

		try {
			// executing query.
			Connection conn = UConnection.getConnection();
			PreparedStatement pstm = conn.prepareStatement(sql);
			ResultSet rs = pstm.executeQuery();
			// getting all records from entity curso
			List<CursoDTO> lst = new ArrayList<CursoDTO>();
			while (rs.next()) {
				lst.add(new CursoDTO(rs.getInt(1), rs.getString(2), rs.getDouble(3)));
			}
			return lst;
		} catch (Exception e) {
			e.printStackTrace();
			throw new RuntimeException(e);

		}
	}
}
