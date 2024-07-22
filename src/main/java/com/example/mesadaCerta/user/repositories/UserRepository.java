package com.example.mesadaCerta.user.repositories;

import com.example.mesadaCerta.user.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.List;

public interface UserRepository extends CrudRepository<User, String>, PagingAndSortingRepository<User, String> {
    List<User> findAllByActiveTrue();
}
