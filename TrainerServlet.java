package trainers;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.json.JSONObject;

public class TrainerServlet  extends HttpServlet
{

		public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException
		{
			String requestURL = request.getRequestURL();
			String id = requestURL.substring("/trainers/".length());
			Trainer trainer = Trainer_Store.getInstance().getTrainer(id);
			if(trainer != null)
			{
				String json = "{\n";
				json += "\"id\": " + JSONObject.quote(trainer.getId()) + ",\n";
				json += "\"first name \": " + JSONObject.quote(trainer.getFirst_name()) + ",\n";
				json += "\"Last name \": " + JSONObject.quote(trainer.getLast_name()) + ",\n";
				json += "\"Email \": " + JSONObject.quote(trainer.getEmail()) + ",\n";
				json += "\" Trainer type \": " + JSONObject.quote(trainer.getTrainer_Type()) + ",\n";
				json += "\"Phone number \": " + JSONObject.quote(trainer.getPhone_Number()) + ",\n";
				json += "}";
				response.getOutputStream().println("{}");
			}
			else
			{
				response.getOutputStream().println("{}");
			}
		}
		public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException
		{
			String id = request.getParameter("id");
			String first_name = request.getParameter("first_name");
			String last_name = request.getParameter("last_name");
			String email = request.getParameter("email");
			Trainer_type trainerType = request.getParameter(trainerType);
			String phoneNumber = request.getParameter("phone_number");
			Trainer_Store.getInstance().putTrainer(new Trainer(id, first_name, last_name, email, trainerType, phoneNumber));
		}
		
		

}
