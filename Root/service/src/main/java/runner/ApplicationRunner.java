package runner;

import service.UserService;

public class ApplicationRunner {
	
	public ApplicationRunner() {
		
	}
	
	public static void main(String[] args) {
		UserService userService = new UserService();
		System.out.println("Hello world");
	}
}
