package com.silvee.repo;

import com.silvee.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * CrudRepository – provides basic crud functionalities.
 * JpaRepository – provides JPA related functionalities such as persist, flush, batch delete.
 * PagingAndSortingRepository – provides additional functionalities such as paging and sorting.
 */
@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}