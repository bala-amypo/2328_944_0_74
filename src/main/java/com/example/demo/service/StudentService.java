package com.example.project.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.example.demo.entity.StudentEntity;

@Service
public class StudentService {
    Map<Integer,StudentEntity>mp=new HashMap<>();
       
  public StudentEntity savedata(StudentEntity st){
    mp.put(st.getId(), st);
    return st;
  }

  public List<StudentEntity> retdata() {
    return new ArrayList<>(mp.values());
  }

  public StudentEntity id(int id) {
   return mp.get(id);
  }

  public StudentEntity update(int id, StudentEntity st) {
  mp.replace(id, st);
  return st;
  }

  public StudentEntity deletes(int id, StudentEntity st){
     mp.remove(id,st);
    return st;
  }
    
}