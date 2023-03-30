package GenericDemo;

//this is the way of define Generic class
class Box<E> {

	E container;
	
	Box(E container)
	{
		this.container = container;
	}
	public E getValue()
	{
		return container;
	}
}
