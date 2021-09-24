class Hospitalsrunnner
{
public static void main(String args[])
{
String hname="appollo";
String loc="banglore";
String own="mahesh";
int no=15;
Hospitals ref=new Hospitals(hname,loc,own,no);
System.out.println(ref.name+"/n"+ref.location+"/n"+ref.owner+"/n"+ref.noofbeds);
}
}