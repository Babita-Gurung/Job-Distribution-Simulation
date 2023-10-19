package CSCI381_assignment1;

public class job {

	String job_no;
	int current_node;
	
	int time_remaining;

	
	//getter for job_no
	public String get_job_no() {
		return job_no;
	}

	//getter for current_node
	public int get_current_node() {
		return current_node;
	}

	
	//getter for time_remaining
	public int get_time_remaining() {
		return time_remaining;
	}

	
	//setter for job_no
	public void set_job_no(String job_no) {
		this.job_no = job_no;
	}

	//setter for current_no
	public void set_current_node(int node) {
		this.current_node = node;
	}


	//setter for time_remaining
	public void set_time_remaining(int time_remaining) {
		this.time_remaining = time_remaining;
	}

}
