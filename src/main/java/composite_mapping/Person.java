package composite_mapping;

public class Person {

	private int id;
	private String name;
	public Person() {
		// TODO Auto-generated constructor stub
	}

	public void setid(int id)
	{
     this.id = id;
	}
	public int getid()
	{
		return id;

	}

     public void printperson()
     {
    	 System.out.println(id);
     }
}
