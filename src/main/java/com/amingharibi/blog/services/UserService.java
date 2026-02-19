package com.amingharibi.blog.services;

import com.amingharibi.blog.domain.entities.User;

import java.util.UUID;

public interface UserService {
    User getUserById(UUID id);
}
