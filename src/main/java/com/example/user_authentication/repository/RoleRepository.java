package com.example.user_authentication.repository;


import com.example.user_authentication.entity.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository  // e o adnotare in plus fiindca oricum Interfata mea e un bean!
public interface RoleRepository extends JpaRepository<Role, Long> {
    Role findByName(String name);
}
