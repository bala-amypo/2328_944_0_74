package com.example.demo.newservice.newserviceimpl;

import com.example.demo.newentity.NewfileEntity;
import java.util.*;
import com.example.demo.newservice.NewfileService;;
@Service
public class NewfileServiceImpl implements NewfileService{

    private final NewfileRepo rep;

    public NewfileServiceImpl(NewfileRepo rep){
        this.rep = rep;
    }
    @Override
    public NewfileEntity savedata(NewfileEntity newfile){
        return rep.save(newfile);
    }
    @Override
    public NewfileEntity getIdvalue(Long id){
        return rep.findById(id);
    }
    @Override
    public List<NewfileEntity> getall(){
        return rep.findAll();
    }
    @Override
    public NewfileEntity update(Long id,NewfileEntity newfile){
        NewfileEntity existing = rep.findById(id).orElse(null);

        if (existing != null) {
            existing.setName(newfile.getName());
            existing.setEmail(newfile.getEmail());
            return rep.save(existing);
        }
        return null;
    }
    @Override
    public void del(Long id){
        rep.deleteById(id); 
    }
}