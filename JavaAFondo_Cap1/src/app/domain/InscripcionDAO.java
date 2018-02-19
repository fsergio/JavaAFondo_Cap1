/**
 * 
 */
package app.domain;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import app.util.UConnection;

/**
 * @author sergio
 * 
 *         Class Data Acces object for entity Inscripcion.
 */
public class InscripcionDAO {

	public int insertar(InscripcionDTO dto) {
		String s1 = "SELECT MAX(id_inscripcion)+1 FROM inscripciones.inscripcion";
		String s2 = "INSERT INTO inscripciones.inscripcion(id_inscripcion, nombre, telefono, id_curso, id_forma_pago) VALUES(?, ?, ?, ?, ?)";

		try {
			Connection conn = UConnection.getConnection();
			PreparedStatement pstm1 = conn.prepareStatement(s1);
			PreparedStatement pstm2 = conn.prepareStatement(s2);
			ResultSet rs1 = pstm1.executeQuery();

			if (rs1.next()) {
				// ResultSet rs2 = pstm1.executeQuery();
				// rs2.next();
				int max = rs1.getInt(1);
				System.out.println(max);
				pstm2.setInt(1, max);
				pstm2.setString(2, dto.getNombre());
				pstm2.setString(3, dto.getTelefono());
				pstm2.setInt(4, dto.getIdCurso());
				pstm2.setInt(5, dto.getIdFormaPago());
				if (pstm2.executeUpdate() != 1) {
					throw new RuntimeException("Error...");
				}
				return max;
			}
		} catch (Exception e) {
			e.printStackTrace();
			throw new RuntimeException();
		}
		throw new RuntimeException();
	}
}
