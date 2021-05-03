import java.time.LocalDate;

import Abstract.BaseCustomerManager;
import Adapters.MernisServiceAdapter;
import Concrete.CustomerCheckManager;
import Concrete.NeroCustomerManager;
import Concrete.StarbucksCustomerManager;
import Entities.Customer;

public class Main {

	public static void main(String[] args) {
		
		LocalDate birthDate = LocalDate.of(1985, 2, 12); // Test amaçlı bilgiler içerir...
		Customer customer = new Customer(1, "Ayhan", "Karaman", "01234567890", birthDate);
		
		// BaseCustomerManager customerManager = new BaseCustomerManager() {};
		BaseCustomerManager customerManager = new NeroCustomerManager(new MernisServiceAdapter());
		// BaseCustomerManager customerManager = new StarbucksCustomerManager(new MernisServiceAdapter());
		
		customerManager.save(customer);
		
	}

}
