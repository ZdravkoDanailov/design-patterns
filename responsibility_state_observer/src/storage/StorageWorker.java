package storage;

import employee.Employee;
import interfaces.EmployeeObservable;
import interfaces.EmployeeObserver;

public class StorageWorker implements EmployeeObserver{

	protected EmployeeObservable employee;

	@Override
	public void update() {
		((Employee) employee).setStatus(Employee.READY_STATUS);
		System.out.println("Shipment is in storage!");
		System.out.println(((Employee) employee).getName() + " is now free to process more shipments");
	}

	@Override
	public void setEmployee(EmployeeObservable emp) {
		this.employee = emp;
	}

}
