package oopWithNLayeredApp.DataAccess;

import oopWithNLayeredApp.Entities.Product;

public class HibernateProductDao implements ProductDao {

	public void add(Product product) {
		//sadece db erişim kodları buraya yazılır.SQL bilinmeli
		System.out.println("Hibernate ile veritabanına eklendi");
	}
	

}
