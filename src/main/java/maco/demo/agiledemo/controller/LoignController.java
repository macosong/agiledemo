package maco.demo.agiledemo.controller;

import maco.demo.agiledemo.domain.User;
import maco.demo.agiledemo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * LoginController
 *
 * @author: songqiang
 * @date: 2019/12/21
 */
@Controller
public class LoignController {
    @Autowired
    private UserService userService;

    @RequestMapping("/login")
    public String login(Model model){
        User admin = userService.getAdmin();
        model.addAttribute("name", admin.getName());
        return "welcome";
    }
}
