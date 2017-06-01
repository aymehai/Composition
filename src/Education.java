//Education.java
public class Education {

	private String[] schools = new String[20];

	public String getSchools(int i) {

		System.out.println(schools[i]);

		return " ";
	}

	public void setSchools(String schools, int i) {
		this.schools[i] = schools;
	}

	public String toString() {

		for (int lastTen = schools.length - 10; lastTen < schools.length; lastTen++) {
			System.out.print(schools[lastTen] + ", ");
		}
		return " ";
	}

	public int schoolsLength() {
		return schools.length;
	}

}
