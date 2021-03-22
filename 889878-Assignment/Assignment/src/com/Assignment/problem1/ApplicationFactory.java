
package com.Assignment.problem1;
import java.util.*;
public class ApplicationFactory {	
	public String fetchApplication(int a){
		String[] app= {"Webex","Outlook","Teams","Eclipse"};
		return app[a];
}
public void applicationDetails(String ans) {
	String[][]app1= {
			{"Webex","Online video conferencing, online meetings, screen share, and webinars."},
			{"Outlook","Outlook.com is a personal information manager web app from Microsoft consisting of webmail, calendaring, contacts, and tasks services."},
			{"Teams","Teams primarily competes with the similar service Slack, offering workspace chat and videoconferencing, file storage, and application integration."},
			{"Eclipse","Eclipse is an integrated development environment used in computer programming. It contains a base workspace and an extensible plug-in system for customizing the environment."}
	};
	
	for(int i=0;i<4;i++) {
		if(app1[i][0]==ans)
		System.out.println(app1[i][1]);
	}
}	

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int loop=1;
		do {
		System.out.println("Select an option:\n1.Webex\n2.Outlook\n3.Teams\n4.Eclipse");
		int opt=sc.nextInt();
		ApplicationFactory af=new ApplicationFactory();
		String ans=af.fetchApplication(--opt);
		af.applicationDetails(ans);
		System.out.println("To exit press 0 //Press any number to continue");
		loop=sc.nextInt();
	}while(loop!=0);
		System.out.println("!!END!!");
	}

}
