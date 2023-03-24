package br.com.rbbelem.pocket.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.rbbelem.pocket.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {
	
	public User findByEmail(String email);
}
