package oopWithNLayeredApp.Core.loging;

public class DtabaseLogger implements Logger {

	@Override
	public void log(String data) {
		System.out.println("Veritabanına loglandı : "+ data);
		
	}

}
