package com.example.springreddit.repository;

import com.example.springreddit.model.Subreddit;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SubbredditRepository extends JpaRepository<Subreddit, Long> {

}
