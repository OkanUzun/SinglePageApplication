package com.okan.springbootproject.service.impl;

import com.okan.springbootproject.domain.User;
import com.okan.springbootproject.repository.UserRepository;
import com.okan.springbootproject.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

/**
 * @author Okan UZUN
 * @date 30.12.2018
 */
@Service
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    @Autowired
    public UserServiceImpl(final UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public User create(final User user) {
        return userRepository.save(user);
    }

    public Optional<User> findById(final long id) {
        return userRepository.findById(id);
    }

    @Override
    public User update(final User user) {
        return userRepository.save(user);
    }

    public Optional<User> delete(final long id) {
        final Optional<User> user = userRepository.findById(id);
        userRepository.deleteById(id);
        return user;
    }

    @Override
    public List<User> findAll() {
        return (List<User>) userRepository.findAll();
    }
}
