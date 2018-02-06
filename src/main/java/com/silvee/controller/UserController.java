package com.silvee.controller;

import com.silvee.domain.User;
import com.silvee.repo.UserRepository;
import com.silvee.assemblers.UserAssembler;
import com.silvee.domain.User;
import com.silvee.service.UserService;
import com.silvee.vo.CreateUserVO;
import com.silvee.vo.UpdateUserVO;
import com.silvee.vo.UserVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.sql.Date;
import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserAssembler userAssembler;

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    @ResponseStatus(HttpStatus.OK)
    public UserVO getUser(@PathVariable("id") Long id) {
        return userAssembler.toUserVO(userService.getUserById(id));
    }

    @RequestMapping(method = RequestMethod.POST)
    public UserVO createUser(@Valid @RequestBody CreateUserVO createUserVO) {
        User user = userAssembler.toUser(createUserVO);
        User createdUser = userService.createUser(user);
        return userAssembler.toUserVO(createdUser);
    }

    @RequestMapping(method = RequestMethod.PUT)
    public UserVO updateUser(@RequestBody UpdateUserVO updateUserVO) {
        User user = userAssembler.toUser(updateUserVO);
        User updatedUser = userService.updateUser(user);
        return userAssembler.toUserVO(updatedUser);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public void deleteUser(@PathVariable("id") Long id) {
        userService.deleteUser(id);
    }

    @RequestMapping(value = "/all", method = RequestMethod.GET)
    @ResponseStatus(HttpStatus.OK)
    public List<User> getAllUsers() {
        return userService.getAllUsers();
    }


}
