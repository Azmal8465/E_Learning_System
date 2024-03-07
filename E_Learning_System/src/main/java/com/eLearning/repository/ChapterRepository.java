package com.eLearning.repository;

import org.springframework.data.repository.CrudRepository;
import java.util.List;
import com.eLearning.model.Chapter;

public interface ChapterRepository extends CrudRepository<Chapter, Integer>
{
	public List<Chapter> findByCoursename(String Coursename);
	
}