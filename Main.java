package oopWithNLayeredApp;

import oopWithNLayeredApp.Business.ProductManager;
import oopWithNLayeredApp.Core.loging.DtabaseLogger;
import oopWithNLayeredApp.Core.loging.FileLoger;
import oopWithNLayeredApp.Core.loging.Logger;
import oopWithNLayeredApp.Core.loging.MailLogger;
import oopWithNLayeredApp.DataAccess.HibernateProductDao;
//import oopWithNLayeredApp.DataAccess.JdbcProductDao;
import oopWithNLayeredApp.Entities.Product;

public class Main {

	public static void main(String[] args) throws Exception {
		Product product = new Product(1,"IPhone Xr",10000);
		
		Logger[] loggers = {new DtabaseLogger(), new FileLoger(), new MailLogger()}; 
		
		ProductManager productManager = new ProductManager(new HibernateProductDao(), loggers);
		productManager.add(product);
		

	}

}
