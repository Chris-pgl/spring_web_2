package api_rest_2.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import api_rest_2.demo.entity.Role;
import api_rest_2.demo.repo.RoleRepo;

@Service
public class RoleService {
  
    @Autowired
    RoleRepo repo;

   public List<Role> getAllRoles(){
    return repo.findAll();
   }

   public Optional<Role> getRolebyID(int id){
    return repo.findById(id);
   }

   public void saveRole(Role e){
    repo.save(e);
   }

   public void delteRole(Role e){
    repo.delete(e);
   }
    
}
