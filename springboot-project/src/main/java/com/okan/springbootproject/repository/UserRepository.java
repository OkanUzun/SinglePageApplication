package com.okan.springbootproject.repository;

import com.okan.springbootproject.domain.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * @author Okan UZUN
 * @date 30.12.2018
 */

@Repository
public interface UserRepository extends CrudRepository<User, Long> {
}
