class Laboratoryrunner
{
	public static void main(String args[])
	{
		String name="bio";
		String location="last floor";
	     int noOfrooms=9;
		 LabType type=LabType.CIVIL;
		 String [] operatorsname={"as","dg"};
		Laboratory lab=new Laboratory(name,location,noOfrooms,type,operatorsname);
		System.out.println(lab.name);
	    System.out.println(lab.location);
		System.out.println(lab.noOfrooms);
		System.out.println(lab.operatorsname[0]);
		System.out.println(lab.type);
	}
}