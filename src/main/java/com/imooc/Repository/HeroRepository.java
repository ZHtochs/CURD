package com.imooc.Repository;

import com.imooc.domain.Hero;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @program: demo
 * @author: zhuhe
 * @create: 2018-09-20 11:34
 **/
public interface HeroRepository extends JpaRepository<Hero, Integer> {
}