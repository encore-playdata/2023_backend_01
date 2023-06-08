package controller;

import domain.dto.SignupDto;
import repository.UserRepository;
import service.UserService;

import java.util.Scanner;

public class Controller {
    private static UserService service = UserService.getInstance();
    public void selectMode(){
        Scanner sc = new Scanner(System.in);
        while (true){
            System.out.println("1. 로그인 2. 회원가입");
            String mode = sc.nextLine();
            switch (mode){
                case "1":
                    login(sc);
                    break;
                case "2":
                    signup(sc);
                    break;
                case "3":
                    System.out.println(UserRepository.me);
                    break;
            }
        }

    }

    private static void login(Scanner sc) {
        System.out.println("insert id : ");
        String id = sc.nextLine();
        System.out.println("insert pw : ");
        String pw = sc.nextLine();
        service.login(id, pw);
    }

    private static void signup(Scanner sc) {
        System.out.println("insert id : ");
        String id = sc.nextLine();
        System.out.println("insert pw : ");
        String pw = sc.nextLine();
        System.out.println("insert name : ");
        String name = sc.nextLine();
        SignupDto dto = new SignupDto(id, pw, name);
        service.signup(dto);
    }
}
