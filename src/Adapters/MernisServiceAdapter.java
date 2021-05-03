package Adapters;

import java.rmi.RemoteException;

import Abstract.ICustomerCheckService;
import Entities.Customer;
import tr.gov.nvi.tckimlik.WS.*;

public class MernisServiceAdapter implements ICustomerCheckService{

	public boolean checkIfRealPerson(Customer customer) {
		
		Long nId = Long.parseLong(customer.nationalityId);
		String fName = customer.firstName.toUpperCase();
		String lName = customer.lastName.toUpperCase();
		int date = customer.dateOfBirth.getYear();
		
		KPSPublicSoap client = new KPSPublicSoapProxy();
		boolean test = false;
		
		try {
			test = client.TCKimlikNoDogrula(nId, fName, lName, date);
			
		} catch (NumberFormatException e) {
			e.printStackTrace();
			
		} catch (RemoteException e) {
			e.printStackTrace();
		}
		
		if (test == true) {
			System.out.println(String.valueOf("Mernis doğrulama başarılı..."));
		
		} else {
			System.out.println("Mernis doğrulaması geçersiz...");
		}

		return test;
		
	}

}
