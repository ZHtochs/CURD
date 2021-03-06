package com.imooc.controller;

import com.imooc.Repository.HeroRepository;
import com.imooc.domain.Hero;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class HeroController {
    @Autowired
    HeroRepository heroRepository;

    //添加
    @RequestMapping(value = "/addHero")
    public String login(Hero hero) {
        heroRepository.save(hero);
        return "redirect:listHero";
    }

    //列表
    @GetMapping(value = "/listHero")
    public String listHero(Model model) {
        model.addAttribute("listHero", heroRepository.findAll());
        return null;
    }

    //更新
    @RequestMapping(value = "/updateHero")
    public String updateHero(@RequestParam("id") int id, Hero hero) {
        heroRepository.save(hero);

        return "updateHero";
    }

    //删除
    @RequestMapping(value = "/deleteHero")
    public String deleteHero(@RequestParam("id") int id ) {
        heroRepository.delete(id);
        return "redirect:listHero";
    }

}
