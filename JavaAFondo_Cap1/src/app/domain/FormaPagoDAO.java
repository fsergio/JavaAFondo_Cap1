package app.domain;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import app.util.UConnection;

/*Class Data Access object for entity FormaPago.*/
public class FormaPagoDAO {
	public List<FormaPagoDTO> getFormasPago() {
		String sql = "SELECT id_forma_pago, descripcion, recargo FROM inscripciones.forma_pago";

		try {
			// executing query.
			Connection conn = UConnection.getConnection();
			PreparedStatement pstm = conn.prepareStatement(sql);
			ResultSet rs = pstm.executeQuery();
			// getting all records from entity FormasPago
			List<FormaPagoDTO> lst = new ArrayList<FormaPagoDTO>();
			while (rs.next()) {
				lst.add(new FormaPagoDTO(rs.getInt(1), rs.getString(2), rs.getDouble(3)));
			}
			return lst;
		} catch (Exception e) {
			e.printStackTrace();
			throw new RuntimeException(e);
		}
	}
}
