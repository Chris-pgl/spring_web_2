package api_rest_2.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import api_rest_2.demo.entity.Role;

@Repository
public interface RoleRepo extends JpaRepository<Role, Integer> {
    
}
