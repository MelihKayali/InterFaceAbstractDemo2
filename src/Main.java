import java.util.Calendar;

import Abstract.BaseCustomerManager;
import Adapters.MernisServiceAdapter;
import Concrete.NeroCustomerManager;
import Entities.Customer;

public class Main {

	public static void main(String[] args) {
		BaseCustomerManager customerManager = new NeroCustomerManager(new MernisServiceAdapter());
		BaseCustomerManager customerManager2 = new NeroCustomerManager(null);
		
		Calendar dateOfBirth = Calendar.getInstance();
        dateOfBirth.set(2005, 1, 1);
		
		Customer customer = new Customer(1 , "Melih" , "KAYALI" , dateOfBirth , "12836182736");
		
		BaseCustomerManager.add(customer);
		BaseCustomerManager.add(customer);
		
			customerManager.save(customer);	
			System.out.println();
	}

}
