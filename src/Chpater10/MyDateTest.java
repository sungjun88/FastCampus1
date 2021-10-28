package Chpater10;


class MyDate{
	int day;
	int month;
	int year;
	
	public MyDate(int day,int month,int year) {
		this.day = day;
		this.month = month;
		this.year = year;
		
	}
	
	@Override
	public boolean equals(Object object) {
		if(object instanceof MyDate) {
			MyDate mydate = (MyDate)object;
			if(this.day==mydate.day && this.month==mydate.month && this.year==mydate.year) {
				return true;
			}
		}
		return false;
	}
	
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return year*10000+month*100+day; 
	}
}
public class MyDateTest {

	public static void main(String[] args) {
		MyDate mydate1 = new MyDate(10, 12, 1988);
		MyDate mydate2 = new MyDate(12, 8, 1998);
		
		
		System.out.println(mydate1.equals(mydate2));
		System.out.println(mydate1.hashCode());
		System.out.println(mydate2.hashCode());
	}
}
