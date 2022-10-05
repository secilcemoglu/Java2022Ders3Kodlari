package oopWithNLayeredApp.Business;

//import java.util.List;
//import java.util.ListIterator;

import oopWithNLayeredApp.Core.loging.Logger;
//import oopWithNLayeredApp.DataAccess.HibernateProductDao;
import oopWithNLayeredApp.DataAccess.ProductDao;
//import oopWithNLayeredApp.DataAccess.JdbcProductDao;
import oopWithNLayeredApp.Entities.Product;

public class ProductManager {
	private ProductDao productDao;
	private Logger[] loggers;
	
	public ProductManager(ProductDao productDao, Logger[] loggers) {
		this.productDao = productDao;
		this.loggers = loggers;
	}

	public void add(Product product) throws Exception {
		//iş kuralları BUSİNESS RULES
		if(product.getUnitPrice()<10) {
			throw new Exception("Ürurn fiyatı 10 dan küçük olamaz");
		}
		
		productDao.add(product);
		
		for(Logger logger : loggers) {//[db, mail]
			logger.log(product.getName());
			
		}
	}

}
