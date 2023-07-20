class Mall{
	String name;
	String location;
	int stores;
	int doors;
	int floors;
	boolean pvr;
	float rating;
	Mall()
	{
		System.out.println("invoking main in no arg in mall");
	}
	Mall(String name)
	{
		this();
		System.out.println("invoking main in name in mall");
		this.name=name;
	}
	Mall(String name,String loaction)
	{
		this(name);
		System.out.println("invoking main in name,loaction in mall");
		this.location=location;
		
	}
	Mall(String name,String location,int stores)
	{
		this(name,location);
		System.out.println("invoking main in name,location,stores in mall");
		this.stores=stores;
		
	}
	Mall(String name,String location,int stores,int doors)
	{
		this(name,location,stores);
		System.out.println("invoking main in name,location,stores,doors in mall");
		this.doors=doors;
		
	}
	Mall(String name,String location,int stores,int doors,int  floors)
	{
		this(name,location,stores,doors);
		System.out.println("invoking main in name,location,stores,doors,floors in mall");
		this.floors=floors;
		
	}
	Mall(String name,String location,int stores,int doors,int  floors,boolean pvr)
	{
		this(name,location,stores,doors,floors);
		System.out.println("invoking main in name,location,stores,doors,floors,pvr in mall");
		this.pvr=pvr;
		
	}
	Mall(String name,String location,int stores,int doors,int  floors,boolean pvr,float rating)
	{
		this(name,location,stores,doors,floors,pvr);
		System.out.println("invoking main in name,location,stores,doors,floors,pvr,rating in mall");
		this.rating=rating;
		
	}
}