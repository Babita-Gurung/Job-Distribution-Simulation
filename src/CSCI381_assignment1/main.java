//Babita Gurung 
//EMPL ID : 23710069
/*
 * Program one
Five nodes are in a row, each can be considered a state of the job.  
Five  jobs move from one node to the next and then back to the first.  
The jobs start in node one at time zero and stay there for a random amount of time based 
on a uniform 0-100 distribution before moving on. Same is true for all the other nodes.
This continues.  We think that after a long time, the probability of seeing a  job in  
any node should be equally probable. Check the system (where the jobs are) every
500time units. Output these results and run the system for 10000 time units to see if
 the jobs become more evenly distributed in the five nodes.
General logic
Clock variable updated each time through a loop to the smallest time (move) of the five
 jobs.
This job moves to the next node and the time it will next move is updated and put back
 on the list of jobs.
 */
package CSCI381_assignment1;

import java.util.Random;

public class main {

	public static void main(String[] args) {

		int clock = 0;

		Random r = new Random();
		job j1 = new job();
		job j2 = new job();
		job j3 = new job();
		job j4 = new job();
		job j5 = new job();

		job[] j = { j1, j2, j3, j4, j5 };

		// Setting JOB names
		j[0].set_job_no("JOB 1");
		j[1].set_job_no("JOB 2");
		j[2].set_job_no("JOB 3");
		j[3].set_job_no("JOB 4");
		j[4].set_job_no("JOB 5");

		// initially all the job start from same node
		j[0].set_current_node(0);
		j[1].set_current_node(0);
		j[2].set_current_node(0);
		j[3].set_current_node(0);
		j[4].set_current_node(0);

		// then all the jobs at state 1 generate ramdom time unit
		// r.nextInt generates random no from 0-100
		j[0].set_time_remaining(r.nextInt(101));
		j[1].set_time_remaining(r.nextInt(101));
		j[2].set_time_remaining(r.nextInt(101));
		j[3].set_time_remaining(r.nextInt(101));
		j[4].set_time_remaining(r.nextInt(101));

		int min = j[0].get_time_remaining();
		int count = 0; // used for outputting the information of first 15 clock changes

		int time_unit_checker = 0;// used for outputting the information after every 500 time units

		while (clock <= 10000) {

			min = j[0].get_time_remaining();// resetting the min because we have find the new min again
			for (int i = 0; i < 5; i++) {

				if (min > j[i].get_time_remaining())
					min = j[i].get_time_remaining();
			}

			if (min == j[0].get_time_remaining()) {

				j[0].set_current_node((j[0].get_current_node() + 1) % 5);
				j[0].set_time_remaining(r.nextInt(101));// generating a new time unit for JOB 1 when it moves to a next
														// node

				// updating the time unit for other jobs
				j[1].set_time_remaining(j[1].get_time_remaining() - min);

				j[2].set_time_remaining(j[2].get_time_remaining() - min);

				j[3].set_time_remaining(j[3].get_time_remaining() - min);

				j[4].set_time_remaining(j[4].get_time_remaining() - min);
				
				if (count<15) {
					System.out.print(count+1);
					System.out.println(" clock change.");
					System.out.println("Clock = "+clock+" time units");
					

					System.out.print(j[0].get_job_no() + " is in node ");
					System.out.println(j[0].get_current_node()+1);
					System.out.println("Time of next node change for "+j[0].get_job_no()+" is "+j[0].get_time_remaining());
					
					System.out.print(j[1].get_job_no() + " is in node ");
					System.out.println(j[1].get_current_node()+1);
					System.out.println("Time of next node change for "+j[1].get_job_no()+" is "+j[0].get_time_remaining());
					
					System.out.print(j[2].get_job_no() + " is in node ");
					System.out.println(j[2].get_current_node()+1);
					System.out.println("Time of next node change for "+j[2].get_job_no()+" is "+j[2].get_time_remaining());
					
					System.out.print(j[3].get_job_no() + " is in node ");
					System.out.println(j[3].get_current_node()+1);
					System.out.println("Time of next node change for "+j[3].get_job_no()+" is "+j[3].get_time_remaining());
					
					System.out.print(j[4].get_job_no() + " is in node ");
					System.out.println(j[4].get_current_node()+1);
					System.out.println("Time of next node change for "+j[4].get_job_no()+" is "+j[4].get_time_remaining());
					System.out.println();
					System.out.println();
							}

			}

			else if (min == j[1].get_time_remaining()) {

				j[1].set_current_node((j[1].get_current_node() + 1) % 5);
				j[1].set_time_remaining(r.nextInt(101));// generating a new time unit for JOB 2 when it moves to a next
														// node

				// updating the time unit for other jobs
				j[0].set_time_remaining(j[0].get_time_remaining() - min);

				j[2].set_time_remaining(j[2].get_time_remaining() - min);

				j[3].set_time_remaining(j[3].get_time_remaining() - min);

				j[4].set_time_remaining(j[4].get_time_remaining() - min);
				
				if (count<15) {
					System.out.print(count+1);
					System.out.println(" clock change.");
					System.out.println("Clock = "+clock+" time units");
					
					
					System.out.print(j[0].get_job_no() + " is in node ");
					System.out.println(j[0].get_current_node()+1);
					System.out.println("Time of next node change for "+j[0].get_job_no()+" is "+j[0].get_time_remaining());
					
					System.out.print(j[1].get_job_no() + " is in node ");
					System.out.println(j[1].get_current_node()+1);
					System.out.println("Time of next node change for "+j[1].get_job_no()+" is "+j[1].get_time_remaining());
					
					
					System.out.print(j[2].get_job_no() + " is in node ");
					System.out.println(j[2].get_current_node()+1);
					System.out.println("Time of next node change for "+j[2].get_job_no()+" is "+j[2].get_time_remaining());
					
					System.out.print(j[3].get_job_no() + " is in node ");
					System.out.println(j[3].get_current_node()+1);
					System.out.println("Time of next node change for "+j[3].get_job_no()+" is "+j[3].get_time_remaining());
					
					System.out.print(j[4].get_job_no() + " is in node ");
					System.out.println(j[4].get_current_node()+1);
					System.out.println("Time of next node change for "+j[4].get_job_no()+" is "+j[4].get_time_remaining());
					System.out.println();
					System.out.println();
				}

			}

			else if (min == j[2].get_time_remaining()) {

				j[2].set_current_node((j[2].get_current_node() + 1) % 5);
				j[2].set_time_remaining(r.nextInt(101));// generating a new time unit for JOB 3 when it moves to a next
														// node

				// updating the time unit for other jobs
				j[0].set_time_remaining(j[0].get_time_remaining() - min);

				j[1].set_time_remaining(j[1].get_time_remaining() - min);

				j[3].set_time_remaining(j[3].get_time_remaining() - min);

				j[4].set_time_remaining(j[4].get_time_remaining() - min);
				
				if (count<15) {
					System.out.print(count+1);
					System.out.println(" clock change.");
					System.out.println("Clock = "+clock+" time units");
					
					System.out.print(j[0].get_job_no() + " is in node ");
					System.out.println(j[0].get_current_node()+1);
					System.out.println("Time of next node change for "+j[0].get_job_no()+" is "+j[0].get_time_remaining());
					
					System.out.print(j[1].get_job_no() + " is in node ");
					System.out.println(j[1].get_current_node()+1);
					System.out.println("Time of next node change for "+j[1].get_job_no()+" is "+j[1].get_time_remaining());
			
					
					System.out.print(j[2].get_job_no() + " is in node ");
					System.out.println(j[2].get_current_node()+1);
					System.out.println("Time of next node change for "+j[2].get_job_no()+" is "+j[2].get_time_remaining());
					
					System.out.print(j[3].get_job_no() + " is in node ");
					System.out.println(j[3].get_current_node()+1);
					System.out.println("Time of next node change for "+j[3].get_job_no()+" is "+j[3].get_time_remaining());
					
					System.out.print(j[4].get_job_no() + " is in node ");
					System.out.println(j[4].get_current_node()+1);
					System.out.println("Time of next node change for "+j[4].get_job_no()+" is "+j[4].get_time_remaining());
					System.out.println();
					System.out.println();
				}

			}

			else if (min == j[3].get_time_remaining()) {

				j[3].set_current_node((j[3].get_current_node() + 1) % 5);
				j[3].set_time_remaining(r.nextInt(101));// generating a new time unit for JOB 4 when it moves to a next
														// node

				// updating the time unit for other jobs
				j[0].set_time_remaining(j[0].get_time_remaining() - min);

				j[1].set_time_remaining(j[1].get_time_remaining() - min);

				j[2].set_time_remaining(j[2].get_time_remaining() - min);

				j[4].set_time_remaining(j[4].get_time_remaining() - min);
				

				if (count<15) {
					System.out.print(count+1);
					System.out.println(" clock change.");
					System.out.println("Clock = "+clock+" time units");
					
					System.out.print(j[0].get_job_no() + " is in node ");
					System.out.println(j[0].get_current_node()+1);
					System.out.println("Time of next node change for "+j[0].get_job_no()+" is "+j[0].get_time_remaining());
					
					System.out.print(j[1].get_job_no() + " is in node ");
					System.out.println(j[1].get_current_node()+1);
					System.out.println("Time of next node change for "+j[1].get_job_no()+" is "+j[1].get_time_remaining());
					
					
					System.out.print(j[2].get_job_no() + " is in node ");
					System.out.println(j[2].get_current_node()+1);
					System.out.println("Time of next node change for "+j[2].get_job_no()+" is "+j[2].get_time_remaining());
					
					System.out.print(j[3].get_job_no() + " is in node ");
					System.out.println(j[3].get_current_node()+1);
					System.out.println("Time of next node change for "+j[3].get_job_no()+" is "+j[3].get_time_remaining());
					
					System.out.print(j[4].get_job_no() + " is in node ");
					System.out.println(j[4].get_current_node()+1);
					System.out.println("Time of next node change for "+j[4].get_job_no()+" is "+j[4].get_time_remaining());
					System.out.println();
					System.out.println();
				}
			}

			else {

				j[4].set_current_node((j[4].get_current_node() + 1) % 5);
				j[4].set_time_remaining(r.nextInt(101));// generating a new time unit for JOB 5 when it moves to a next
														// node

				// updating the time unit for other jobs
				j[0].set_time_remaining(j[0].get_time_remaining() - min);

				j[1].set_time_remaining(j[1].get_time_remaining() - min);

				j[2].set_time_remaining(j[2].get_time_remaining() - min);

				j[3].set_time_remaining(j[3].get_time_remaining() - min);
				

				if (count<15) {
					System.out.print(count+1);
					System.out.println(" clock change.");
					System.out.println("Clock = "+clock+" time units");
					
					System.out.print(j[0].get_job_no() + " is in node ");
					System.out.println(j[0].get_current_node()+1);
					System.out.println("Time of next node change for "+j[0].get_job_no()+" is "+j[0].get_time_remaining());
					
					System.out.print(j[1].get_job_no() + " is in node ");
					System.out.println(j[1].get_current_node()+1);
					System.out.println("Time of next node change for "+j[1].get_job_no()+" is "+j[1].get_time_remaining());
				
					
					System.out.print(j[2].get_job_no() + " is in node ");
					System.out.println(j[2].get_current_node()+1);
					System.out.println("Time of next node change for "+j[2].get_job_no()+" is "+j[2].get_time_remaining());
					
					System.out.print(j[3].get_job_no() + " is in node ");
					System.out.println(j[3].get_current_node()+1);
					System.out.println("Time of next node change for "+j[3].get_job_no()+" is "+j[3].get_time_remaining());
					
					System.out.print(j[4].get_job_no() + " is in node ");
					System.out.println(j[4].get_current_node()+1);
					System.out.println("Time of next node change for "+j[4].get_job_no()+" is "+j[4].get_time_remaining());
					System.out.println();
					System.out.println();
				}
			}

			clock = clock + min;
			time_unit_checker = time_unit_checker + min;
			if (time_unit_checker > 500) {
				System.out.println("500 time unit has passed :");
				System.out.println("Clock = " + clock + " time units.");
				
				System.out.print(j[0].get_job_no() + " is in node ");
				System.out.println(j[0].get_current_node()+1);
				
				System.out.print(j[1].get_job_no() + " is in node ");
				System.out.println(j[1].get_current_node()+1);
				
				System.out.print(j[2].get_job_no() + " is in node ");
				System.out.println(j[2].get_current_node()+1);
				
				System.out.print(j[3].get_job_no() + " is in node ");
				System.out.println(j[3].get_current_node()+1);
				
				System.out.print(j[4].get_job_no() + " is in node ");
				System.out.println(j[4].get_current_node()+1);
				
				System.out.println();
				System.out.println();
				time_unit_checker = 0;
			}
			count=count+1;

		}

		System.out.println(":D Thank you. It was kind of fun.");

	}

}
