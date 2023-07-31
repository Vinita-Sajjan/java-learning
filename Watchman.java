Watchman{
public static void main(String[] args){}
public Gun gun=new Gun();

 public void secure(){
	 
	 System.ou.println("invoking secure in Watchman");
	 if(gun!=null)
	 {
		 System.out.println(this.gun.shoot);
	 }
	 else
	 {
		 System.out.println(Gun is null,it not access the method);
	 }	 
 }

}