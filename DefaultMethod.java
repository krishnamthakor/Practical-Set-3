interface DefaultMethod
{
	abstract public void abs();
	default void def()
	{
		System.out.println("In default method");
	}
}