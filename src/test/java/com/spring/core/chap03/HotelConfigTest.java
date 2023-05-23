package com.spring.core.chap03;

import com.spring.core.chap03.Hotel;
import com.spring.core.chap03.config.HotelConfig;
import org.junit.jupiter.api.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class HotelConfigTest {
    // 스프링 컨테이너에 등록된 빈 가져오기
    // HotelConfig 클래스에 정의된 자료를 활용하겠다는 의미
    AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(HotelConfig.class);

    @Test
    void springDITest(){
        Hotel hotel = ac.getBean(Hotel.class);
        hotel.inform();

        //Bin에 등록되어 있지 않기 때문에 에러
//        Chef koranChef = ac.getBean(JapaneseChef.class);
//        koranChef.cook();
    }

}