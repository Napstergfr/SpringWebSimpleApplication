package com.napster.sirvices;

import com.napster.models.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserService {
    List<User> userList = new ArrayList<>();

    public List<User> getUsers() {
        return this.userList;
    }

    public void addUser(User user) {
        this.userList.add(user);
    }
}
