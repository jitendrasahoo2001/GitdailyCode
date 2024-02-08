package com.java.assi6;

public interface UserRepository {
	User getUserByUsername(String username);
    void saveUser(User user);
    void deleteUser(String username);

}
