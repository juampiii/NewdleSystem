
import controller.LoginController;
import controller.TeacherController;

public class MVCPatternDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Crear ventana login:
		
		LoginController lc = new LoginController();
		lc.LoadLogin();
		
		//Recojo la informacion, y en funcion del tipo de usuario...
		//Todo esto ira en login controller
		//
	}

}
