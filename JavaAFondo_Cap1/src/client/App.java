package client;

import java.util.List;
import java.util.Scanner;

import app.domain.CursoDTO;
import app.domain.FormaPagoDTO;
import app.domain.InscripcionDTO;
import logical.Facade;

/**
 * Class shows menu app, list all cursos y formas de pago. Front-end
 * application(console)
 */
public class App {

	public static void main(String[] args) {
		// Instance facade
		Facade f = new Facade();
		mostrarPantallaInsc(f);

		// input data
		InscripcionDTO dto = ingresoDatos();

		// inscription processing
		int idInsc = f.registrarInscripcion(dto);

		// shows submit display
		mostrarPantallaConfirm(idInsc);
	}

	private static void mostrarPantallaConfirm(int idInsc) {
		System.out.println("Su inscripcion fue registrada con el ID: " + idInsc);

	}

	// load data for send request, into facade.
	private static InscripcionDTO ingresoDatos() {
		Scanner sr = new Scanner(System.in);
		System.out.print("ingrese su nombre: ");
		String nombre = sr.nextLine();

		System.out.print("ingrese su telefono: ");
		String tel = sr.nextLine();

		System.out.print("ingrese codigo de curso: ");
		int idCurso = sr.nextInt();

		System.out.print("ingrese cod. forma de pago: ");
		int idFormaPago = sr.nextInt();

		// instance dto for return
		InscripcionDTO dto = new InscripcionDTO();
		dto.setNombre(nombre);
		dto.setTelefono(tel);
		dto.setIdCurso(idCurso);
		dto.setIdFormaPago(idFormaPago);
		return dto;
	}

	// shows all cursos and formas de pago from data base engine.
	private static void mostrarPantallaInsc(Facade f) {
		List<CursoDTO> cursos = f.obtenerCursos();
		List<FormaPagoDTO> formasPago = f.obtenerFormasPago();
		// shows cursos.
		System.out.println("---Cursos---");
		for (CursoDTO c : cursos) {
			System.out.println(c.getIdCurso() + c.getDescripcion());
		}
		// shows formas de pago.
		System.out.println("---Formas de pago---");
		for (FormaPagoDTO fp : formasPago) {
			System.out.println(fp.getIdFormaPago() + fp.getDescripcion());
		}

	}

}
