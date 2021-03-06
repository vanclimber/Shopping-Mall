package net.suncaper.springboot.controller;

import net.suncaper.springboot.domain.Address;
import net.suncaper.springboot.domain.Product;
import net.suncaper.springboot.domain.Shoppingcart;
import net.suncaper.springboot.domain.User;
import net.suncaper.springboot.service.AddressService;
import net.suncaper.springboot.service.AdminService;
import net.suncaper.springboot.service.ShoppingcartService;
import net.suncaper.springboot.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;


@Controller
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;
    @Autowired
    private AdminService adminService;
    @Autowired
    private AddressService addressService;
    @Autowired
    private ShoppingcartService shoppingcartService;

    @GetMapping("/search")    //跳转至userList页面展示查询用户表t_user中的所有元组
    public String goUserListPage(HttpServletRequest request,
                                 HttpServletResponse response,
                                 Model model) {
        model.addAttribute("users", userService.listUser());
        return "userList";
    }

    @GetMapping("/add")       //跳转到注册界面user-add
    public String goUserAddPage(Model model) {
        model.addAttribute("user", new User());
        model.addAttribute("isNameExist",false);
        model.addAttribute("isPasswordEqual",true);
        return "user-add";
    }

    @PostMapping("/add")     //在注册界面提交表单后将数据写入数据库，成功则跳转到登录页面login，失败则注册界面
    public String saveUser(User user ,String secondpassword, Model model) {
        if(user.getPassword().equals(secondpassword)==false){
            model.addAttribute("isNameExist",false);
            model.addAttribute("isPasswordEqual",false);
            return "user-add";
        }
        else {
            model.addAttribute("isPasswordEqual",true);
            if(userService.saveUser(user)==true){
                return "redirect:/user/login";
            }
            else {
                model.addAttribute("isNameExist",true);
                return "user-add";
            }
        }
    }

    @GetMapping("/exitlogin")//用户退出登录
    public String exitLogin(HttpServletRequest request){
        request.getSession().setAttribute("USER_ID",null);
        return "redirect:/user/index";
    }

    @GetMapping("/login")   //跳转到登录页面login
    public String goLoginPage(Model model) {
        model.addAttribute("user", new User());
        model.addAttribute("havewrong",false);
        return "login";
    }

    @PostMapping("/login")   //在登录页面提交表单后判断用户名、密码是否正确
    public String goIndexPage(HttpServletRequest request,User user,Model model) {
        User loginUser=userService.login(user);
        if (loginUser!=null) {
            request.getSession().setAttribute("USER_ID", loginUser.getId());
            request.getSession().setAttribute("USER_name", loginUser.getName());
            request.getSession().setAttribute("CART_num",shoppingcartService.selectByUserID(loginUser.getId()).size());
            return  "redirect:/user/index";
        }
        else {
            model.addAttribute("havewrong",true);
            return  "login";

        }
    }
    @GetMapping("/index")    //主页
    public String goIndexPage() {
        return "index";
    }

    @GetMapping("/userInfo")//用户界面
    public String goUserInfoPage(HttpServletRequest request,Model model){
        User user=userService.findUserByPrimaryKey((String) request.getSession().getAttribute("USER_ID"));
        user.setPassword("");
        List<Address> address=addressService.selectByTUID(user.getId());
        model.addAttribute("user",user);
        model.addAttribute("addresses",address);
        model.addAttribute("addaddress",new Address());
        return "userInfo";
    }

    @PostMapping("/addAddress")//添加地址
    public String addAddressInfo(HttpServletRequest request, Address addaddress){
        String tuid= (String) request.getSession().getAttribute("USER_ID");
        if (tuid!=null){
            addaddress.settUId(tuid);
            addressService.saveAddress(addaddress);
            return "redirect:/user/userInfo";
        }
        else
            return "redirect:/user/userInfo";

    }

    @PostMapping("/deleteAddress")//删除地址
    public String deleteAddressInfo(String id){
        addressService.deleteById(id);
        return "redirect:/user/userInfo";
    }
    @PostMapping("/editAddress")//编辑地址
    public String editAddressInfo(Address address, HttpServletRequest request){
        addressService.upDateById(address);
        return "redirect:/user/userInfo";
    }

    @RequestMapping("/searchproduct") //搜索结果界面
    public String goSearchProductResultPage(String keyword, Model model){
        model.addAttribute("productsList",adminService.getProductsListByName(keyword));
        model.addAttribute("keyword",keyword);
        return "searchproduct";
    }

    @PostMapping("/editPassword")//修改密码
    public String editPasswordInfo(User user,String newpassword,String checkedpassword,Model model,HttpServletRequest request){
        User userExam= userService.login(user);
            if((userExam!=null)&&newpassword.equals(checkedpassword)){
                userExam.setPassword(newpassword);
                userService.upDateById(userExam);
                request.getSession().setAttribute("USER_ID",null);
                return "redirect:/user/login";
            }
        else
            return "redirect:/user/userInfo";
    }
    @PostMapping("/editUserInfo")//修改用户个人信息
    public String editUserInfo(User user){
        userService.upDateById(user);
        return "redirect:/user/userInfo";
    }


    @GetMapping("/delete")   //delete
    @ResponseBody
    public Boolean deleteUser(@RequestParam("id") String id) {  //在search页面删除一个用户
        userService.deleteUserById(id);
        return true;
    }

    @GetMapping("/edit")    //edit
    public String goUserEditPage(@RequestParam("id") String id, Model model) {
        User user = userService.findUserByPrimaryKey(id);
        model.addAttribute("user", user);
        return "user-add";
    }

    @GetMapping("/select")   //select
    @ResponseBody
    public User selectUser(@RequestParam("id") String id) {  //在search页面查找一个用户
        User selectu=userService.findUserByPrimaryKey(id);
        return selectu;
    }

}