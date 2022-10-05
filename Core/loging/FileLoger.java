package oopWithNLayeredApp.Core.loging;

public class FileLoger  implements Logger {
	@Override
	public void log(String data) {
		System.out.println("Dosyaya loglandı : "+ data);
		
	}

}
