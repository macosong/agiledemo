package maco.demo.agiledemo.domain;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * User
 *
 * @author: songqiang
 * @date: 2019/12/21
 */
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class User {
    private String name;
    private String password;
}
