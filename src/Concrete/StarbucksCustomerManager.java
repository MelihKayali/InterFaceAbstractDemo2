package Concrete;

import Abstract.BaseCustomerManager;
import Abstract.CustomerCheckService;
import Entities.Customer;

public class StarbucksCustomerManager extends BaseCustomerManager  {
	private CustomerCheckService customerCheckService1;
	
	private CustomerCheckService customerCheckService;
	public StarbucksCustomerManager(CustomerCheckService customerCheckService) {
		this.customerCheckService1 = customerCheckService;
	}

	@Override
	public void save(Customer customer) {
		if(customerCheckService1.CheckIfRealPerson(customer)) {
			super.save(customer);
		}
		else {
			System.out.println("Not a valid person.");
		}
	}	
	
}
