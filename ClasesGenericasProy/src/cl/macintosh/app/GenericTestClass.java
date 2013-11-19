package cl.macintosh.app;

//definicion de una clase generica para su uso y comprension.

public class GenericTestClass<T> {
	
	public T objetoGenerico;
	
	public GenericTestClass(T Objeto)
	{
		this.objetoGenerico = Objeto;
	}

	public T getObjetoGenerico() {
		return objetoGenerico;
	}

	public void setObjetoGenerico(T objetoGenerico) {
		this.objetoGenerico = objetoGenerico;
	}
	
	public void imprimir()
	{
		System.out.println(this.objetoGenerico.toString());
	}
}
