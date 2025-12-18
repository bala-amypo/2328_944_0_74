package com.example.demo.newservice;
import com.example.demo.newentity.NewfileEntity;
import java.util.*;
public interface NewfileService{
    NewfileEntity savedata(NewfileEntity newfile);
    NewfileEntity getIdvalue(Long id);
    List<NewfileEntity> getall();
    NewfileEntity update(Long id,NewfileEntity newfile);
    void del(Long id);
}