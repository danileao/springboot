package br.com.springboot.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import br.com.springboot.model.User;

public interface UserRepository extends JpaRepository<User, Long> {

  @Query("SELECT u from User u where u.id > :id")
  public List<User> findAllMoreThan(@Param("id") Long id);

  public List<User> findByIdGreaterThan(Long id);

  public List<User> findByNameIgnoreCase(String name);

}
