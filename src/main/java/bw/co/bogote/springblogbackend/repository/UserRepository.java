package bw.co.bogote.springblogbackend.repository;

import bw.co.bogote.springblogbackend.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
