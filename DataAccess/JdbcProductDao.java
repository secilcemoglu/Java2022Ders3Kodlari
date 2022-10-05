package oopWithNLayeredApp.DataAccess;

import oopWithNLayeredApp.Entities.Product;

public class JdbcProductDao implements ProductDao {
	public void add(Product product) {
		//sadece db erişim kodları buraya yazılır.SQL bilinmeli
		System.out.println("JDBC ile veritabanına eklendi");
	}

}
//Hibernate
