package com.silvee.assemblers;

import com.silvee.domain.User;
import com.silvee.vo.CreateUserVO;
import com.silvee.vo.UpdateUserVO;
import com.silvee.vo.UserVO;
import org.springframework.stereotype.Component;

/**
 * Assembler is used to convert ValueObject model to the base one and vice versa
 */
@Component
public class UserAssembler {

    /**
     * CreateUserVO convert to User.
     *
     * @param createUserVO
     * @return
     */
    public User toUser(CreateUserVO createUserVO) {
        User user = new User();
        user.setFirstName(createUserVO.getFirstName());
        user.setLastName(createUserVO.getLastName());
        user.setSalary(createUserVO.getSalary());
        return user;
    }


    /**
     * User to UserVO.
     *
     * @param user
     * @return
     */
    public UserVO toUserVO(User user) {
        UserVO userVO = new UserVO();
        userVO.setUserId(user.getId());
        userVO.setFirstName(user.getFirstName());
        userVO.setLastName(user.getLastName());
        userVO.setSalary((user.getSalary()));
        return userVO;

    }

    /**
     * UpdateUserVO to user.
     *
     * @param updateUserVO
     * @return
     */
    public User toUser(UpdateUserVO updateUserVO) {
        User user = new User();
        user.setId(updateUserVO.getUserId());
        user.setFirstName(updateUserVO.getFirstName());
        user.setLastName(updateUserVO.getLastName());
        user.setSalary(updateUserVO.getSalary());
        return user;
    }
}