package cl.macintosh.app;

public class Main {
	public static void main(String[] args)
	{
		GenericTestClass<String> claseGenerica = new GenericTestClass<String>("Guillermo Olivares");
		GenericTestClass<Integer> claseGenerica2 = new GenericTestClass<Integer>(1345);
		
		claseGenerica.imprimir();
		claseGenerica2.imprimir();
		
	}
}
