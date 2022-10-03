package Gson;

import com.Jack.MyBatis.Pojo.Address;
import com.Jack.MyBatis.Pojo.User;
import com.google.gson.FieldNamingStrategy;
import com.google.gson.Gson;
import org.springframework.beans.BeanUtils;

public class TestGson {
    public static void main(String[] args) {
        //Gson: obj -> json
        Address address=new Address();
        address.setCity("Taipei");
        address.setArea("大安區");
        address.setAddress("四維路19號");
        User user= new User(1,"Jack", "12345678",15,0,"qaz741@gmail.com.tw",address);
        Gson gson=new Gson();
        String s = gson.toJson(user);
        System.out.println("User:"+s);
        //Gson: json->obj
        User user1 = gson.fromJson(s, User.class);
        System.out.println("User1:"+user1.toString());

        try {
            //obj deep copy obj
            User user2 = (User) user.clone();
            user2.setPassword("987654321");
            System.out.println("User2:"+user2.toString());
            //Spring Boot Obj copy Obj
            User user4=new User();
            BeanUtils.copyProperties(user2,user4);
            user4.setUserName("Mary");
            System.out.println(user4);

        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }

        }
}
