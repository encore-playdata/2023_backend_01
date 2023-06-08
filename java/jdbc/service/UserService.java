package service;

import domain.dto.SignupDto;
import repository.UserRepository;

public class UserService {
    private static UserService service;
    public static UserService getInstance(){
        if(service == null) service = new UserService();
        return service;
    }
    public boolean login(String id, String password) {
        return new UserRepository().login(id, password);
    }
    public void signup(SignupDto dto){
        new UserRepository().insertUsers(dto);
    }

}
