package idusw.springboot.egymall.serivce;

import org.springframework.stereotype.Service;

@Service
public class HomeServiceImpl3 implements HomeService {

    @Override
    public void sayHello() {
        for(int i=0; i<3; i++)
            System.out.println("service - say hello");
    }
}
