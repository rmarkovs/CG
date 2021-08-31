package trainers;
import java.util.HashMap;
import java.util.Map;


public class Trainer_Store {

		//creates a new map
		private Map<String, Trainer> trainers = new HashMap<>();
		
		private static Trainer_Store instance  = new Trainer_Store();
		public static Trainer_Store getInstance()
		{
			return instance;
		}
	//example constructor
		private Trainer_Store()
		{
			trainers.put("trainer-id-12334", 
					new Trainer("trainer-id-12334","trainer1@gmail.com", "John", "Doe", Trainer_type.YOGA, "832-667-9892"));
			trainers.put("trainer-id-6789", 
					new Trainer("trainer-id-6789","trainer2@gmail.com","Jane", "Doe", Trainer_type.GENERAL, "987-654-9087"));
			
		}
		//retrieves the trainer with that id
		
		public Trainer getTrainer(String id)
		{
			return trainers.get(id);
		}
		//puts the trainer in the hashmap
		public void putTrainer(String id, String email, String first_name, String last_name, Trainer_type trainerType, String phone_number)
		{
			Trainer newTrainer = new Trainer(id, email, first_name, last_name, trainerType, phone_number);
			trainers.put(newTrainer.getId(), newTrainer);
		}
	}


