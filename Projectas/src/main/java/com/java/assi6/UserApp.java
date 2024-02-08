package com.java.assi6;

public class UserApp {
	public static void main(String[] args) {
        UserManager userManager = UserManager.getInstance();

        User newUser = new User("Jituu", "Jituu@example.com");

        userManager.saveUser(newUser);

        User retrievedUser = userManager.getUserByUsername("Jituu");
        System.out.println("Retrieved user: " + retrievedUser.getUsername() + ", " + retrievedUser.getEmail());

        userManager.deleteUser("Jituu");
    }


}
