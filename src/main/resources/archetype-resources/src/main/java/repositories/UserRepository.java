#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.repositories;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import ${package}.domain.User;

import java.util.List;

public interface UserRepository extends CrudRepository<User, Long> {

    @Query(value = "FROM User user")
    List<User> findAllUsers();
}
