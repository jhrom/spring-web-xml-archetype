#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.services;

import ${package}.domain.User;

import java.util.List;

public interface UserService {

    List<User> findAllUsers();

}
