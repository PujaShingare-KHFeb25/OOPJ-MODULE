public class GreetUser {

	public static void main(String[] args) {
		String str=args[0];
		if(args.length>0)
		{
			System.out.println("Hello"+args[0]+"!");
		}else
		{
			
			System.out.println("Hello,Guest");
		}

	}

}
