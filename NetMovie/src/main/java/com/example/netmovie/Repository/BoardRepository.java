package com.example.netmovie.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.netmovie.Entity.Board;

public interface BoardRepository extends JpaRepository<Board, Integer>{

}
