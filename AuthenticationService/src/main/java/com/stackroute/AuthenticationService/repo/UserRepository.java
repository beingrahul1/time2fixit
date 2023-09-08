package  com.stackroute.AuthenticationService.repo;


import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.stackroute.AuthenticationService.model.User;


@Repository
public interface UserRepository extends JpaRepository<User,String> {
    User findByEmail(String emial);
    
//   public User findByEmailAndSecQuestionAndSecAnswer(String email,String secQuestion,String secAnswer);

}
