class Wood{
        String type;
		double cost;
		int weightInKGs;
		String strength;
		boolean smellsGood;
		
		Wood(String type)
		{
			this.type=type;
			System.out.println("invoking String costc of Wood");
			System.out.println(type);
		}
		Wood(String type,double cost)
		{
			this(type);
			this.cost=cost;
			System.out.println("invoking String,double costc of Wood");
		}
		Wood(String type,double cost,int weightInKGs)
		{
			this(type,cost);
			this.weightInKGs=weightInKGs;
			System.out.println("invoking String,double,int costc of Wood");
		}
		Wood(String type,double cost,int weightInKGs,String strength)
		{
			this(type,cost,weightInKGs);
			this.strength=strength;
			System.out.println("invoking String,double,int,string costc of Wood");
		}
		Wood(String type,double cost,int weightInKGs,String strength,boolean smellsGood)
		{
			this(type,cost,weightInKGs,strength);
			this.smellsGood=smellsGood;
			System.out.println("invoking String,double,int,string,boolean costc of Wood");
		}
		
}