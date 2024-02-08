package com.java.assi6;

public class UserManager implements UserRepository {
	
	   private static UserManager instance;
	   
	   private UserManager() {}
	   
	   public static synchronized UserManager getInstance() {
	        if (instance == null) {
	            instance = new UserManager();
	        }
	        return instance;
	    }

	@Override
	public User getUserByUsername(String username) {
		// TODO Auto-generated method stub
		return new User(username, "Jite@example.com");
	}

	@Override
	public void saveUser(User user) {
		// TODO Auto-generated method stub
        System.out.println("User saved: " + user.getUsername() + ", " + user.getEmail());

		
	}

	@Override
	public void deleteUser(String username) {
		// TODO Auto-generated method stub
        System.out.println("User deleted: " + username);

		
	}

}
