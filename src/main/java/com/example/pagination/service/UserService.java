package com.example.pagination.service;

import com.example.pagination.domain.User;
import org.springframework.data.domain.Page;

public interface UserService {
    Page<User> gerUsers(String name,int page, int size);
}
