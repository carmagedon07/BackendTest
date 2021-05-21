package com.api.backend.APITestService;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    public List<User> getStudents(){
        return List.of(
                new User(
                        1L,
                        "pepe07",
                        123,
                        "Admin"

                )
        );
    }
}
