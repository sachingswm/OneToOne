package com.example.onetoone.controllers;

import com.example.onetoone.entities.bidirectional.Human;
import com.example.onetoone.entities.jointable.Employee;
import com.example.onetoone.entities.sharedprimarykey.User;
import com.example.onetoone.entities.unidirectional.Computer;
import com.example.onetoone.repositories.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PostController {
    @Autowired
    private ComputerDao computerDao;

    @Autowired
    private HumanDao humanDao;

    @Autowired
    private EmployeeDao employeeDao;

    @Autowired
    private UserDao userDao;

    @PostMapping("/postComputer")
    public Computer postComputer(@RequestBody Computer computer)
    {
        computerDao.save(computer);
        return computer;
    }

    @PostMapping("/postHuman")
    public Human postHuman(@RequestBody Human human)
    {
        humanDao.save(human);
        return human;
    }

    @PostMapping("/postEmployee")
    public Employee postEmployee(@RequestBody Employee employee)
    {
        employeeDao.save(employee);
        return employee;
    }

    @PostMapping("/postUser")
    public User postUser(@RequestBody User user)
    {
        userDao.save(user);
        return user;
    }

}
