//Person.java
public class Person {
	// composition has-a relationship
	private Job job;
	private Education education;
	private String school;

	public Person() {
		this.job = new Job();
		this.education = new Education();
		job.setSalary(1000L);
	}

	public long getSalary() {
		return job.getSalary();
	}

	public void setSchools(String school, int i) {
		education.setSchools(school, i);
	}

	public String toString() {
		return education.toString() + "\n" + job.toString();
	}

	public int educationLength() {
		return education.schoolsLength();
	}

	public String getSchool(int i) {
		return education.getSchools(i);
	}
}