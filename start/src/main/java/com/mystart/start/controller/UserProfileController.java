package com.mystart.start.controller;

import com.mystart.start.demo.UserProfile;
import com.mystart.start.demo.mapper.UserProfileMapper;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
public class UserProfileController {

    private UserProfileMapper mapper;

    public UserProfileController(UserProfileMapper mapper) {
        this.mapper = mapper;
    }


    /** 사용자 정보 id로 조회 */
    @GetMapping("/user/{id}")
    public UserProfile getUserProfile(@PathVariable("id") String id) {
        return mapper.getUserProfile(id);
    }

    /** 사용자 정보 LIST 형태로 조회 */
    @GetMapping("/user/all")
    public List<UserProfile> getUserProfileList() {
        return mapper.getUserProfileList();
    }

    /** 사용자 정보 생성 */
    @PutMapping("/user/{id}")
    public void putUserProfile(@PathVariable("id") String id, @RequestParam("name") String name, @RequestParam("phone") String phone, @RequestParam("address") String address) {
        mapper.insertUserProfile(id, name, phone, address);
    }

    /** 사용자 정보 수정 */
    @PostMapping("/user/{id}")
    public void postUserProfile(@PathVariable("id") String id, @RequestParam("name") String name, @RequestParam("phone") String phone, @RequestParam("address") String address) {
        mapper.updateUserProfile(id, name, phone, address);
    }

    /** 사용자 정보 삭제 */
    @DeleteMapping("/user/{id}")
    public void deleteUserProfile(@PathVariable("id") String id) {
        mapper.deleteUserProfile(id);
    }
}
