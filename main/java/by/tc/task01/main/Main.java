package by.tc.task01.main;

import static by.tc.task01.entity.criteria.SearchCriteria.*;

import java.util.List;

import by.tc.task01.entity.Appliance;
import by.tc.task01.entity.criteria.Criteria;
import by.tc.task01.service.ApplianceService;
import by.tc.task01.service.ServiceException;
import by.tc.task01.service.ServiceFactory;

//// в общем я несколько раз переделывал валидатор, пробовал try catch написать, в итоге понял что всё сломал и посмотрел чью-то идею... 

//// с дао почти тоже самое

public class Main {

	public static void main(String[] args) throws ServiceException {
		List<Appliance> technich;

		ServiceFactory factory = ServiceFactory.getInstance();
		ApplianceService service = factory.getApplianceService();

		Criteria criteriaOven = new Criteria(Oven.class.getSimpleName());

		technich = service.find(criteriaOven);

		Criteria criteriaApp = new Criteria();
		criteriaApp.add("BATTERY_CAPACITY", 3);
		criteriaApp.add("DISPLAY_INCHES", 14);

		technich = service.find(criteriaApp);
		PrintApplianceInfo.print(technich);

	}

}