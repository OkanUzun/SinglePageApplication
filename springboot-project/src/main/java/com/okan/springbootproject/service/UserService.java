package com.okan.springbootproject.service;

import com.okan.springbootproject.domain.User;

import java.util.List;
import java.util.Optional;

/**
 * @author Okan UZUN
 * @date 30.12.2018
 */
public interface UserService {
    User create(final User user);
    Optional<User> findById(final long id);
    User update(final User user);
    Optional<User> delete(final long id);
    List<User> findAll();
}
