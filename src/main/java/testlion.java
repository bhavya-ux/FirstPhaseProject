
public class testlion 
{
	public static void main(String[] args)
	{
		//create an instance(object) of lion
		lion mylion = new lion();
		//access the member of mylion object.member
		//mylion.weight = 10; compiler error - weight is private
		mylion.setweight(10);
		
		System.out.println("the weight of the lion is " + mylion.getweight());
	}

}
